using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Reflection;
using System.Windows.Forms;
using System.Xml.Linq;
using System.Xml;
using System.Collections;
using System.Xml.Serialization;
using System.IO;

namespace BuenosAires.VentaBA
{
    public static class Util
    {
        public static T DeserializarXML<T>(string xml)
        {
            if (string.IsNullOrEmpty(xml)) return default(T);
            var serializer = new XmlSerializer(typeof(T));
            using (var reader = new StringReader(xml))
            {
                return (T)serializer.Deserialize(reader);
            }
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