using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using BuenosAires.BusinessLayer;
using BuenosAires.Model;
using System.IO;
using System.Xml.Serialization;
using Newtonsoft.Json;
using System.Xml;
using System.Net.Http;

public class ServicioProducto : IServicioProducto
{
    public Respuesta ObtenerRespuesta(BcProducto bc)
    {
        var respuesta = new Respuesta();
        respuesta.Accion = bc.Accion;
        respuesta.Mensaje = bc.Mensaje;
        respuesta.HayErrores = bc.HayErrores;
        respuesta.XmlProducto = Util.SerializarXML(bc.Producto);
        respuesta.XmlListaProducto = Util.SerializarXML(bc.Lista);
        return respuesta;
    }

    public Respuesta ValidarProducto(Producto producto)
    {
        var bc = new BcProducto();
        bc.ValidarProducto(producto);
        return ObtenerRespuesta(bc);
    }

    public Respuesta Crear(Producto producto)
    {
        var bc = new BcProducto();
        bc.Crear(producto);
        return ObtenerRespuesta(bc);
    }

    public Respuesta LeerTodos()
    {
        var bc = new BcProducto();
        bc.LeerTodos();
        return ObtenerRespuesta(bc);
    }

    public Respuesta Leer(int id)
    {
        var bc = new BcProducto();
        bc.Leer(id);
        return ObtenerRespuesta(bc);
    }

    public Respuesta Actualizar(Producto producto)
    {
        var bc = new BcProducto();
        bc.Actualizar(producto);
        return ObtenerRespuesta(bc);
    }

    public Respuesta Eliminar(int id)
    {
        var bc = new BcProducto();
        bc.Eliminar(id);
        return ObtenerRespuesta(bc);
    }

}
