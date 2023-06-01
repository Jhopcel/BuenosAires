using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using BuenosAires.Model;
using BuenosAires.BusinessLayer;

[ServiceContract]
public interface IServicioProducto
{
	[OperationContract]
	Respuesta ObtenerRespuesta(BcProducto bc);

	[OperationContract]
	Respuesta ValidarProducto(Producto producto);

	[OperationContract]
	Respuesta Crear(Producto producto);

	[OperationContract]
	Respuesta LeerTodos();

	[OperationContract]
	Respuesta Leer(int id);

	[OperationContract]
	Respuesta Actualizar(Producto producto);

	[OperationContract]
	Respuesta Eliminar(int id);
}

[DataContract]
[Serializable]
public class Respuesta
{
	[DataMember]
	public string Accion { get; set; }
	[DataMember]
	public string Mensaje { get; set; }
	[DataMember]
	public bool HayErrores { get; set; }
	[DataMember]
	public string XmlFactura { get; set; }
	[DataMember]
	public string XmlListaFactura { get; set; }
	[DataMember]
	public string XmlGuiaDespacho { get; set; }
	[DataMember]
	public string XmlListaGuiaDespacho { get; set; }
	[DataMember]
	public string XmlPerfilUsuario { get; set; }
	[DataMember]
	public string XmlListaPerfilUsuario { get; set; }
	[DataMember]
	public string XmlProducto { get; set; }
	[DataMember]
	public string XmlListaProducto { get; set; }
	[DataMember]
	public string XmlSolicitudServicio { get; set; }
	[DataMember]
	public string XmlListaSolicitudServicio { get; set; }
	[DataMember]
	public string XmlStockProducto { get; set; }
	[DataMember]
	public string XmlListaStockProducto { get; set; }
	[DataMember]
	public string JsonProducto { get; set; }
	[DataMember]
	public string JsonListaProducto { get; set; }
}
