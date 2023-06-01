using BuenosAires.BusinessLayer;
using BuenosAires.Model;
using System;
using System.Net.Http;

public class ServicioStockProducto : IServicioStockProducto
{
    public Respuesta ObtenerRespuesta(BcStockProducto bc)
    {
        var respuesta = new Respuesta();
        respuesta.Accion = bc.Accion;
        respuesta.Mensaje = bc.Mensaje;
        respuesta.HayErrores = bc.HayErrores;
        respuesta.XmlStockProducto = Util.SerializarXML(bc.StockProducto);
        respuesta.XmlListaStockProducto = Util.SerializarXML(bc.Lista);
        return respuesta;
    }

    public Respuesta ValidarStockProducto(StockProducto stockProducto)
    {
        var bc = new BcStockProducto();
        bc.ValidarStockProducto(stockProducto);
        return ObtenerRespuesta(bc);
    }

    public Respuesta Crear(StockProducto stockProducto)
    {
        var bc = new BcStockProducto();
        bc.Crear(stockProducto);
        return ObtenerRespuesta(bc);
    }

    public Respuesta LeerTodos()
    {
        var bc = new BcStockProducto();
        bc.LeerTodos();
        return ObtenerRespuesta(bc);
    }

    public Respuesta Leer(int id)
    {
        var bc = new BcStockProducto();
        bc.Leer(id);
        return ObtenerRespuesta(bc);
    }

    public Respuesta Actualizar(StockProducto stockProducto)
    {
        var bc = new BcStockProducto();
        bc.Actualizar(stockProducto);
        return ObtenerRespuesta(bc);
    }

    public Respuesta Eliminar(int id)
    {
        var bc = new BcStockProducto();
        bc.Eliminar(id);
        return ObtenerRespuesta(bc);
    }

    public Respuesta LeerTodosEnJson()
    {
        var respuesta = new Respuesta();
        respuesta.Accion = "obtener lista de productos";
        respuesta.Mensaje = "";
        respuesta.HayErrores = false;
        respuesta.JsonProducto = "";
        respuesta.JsonListaProducto = "";

        string apiUrl = "http://127.0.0.1:8000/api/obtener_equipos_en_bodega";

        try
        {
            using (HttpClient client = new HttpClient())
            {
                HttpResponseMessage response = client.GetAsync(apiUrl).Result;

                if (response.IsSuccessStatusCode)
                {
                    respuesta.JsonListaProducto = response.Content.ReadAsStringAsync().Result; // Leer la respuesta como cadena JSON
                }
                else
                {
                    respuesta.Mensaje = "No fue posible " + respuesta.Accion;
                    respuesta.HayErrores = true;
                }
            }
        }
        catch(Exception ex)
        {
            respuesta.HayErrores = true;
            respuesta.Mensaje = Util.MensajeError("No fue posible " + respuesta.Accion, ex);
        }

        return respuesta;
    }

}
