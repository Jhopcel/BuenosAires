using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using BuenosAires.Model;

namespace BuenosAires.DataLayer
{
    public class DcPerfilUsuario
    {
        public string Accion = "";
        public string Mensaje = "";
        public bool HayErrores = false;
        public PerfilUsuario PerfilUsuario = null;
        public List<PerfilUsuario> Lista = null;

        public DcPerfilUsuario()
        {
            Inicializar("");
        }

        private void Inicializar(string accion)
        {
            this.Accion = accion;
            this.Mensaje = "";
            this.HayErrores = false;
            this.PerfilUsuario = null;
            this.Lista = null;
        }

        public void Crear(PerfilUsuario perfilUsuario)
        {
            this.Inicializar($"crear el usuario con el rut '{perfilUsuario.rut}'");
            try
            {
                var bd = new base_datosEntities();
                bd.PerfilUsuario.Add(perfilUsuario);
                bd.SaveChanges();
                this.PerfilUsuario = perfilUsuario;
                bd.Dispose();
                this.Mensaje = $"El usuario con el rut '{perfilUsuario.rut}' fue creado correctamente";
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }

        public void LeerTodos()
        {
            this.Inicializar($"obtener la lista de usuarios");
            try
            {
                var bd = new base_datosEntities();
                this.Lista = bd.PerfilUsuario.ToList();
                if (this.Lista.Count == 0) this.Mensaje = "La lista de usuarios se encuentra vacía";
                bd.Dispose();
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }

        public void Leer(string rut)
        {
            this.Inicializar($"obtener el usuario con el rut '{rut}'");
            try
            {
                var bd = new base_datosEntities();
                this.PerfilUsuario = bd.PerfilUsuario.FirstOrDefault(u => u.rut == rut);
                bd.Dispose();
                if (this.PerfilUsuario == null) Mensaje = $"No fue posible {this.Accion} pues no existe en la BD";
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }

        public void Actualizar(PerfilUsuario perfilUsuario)
        {
            this.Inicializar($"actualizar el usuario con el rut '{perfilUsuario.rut}'");
            try
            {
                var bd = new base_datosEntities();
                var encontrado = bd.PerfilUsuario.FirstOrDefault(u => u.rut == perfilUsuario.rut);
                if (encontrado == null)
                {
                    this.Mensaje = $"No fue posible {this.Accion} pues no existe en la BD";
                }
                else
                {
                    Util.CopiarPropiedades(perfilUsuario, encontrado);
                    bd.SaveChanges();
                    this.PerfilUsuario = new PerfilUsuario();
                    Util.CopiarPropiedades(perfilUsuario, this.PerfilUsuario);
                    this.Mensaje = $"El usuario con el rut '{perfilUsuario.rut}' fue actualizado correctamente";
                }
                bd.Dispose();
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }

        public void Eliminar(string rut)
        {
            this.Inicializar($"eliminar el usuario con el rut '{rut}'");
            try
            {
                var bd = new base_datosEntities();
                var encontrado = bd.PerfilUsuario.FirstOrDefault(u => u.rut == rut);
                if (encontrado == null)
                {
                    this.Mensaje = $"No fue posible {this.Accion} pues no existe en la BD";
                }
                else
                {
                    bd.PerfilUsuario.Remove(encontrado);
                    bd.SaveChanges();
                    this.Mensaje = $"El usuario con el rut '{rut}' fue eliminado correctamente";
                }
                bd.Dispose();
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }
    }
}
