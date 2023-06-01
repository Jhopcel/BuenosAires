using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Reflection;
using System.Xml.Linq;
using System.Xml.Serialization;
using System.IO;
using System.Collections;
using System.Text.RegularExpressions;
using System.Xml;
using BuenosAires.Model;

public static class Util
{
    public static Type GetStaticType(object obj)
    {
        Type objType = null;

        if (obj.GetType().FullName.Contains("System.Data.Entity.DynamicProxies"))
        {
            objType = Type.GetType(obj.GetType().BaseType.FullName + ", " + obj.GetType().BaseType.Assembly);
        }
        else
        {
            objType = obj.GetType();
        }

        return objType;
    }

    public static object GetStaticObject(object obj)
    {
        var objInstance = Activator.CreateInstance(GetStaticType(obj));
        return objInstance;
    }

    public static string SerializarXML(object obj)
    {
        if (obj == null) return null;

        Type objType = GetStaticType(obj);
        var serializer = new XmlSerializer(objType);

        using (var writer = new StringWriter())
        {
            var newObj = GetStaticObject(obj);
            CopiarPropiedades(obj, newObj);
            serializer.Serialize(writer, newObj);
            string xml = writer.ToString();
            return xml;
        }
    }

    public static T DeserializarXML<T>(string xml)
    {
        if (string.IsNullOrEmpty(xml)) return default(T);
        var serializer = new XmlSerializer(typeof(T));
        using (var reader = new StringReader(xml))
        {
            return (T)serializer.Deserialize(reader);
        }
    }

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
                if (item.GetType().FullName.Contains("System.Data.Entity.DynamicProxies"))
                {
                    var newItem = Activator.CreateInstance(Type.GetType(item.GetType().BaseType.FullName + ", " + item.GetType().BaseType.Assembly));
                    CopiarPropiedades(item, newItem);
                    ((IList)objetoDestino).Add(newItem);
                }
                else
                {
                    var newItem = Activator.CreateInstance(item.GetType());
                    CopiarPropiedades(item, newItem);
                    ((IList)objetoDestino).Add(newItem);
                }
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

}