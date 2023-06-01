using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using BuenosAires.Model;
using BuenosAires.DataLayer;
using System.Text.RegularExpressions;

namespace BuenosAires.BusinessLayer
{
    public class BcPerfilUsuario
    {
        public string Accion = "";
        public string Mensaje = "";
        public bool HayErrores = false;
        public PerfilUsuario PerfilUsuario = null;
        public List<PerfilUsuario> Lista = null;

        public BcPerfilUsuario()
        {
            Inicializar("");
        }

        private void Inicializar(string accion)
        {
            this.Accion = accion;
            this.Mensaje = "";
            this.HayErrores = false;
            this.PerfilUsuario = new PerfilUsuario();
            this.Lista = new List<PerfilUsuario>();
        }

        public void CopiarPropiedades(DcPerfilUsuario dc)
        {
            this.Accion = dc.Accion;
            this.Mensaje = dc.Mensaje;
            this.HayErrores = dc.HayErrores;
            this.PerfilUsuario = dc.PerfilUsuario;
            this.Lista = dc.Lista;
        }

        public bool RetornarError(string mensaje)
        {
            this.HayErrores = true;
            this.Mensaje = mensaje;
            return false;
        }

        public static bool ValidarRut(string rut)
        {
            bool validacion = false;
            try
            {
                rut = rut.ToUpper();
                rut = rut.Replace(".", "");
                rut = rut.Replace("-", "");
                int rutAux = int.Parse(rut.Substring(0, rut.Length - 1));
                char dv = char.Parse(rut.Substring(rut.Length - 1, 1));
                int m = 0, s = 1;
                for (; rutAux != 0; rutAux /= 10)
                {
                    s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
                }
                if (dv == char.Parse((s != 0 ? (11 - s).ToString() : "0")))
                {
                    validacion = true;
                }
            }
            catch (Exception) { }
            return validacion;
        }

        static bool ValidarCorreo(string email)
        {
            string pattern = @"^([\w\.\-]+)@([\w\-]+)((\.(\w){2,3})+)$";
            Regex regex = new Regex(pattern);
            if (regex.IsMatch(email))
            {
                return true;
            }
            return false;
        }

        public bool ValidarTipoUsuario(string userType)
        {
            string[] tiposUsuariosValidos = new string[] { "Cliente", "Técnico", "Bodeguero", "Administrador" };
            if (!tiposUsuariosValidos.Contains(userType))
            {
                return false;
            }
            return true;
        }

        public bool ValidarPerfilUsuario(PerfilUsuario perfilUsuario)
        {
            if (perfilUsuario.rut.Trim() == "") return RetornarError($"El rut del usuario debe tener un valor");
            if (!ValidarRut(perfilUsuario.rut)) return RetornarError($"El rut del usuario no es válido, revise que la parte numérica y el dígito verificador estén correctos");
            if (perfilUsuario.tipousu.Trim() == "") return RetornarError($"El tipo de usuario debe tener un valor");
            if (!ValidarTipoUsuario(perfilUsuario.tipousu)) return RetornarError($"El tipo de usuario debe ser uno de los siguientes valores: Cliente, Técnico, Bodeguero o Administrador");
            if (perfilUsuario.nomusu.Trim() == "") return RetornarError($"El nombre del usuario debe tener un valor");
            if (perfilUsuario.apeusu.Trim() == "") return RetornarError($"El apellido del usuario debe tener un valor");
            if (perfilUsuario.correo.Trim() == "") return RetornarError($"El correo del usuario debe tener un valor");
            if (!ValidarCorreo(perfilUsuario.correo)) return RetornarError($"El correo del usuario no es válido");
            if (perfilUsuario.dirusu.Trim() == "") return RetornarError($"La dirección del usuario debe tener un valor");
            if (perfilUsuario.pwd.Trim() == "") return RetornarError($"La contraseña del usuario debe tener un valor");
            if (perfilUsuario.user_id <= 0) return RetornarError($"El ID del usuario debe ser un número mayor que cero");
            return true;
        }
        public void Crear(PerfilUsuario perfilUsuario)
        {
            if (ValidarPerfilUsuario(perfilUsuario) == false) return;
            var dc = new DcPerfilUsuario();
            dc.Crear(perfilUsuario);
            this.CopiarPropiedades(dc);
        }

        public void LeerTodos()
        {
            var dc = new DcPerfilUsuario();
            dc.LeerTodos();
            this.CopiarPropiedades(dc);
        }

        public void Leer(string rut)
        {
            var dc = new DcPerfilUsuario();
            dc.Leer(rut);
            this.CopiarPropiedades(dc);
        }

        public void Actualizar(PerfilUsuario perfilUsuario)
        {
            if (ValidarPerfilUsuario(perfilUsuario) == false) return;
            var dc = new DcPerfilUsuario();
            dc.Actualizar(perfilUsuario);
            this.CopiarPropiedades(dc);
        }

        public bool Eliminar(string rut)
        {
            this.Inicializar($"eliminar el usuario con el rut {rut}");
            // Antes de eliminar un usuario hay que verificar que su rut no se
            // encuentre en una de las siguiente tablas:
            // 1. Que el user_id de la tabla PerfilUsuario, asociado al rut que se desea eliminar no esté en la tabla auth_user
            // 2. Que la tabla Factura no contenga un rutcli igual al que se quiere eliminar
            // 3. Que la tabla SolicitudServicio no contenga un ruttec igual al que se quiere eliminar

            var dcPerfUsu = new DcPerfilUsuario();
            dcPerfUsu.Eliminar(rut);
            if (dcPerfUsu.HayErrores) return RetornarError(dcPerfUsu.Mensaje);
            this.CopiarPropiedades(dcPerfUsu);

            return true;
        }
    }
}
