using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Reflection;
using System.Windows.Forms;
using System.Xml.Linq;
using System.Xml.Serialization;
using System.IO;
using System.Collections;
using System.Text.RegularExpressions;
using System.Xml;

namespace BuenosAires.Model
{
    public static class Util
    {
        public static bool CopiarPropiedades(object objetoOrigen, object objetoDestino)
        {
            if (objetoOrigen == null) return false;
            Type tipo = null;
            PropertyInfo[] propiedades = null;
            tipo = objetoOrigen.GetType();
            propiedades = tipo.GetProperties();
            if (tipo.Name == "List`1")
            {
                foreach (var item in (IList)objetoOrigen)
                {
                    var newItem = Activator.CreateInstance(Type.GetType(item.GetType().BaseType.FullName + ", " + item.GetType().BaseType.Assembly));
                    CopiarPropiedades(item, newItem);
                    ((IList)objetoDestino).Add(newItem);
                }
            }
            else
            {
                foreach (PropertyInfo propiedad in propiedades)
                {
                    try
                    {
                        PropertyInfo propInfo = objetoDestino.GetType().GetProperty(propiedad.Name);
                        propInfo.SetValue(objetoDestino, propiedad.GetValue(objetoOrigen, null));
                    }
                    catch
                    {
                        /* Los valores que no se pueden asignar son ignorados */
                    }
                }
            }

            return true;
        }

        public static string PonerPuntoFinal(string texto)
        {
            texto = texto.Trim();
            if (texto != "")
            {
                if (!texto.EndsWith("."))
                {
                    return texto + ".";
                }
            }
            return texto;
        }

        public static string MensajeError(string mensajeGeneral, Exception ex)
        {
            var mensajeError = "";

            if (mensajeGeneral.Trim() != "")
            {
                mensajeError += PonerPuntoFinal(mensajeGeneral);
            }

            if (ex != null)
            {
                if (ex.Message.Trim() != "")
                {
                    if (mensajeError == "")
                    {
                        mensajeError = PonerPuntoFinal(ex.Message);
                    }
                    else
                    {
                        mensajeError += " " + PonerPuntoFinal(ex.Message);
                    }
                }

                if (ex.InnerException != null)
                {
                    if (mensajeError == "")
                    {
                        mensajeError = PonerPuntoFinal(ex.InnerException.Message);
                    }
                    else
                    {
                        mensajeError += " " + PonerPuntoFinal(ex.InnerException.Message);
                    }
                }
            }

            if (mensajeError == "")
            {
                return "ERROR: Comuníquese con el Administrador del Sistema.";
            }
            else
            {
                return mensajeError + " Comuníquese con el Administrador del Sistema.";
            }
        }

        public static void MostrarMensajeError(string mensaje)
        {
            MessageBox.Show(mensaje, "Buenos Aires", MessageBoxButtons.OK, MessageBoxIcon.Error);
        }

        public static void MostrarMensajeInformativo(string mensaje)
        {
            MessageBox.Show(mensaje, "Buenos Aires", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }

        public static void MostrarMensaje(string mensaje, bool hayErrores)
        {
            if (hayErrores)
            {
                MostrarMensajeError(mensaje);
                return;
            }
            MostrarMensajeInformativo(mensaje);
        }
    }
}