
package BuenosAires.ServiceClient.ServicioProducto;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the BuenosAires.ServiceClient.ServicioProducto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BcProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", "BcProducto");
    private final static QName _ArrayOfProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "ArrayOfProducto");
    private final static QName _Producto_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "Producto");
    private final static QName _ArrayOfFactura_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "ArrayOfFactura");
    private final static QName _Factura_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "Factura");
    private final static QName _ArrayOfGuiaDespacho_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "ArrayOfGuiaDespacho");
    private final static QName _GuiaDespacho_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "GuiaDespacho");
    private final static QName _PerfilUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "PerfilUsuario");
    private final static QName _ArrayOfSolicitudServicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "ArrayOfSolicitudServicio");
    private final static QName _SolicitudServicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "SolicitudServicio");
    private final static QName _AuthUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "auth_user");
    private final static QName _ArrayOfPerfilUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "ArrayOfPerfilUsuario");
    private final static QName _ArrayOfauthUserGroups_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "ArrayOfauth_user_groups");
    private final static QName _AuthUserGroups_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "auth_user_groups");
    private final static QName _AuthGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "auth_group");
    private final static QName _ArrayOfauthGroupPermissions_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "ArrayOfauth_group_permissions");
    private final static QName _AuthGroupPermissions_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "auth_group_permissions");
    private final static QName _AuthPermission_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "auth_permission");
    private final static QName _ArrayOfauthUserUserPermissions_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "ArrayOfauth_user_user_permissions");
    private final static QName _AuthUserUserPermissions_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "auth_user_user_permissions");
    private final static QName _DjangoContentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "django_content_type");
    private final static QName _ArrayOfauthPermission_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "ArrayOfauth_permission");
    private final static QName _ArrayOfStockProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "ArrayOfStockProducto");
    private final static QName _StockProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "StockProducto");
    private final static QName _DateTimeOffset_QNAME = new QName("http://schemas.datacontract.org/2004/07/System", "DateTimeOffset");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Respuesta_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Respuesta");
    private final static QName _ObtenerRespuestaBc_QNAME = new QName("http://tempuri.org/", "bc");
    private final static QName _ObtenerRespuestaResponseObtenerRespuestaResult_QNAME = new QName("http://tempuri.org/", "ObtenerRespuestaResult");
    private final static QName _ValidarProductoProducto_QNAME = new QName("http://tempuri.org/", "producto");
    private final static QName _ValidarProductoResponseValidarProductoResult_QNAME = new QName("http://tempuri.org/", "ValidarProductoResult");
    private final static QName _CrearResponseCrearResult_QNAME = new QName("http://tempuri.org/", "CrearResult");
    private final static QName _LeerTodosResponseLeerTodosResult_QNAME = new QName("http://tempuri.org/", "LeerTodosResult");
    private final static QName _LeerResponseLeerResult_QNAME = new QName("http://tempuri.org/", "LeerResult");
    private final static QName _ActualizarResponseActualizarResult_QNAME = new QName("http://tempuri.org/", "ActualizarResult");
    private final static QName _EliminarResponseEliminarResult_QNAME = new QName("http://tempuri.org/", "EliminarResult");
    private final static QName _StockProductoNrofac_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "nrofac");
    private final static QName _DjangoContentTypeAppLabel_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "app_label");
    private final static QName _DjangoContentTypeModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "model");
    private final static QName _DjangoContentTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "name");
    private final static QName _AuthPermissionCodename_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "codename");
    private final static QName _AuthUserEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "email");
    private final static QName _AuthUserFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "first_name");
    private final static QName _AuthUserLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "last_name");
    private final static QName _AuthUserPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "password");
    private final static QName _AuthUserUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "username");
    private final static QName _SolicitudServicioDescsol_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "descsol");
    private final static QName _SolicitudServicioEstadosol_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "estadosol");
    private final static QName _SolicitudServicioRuttec_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "ruttec");
    private final static QName _SolicitudServicioTiposol_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "tiposol");
    private final static QName _PerfilUsuarioApeusu_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "apeusu");
    private final static QName _PerfilUsuarioCorreo_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "correo");
    private final static QName _PerfilUsuarioDirusu_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "dirusu");
    private final static QName _PerfilUsuarioNomusu_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "nomusu");
    private final static QName _PerfilUsuarioPwd_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "pwd");
    private final static QName _PerfilUsuarioRut_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "rut");
    private final static QName _PerfilUsuarioTipousu_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "tipousu");
    private final static QName _GuiaDespachoEstadogd_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "estadogd");
    private final static QName _FacturaDescfac_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "descfac");
    private final static QName _FacturaRutcli_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "rutcli");
    private final static QName _ProductoDescprod_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "descprod");
    private final static QName _ProductoImagen_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "imagen");
    private final static QName _ProductoNomprod_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.Model", "nomprod");
    private final static QName _RespuestaAccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Accion");
    private final static QName _RespuestaMensaje_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Mensaje");
    private final static QName _RespuestaXmlFactura_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "XmlFactura");
    private final static QName _RespuestaXmlGuiaDespacho_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "XmlGuiaDespacho");
    private final static QName _RespuestaXmlListaFactura_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "XmlListaFactura");
    private final static QName _RespuestaXmlListaGuiaDespacho_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "XmlListaGuiaDespacho");
    private final static QName _RespuestaXmlListaPerfilUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "XmlListaPerfilUsuario");
    private final static QName _RespuestaXmlListaProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "XmlListaProducto");
    private final static QName _RespuestaXmlListaSolicitudServicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "XmlListaSolicitudServicio");
    private final static QName _RespuestaXmlListaStockProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "XmlListaStockProducto");
    private final static QName _RespuestaXmlPerfilUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "XmlPerfilUsuario");
    private final static QName _RespuestaXmlProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "XmlProducto");
    private final static QName _RespuestaXmlSolicitudServicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "XmlSolicitudServicio");
    private final static QName _RespuestaXmlStockProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "XmlStockProducto");
    private final static QName _BcProductoAccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", "Accion");
    private final static QName _BcProductoLista_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", "Lista");
    private final static QName _BcProductoMensaje_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", "Mensaje");
    private final static QName _BcProductoProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", "Producto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: BuenosAires.ServiceClient.ServicioProducto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerRespuesta }
     * 
     */
    public ObtenerRespuesta createObtenerRespuesta() {
        return new ObtenerRespuesta();
    }

    /**
     * Create an instance of {@link BcProducto }
     * 
     */
    public BcProducto createBcProducto() {
        return new BcProducto();
    }

    /**
     * Create an instance of {@link ObtenerRespuestaResponse }
     * 
     */
    public ObtenerRespuestaResponse createObtenerRespuestaResponse() {
        return new ObtenerRespuestaResponse();
    }

    /**
     * Create an instance of {@link Respuesta }
     * 
     */
    public Respuesta createRespuesta() {
        return new Respuesta();
    }

    /**
     * Create an instance of {@link ValidarProducto }
     * 
     */
    public ValidarProducto createValidarProducto() {
        return new ValidarProducto();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link ValidarProductoResponse }
     * 
     */
    public ValidarProductoResponse createValidarProductoResponse() {
        return new ValidarProductoResponse();
    }

    /**
     * Create an instance of {@link Crear }
     * 
     */
    public Crear createCrear() {
        return new Crear();
    }

    /**
     * Create an instance of {@link CrearResponse }
     * 
     */
    public CrearResponse createCrearResponse() {
        return new CrearResponse();
    }

    /**
     * Create an instance of {@link LeerTodos }
     * 
     */
    public LeerTodos createLeerTodos() {
        return new LeerTodos();
    }

    /**
     * Create an instance of {@link LeerTodosResponse }
     * 
     */
    public LeerTodosResponse createLeerTodosResponse() {
        return new LeerTodosResponse();
    }

    /**
     * Create an instance of {@link Leer }
     * 
     */
    public Leer createLeer() {
        return new Leer();
    }

    /**
     * Create an instance of {@link LeerResponse }
     * 
     */
    public LeerResponse createLeerResponse() {
        return new LeerResponse();
    }

    /**
     * Create an instance of {@link Actualizar }
     * 
     */
    public Actualizar createActualizar() {
        return new Actualizar();
    }

    /**
     * Create an instance of {@link ActualizarResponse }
     * 
     */
    public ActualizarResponse createActualizarResponse() {
        return new ActualizarResponse();
    }

    /**
     * Create an instance of {@link Eliminar }
     * 
     */
    public Eliminar createEliminar() {
        return new Eliminar();
    }

    /**
     * Create an instance of {@link EliminarResponse }
     * 
     */
    public EliminarResponse createEliminarResponse() {
        return new EliminarResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProducto }
     * 
     */
    public ArrayOfProducto createArrayOfProducto() {
        return new ArrayOfProducto();
    }

    /**
     * Create an instance of {@link ArrayOfFactura }
     * 
     */
    public ArrayOfFactura createArrayOfFactura() {
        return new ArrayOfFactura();
    }

    /**
     * Create an instance of {@link Factura }
     * 
     */
    public Factura createFactura() {
        return new Factura();
    }

    /**
     * Create an instance of {@link ArrayOfGuiaDespacho }
     * 
     */
    public ArrayOfGuiaDespacho createArrayOfGuiaDespacho() {
        return new ArrayOfGuiaDespacho();
    }

    /**
     * Create an instance of {@link GuiaDespacho }
     * 
     */
    public GuiaDespacho createGuiaDespacho() {
        return new GuiaDespacho();
    }

    /**
     * Create an instance of {@link PerfilUsuario }
     * 
     */
    public PerfilUsuario createPerfilUsuario() {
        return new PerfilUsuario();
    }

    /**
     * Create an instance of {@link ArrayOfSolicitudServicio }
     * 
     */
    public ArrayOfSolicitudServicio createArrayOfSolicitudServicio() {
        return new ArrayOfSolicitudServicio();
    }

    /**
     * Create an instance of {@link SolicitudServicio }
     * 
     */
    public SolicitudServicio createSolicitudServicio() {
        return new SolicitudServicio();
    }

    /**
     * Create an instance of {@link AuthUser }
     * 
     */
    public AuthUser createAuthUser() {
        return new AuthUser();
    }

    /**
     * Create an instance of {@link ArrayOfPerfilUsuario }
     * 
     */
    public ArrayOfPerfilUsuario createArrayOfPerfilUsuario() {
        return new ArrayOfPerfilUsuario();
    }

    /**
     * Create an instance of {@link ArrayOfauthUserGroups }
     * 
     */
    public ArrayOfauthUserGroups createArrayOfauthUserGroups() {
        return new ArrayOfauthUserGroups();
    }

    /**
     * Create an instance of {@link AuthUserGroups }
     * 
     */
    public AuthUserGroups createAuthUserGroups() {
        return new AuthUserGroups();
    }

    /**
     * Create an instance of {@link AuthGroup }
     * 
     */
    public AuthGroup createAuthGroup() {
        return new AuthGroup();
    }

    /**
     * Create an instance of {@link ArrayOfauthGroupPermissions }
     * 
     */
    public ArrayOfauthGroupPermissions createArrayOfauthGroupPermissions() {
        return new ArrayOfauthGroupPermissions();
    }

    /**
     * Create an instance of {@link AuthGroupPermissions }
     * 
     */
    public AuthGroupPermissions createAuthGroupPermissions() {
        return new AuthGroupPermissions();
    }

    /**
     * Create an instance of {@link AuthPermission }
     * 
     */
    public AuthPermission createAuthPermission() {
        return new AuthPermission();
    }

    /**
     * Create an instance of {@link ArrayOfauthUserUserPermissions }
     * 
     */
    public ArrayOfauthUserUserPermissions createArrayOfauthUserUserPermissions() {
        return new ArrayOfauthUserUserPermissions();
    }

    /**
     * Create an instance of {@link AuthUserUserPermissions }
     * 
     */
    public AuthUserUserPermissions createAuthUserUserPermissions() {
        return new AuthUserUserPermissions();
    }

    /**
     * Create an instance of {@link DjangoContentType }
     * 
     */
    public DjangoContentType createDjangoContentType() {
        return new DjangoContentType();
    }

    /**
     * Create an instance of {@link ArrayOfauthPermission }
     * 
     */
    public ArrayOfauthPermission createArrayOfauthPermission() {
        return new ArrayOfauthPermission();
    }

    /**
     * Create an instance of {@link ArrayOfStockProducto }
     * 
     */
    public ArrayOfStockProducto createArrayOfStockProducto() {
        return new ArrayOfStockProducto();
    }

    /**
     * Create an instance of {@link StockProducto }
     * 
     */
    public StockProducto createStockProducto() {
        return new StockProducto();
    }

    /**
     * Create an instance of {@link DateTimeOffset }
     * 
     */
    public DateTimeOffset createDateTimeOffset() {
        return new DateTimeOffset();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BcProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BcProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", name = "BcProducto")
    public JAXBElement<BcProducto> createBcProducto(BcProducto value) {
        return new JAXBElement<BcProducto>(_BcProducto_QNAME, BcProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "ArrayOfProducto")
    public JAXBElement<ArrayOfProducto> createArrayOfProducto(ArrayOfProducto value) {
        return new JAXBElement<ArrayOfProducto>(_ArrayOfProducto_QNAME, ArrayOfProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "Producto")
    public JAXBElement<Producto> createProducto(Producto value) {
        return new JAXBElement<Producto>(_Producto_QNAME, Producto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFactura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFactura }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "ArrayOfFactura")
    public JAXBElement<ArrayOfFactura> createArrayOfFactura(ArrayOfFactura value) {
        return new JAXBElement<ArrayOfFactura>(_ArrayOfFactura_QNAME, ArrayOfFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Factura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Factura }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "Factura")
    public JAXBElement<Factura> createFactura(Factura value) {
        return new JAXBElement<Factura>(_Factura_QNAME, Factura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGuiaDespacho }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfGuiaDespacho }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "ArrayOfGuiaDespacho")
    public JAXBElement<ArrayOfGuiaDespacho> createArrayOfGuiaDespacho(ArrayOfGuiaDespacho value) {
        return new JAXBElement<ArrayOfGuiaDespacho>(_ArrayOfGuiaDespacho_QNAME, ArrayOfGuiaDespacho.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuiaDespacho }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GuiaDespacho }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "GuiaDespacho")
    public JAXBElement<GuiaDespacho> createGuiaDespacho(GuiaDespacho value) {
        return new JAXBElement<GuiaDespacho>(_GuiaDespacho_QNAME, GuiaDespacho.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerfilUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PerfilUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "PerfilUsuario")
    public JAXBElement<PerfilUsuario> createPerfilUsuario(PerfilUsuario value) {
        return new JAXBElement<PerfilUsuario>(_PerfilUsuario_QNAME, PerfilUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSolicitudServicio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSolicitudServicio }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "ArrayOfSolicitudServicio")
    public JAXBElement<ArrayOfSolicitudServicio> createArrayOfSolicitudServicio(ArrayOfSolicitudServicio value) {
        return new JAXBElement<ArrayOfSolicitudServicio>(_ArrayOfSolicitudServicio_QNAME, ArrayOfSolicitudServicio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitudServicio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolicitudServicio }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "SolicitudServicio")
    public JAXBElement<SolicitudServicio> createSolicitudServicio(SolicitudServicio value) {
        return new JAXBElement<SolicitudServicio>(_SolicitudServicio_QNAME, SolicitudServicio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_user")
    public JAXBElement<AuthUser> createAuthUser(AuthUser value) {
        return new JAXBElement<AuthUser>(_AuthUser_QNAME, AuthUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPerfilUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPerfilUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "ArrayOfPerfilUsuario")
    public JAXBElement<ArrayOfPerfilUsuario> createArrayOfPerfilUsuario(ArrayOfPerfilUsuario value) {
        return new JAXBElement<ArrayOfPerfilUsuario>(_ArrayOfPerfilUsuario_QNAME, ArrayOfPerfilUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthUserGroups }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfauthUserGroups }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "ArrayOfauth_user_groups")
    public JAXBElement<ArrayOfauthUserGroups> createArrayOfauthUserGroups(ArrayOfauthUserGroups value) {
        return new JAXBElement<ArrayOfauthUserGroups>(_ArrayOfauthUserGroups_QNAME, ArrayOfauthUserGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthUserGroups }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthUserGroups }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_user_groups")
    public JAXBElement<AuthUserGroups> createAuthUserGroups(AuthUserGroups value) {
        return new JAXBElement<AuthUserGroups>(_AuthUserGroups_QNAME, AuthUserGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_group")
    public JAXBElement<AuthGroup> createAuthGroup(AuthGroup value) {
        return new JAXBElement<AuthGroup>(_AuthGroup_QNAME, AuthGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthGroupPermissions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfauthGroupPermissions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "ArrayOfauth_group_permissions")
    public JAXBElement<ArrayOfauthGroupPermissions> createArrayOfauthGroupPermissions(ArrayOfauthGroupPermissions value) {
        return new JAXBElement<ArrayOfauthGroupPermissions>(_ArrayOfauthGroupPermissions_QNAME, ArrayOfauthGroupPermissions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthGroupPermissions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthGroupPermissions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_group_permissions")
    public JAXBElement<AuthGroupPermissions> createAuthGroupPermissions(AuthGroupPermissions value) {
        return new JAXBElement<AuthGroupPermissions>(_AuthGroupPermissions_QNAME, AuthGroupPermissions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthPermission }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthPermission }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_permission")
    public JAXBElement<AuthPermission> createAuthPermission(AuthPermission value) {
        return new JAXBElement<AuthPermission>(_AuthPermission_QNAME, AuthPermission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthUserUserPermissions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfauthUserUserPermissions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "ArrayOfauth_user_user_permissions")
    public JAXBElement<ArrayOfauthUserUserPermissions> createArrayOfauthUserUserPermissions(ArrayOfauthUserUserPermissions value) {
        return new JAXBElement<ArrayOfauthUserUserPermissions>(_ArrayOfauthUserUserPermissions_QNAME, ArrayOfauthUserUserPermissions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthUserUserPermissions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthUserUserPermissions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_user_user_permissions")
    public JAXBElement<AuthUserUserPermissions> createAuthUserUserPermissions(AuthUserUserPermissions value) {
        return new JAXBElement<AuthUserUserPermissions>(_AuthUserUserPermissions_QNAME, AuthUserUserPermissions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DjangoContentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DjangoContentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "django_content_type")
    public JAXBElement<DjangoContentType> createDjangoContentType(DjangoContentType value) {
        return new JAXBElement<DjangoContentType>(_DjangoContentType_QNAME, DjangoContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthPermission }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfauthPermission }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "ArrayOfauth_permission")
    public JAXBElement<ArrayOfauthPermission> createArrayOfauthPermission(ArrayOfauthPermission value) {
        return new JAXBElement<ArrayOfauthPermission>(_ArrayOfauthPermission_QNAME, ArrayOfauthPermission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStockProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "ArrayOfStockProducto")
    public JAXBElement<ArrayOfStockProducto> createArrayOfStockProducto(ArrayOfStockProducto value) {
        return new JAXBElement<ArrayOfStockProducto>(_ArrayOfStockProducto_QNAME, ArrayOfStockProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StockProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "StockProducto")
    public JAXBElement<StockProducto> createStockProducto(StockProducto value) {
        return new JAXBElement<StockProducto>(_StockProducto_QNAME, StockProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeOffset }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DateTimeOffset }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System", name = "DateTimeOffset")
    public JAXBElement<DateTimeOffset> createDateTimeOffset(DateTimeOffset value) {
        return new JAXBElement<DateTimeOffset>(_DateTimeOffset_QNAME, DateTimeOffset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Respuesta")
    public JAXBElement<Respuesta> createRespuesta(Respuesta value) {
        return new JAXBElement<Respuesta>(_Respuesta_QNAME, Respuesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BcProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BcProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "bc", scope = ObtenerRespuesta.class)
    public JAXBElement<BcProducto> createObtenerRespuestaBc(BcProducto value) {
        return new JAXBElement<BcProducto>(_ObtenerRespuestaBc_QNAME, BcProducto.class, ObtenerRespuesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerRespuestaResult", scope = ObtenerRespuestaResponse.class)
    public JAXBElement<Respuesta> createObtenerRespuestaResponseObtenerRespuestaResult(Respuesta value) {
        return new JAXBElement<Respuesta>(_ObtenerRespuestaResponseObtenerRespuestaResult_QNAME, Respuesta.class, ObtenerRespuestaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "producto", scope = ValidarProducto.class)
    public JAXBElement<Producto> createValidarProductoProducto(Producto value) {
        return new JAXBElement<Producto>(_ValidarProductoProducto_QNAME, Producto.class, ValidarProducto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ValidarProductoResult", scope = ValidarProductoResponse.class)
    public JAXBElement<Respuesta> createValidarProductoResponseValidarProductoResult(Respuesta value) {
        return new JAXBElement<Respuesta>(_ValidarProductoResponseValidarProductoResult_QNAME, Respuesta.class, ValidarProductoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "producto", scope = Crear.class)
    public JAXBElement<Producto> createCrearProducto(Producto value) {
        return new JAXBElement<Producto>(_ValidarProductoProducto_QNAME, Producto.class, Crear.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CrearResult", scope = CrearResponse.class)
    public JAXBElement<Respuesta> createCrearResponseCrearResult(Respuesta value) {
        return new JAXBElement<Respuesta>(_CrearResponseCrearResult_QNAME, Respuesta.class, CrearResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LeerTodosResult", scope = LeerTodosResponse.class)
    public JAXBElement<Respuesta> createLeerTodosResponseLeerTodosResult(Respuesta value) {
        return new JAXBElement<Respuesta>(_LeerTodosResponseLeerTodosResult_QNAME, Respuesta.class, LeerTodosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LeerResult", scope = LeerResponse.class)
    public JAXBElement<Respuesta> createLeerResponseLeerResult(Respuesta value) {
        return new JAXBElement<Respuesta>(_LeerResponseLeerResult_QNAME, Respuesta.class, LeerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "producto", scope = Actualizar.class)
    public JAXBElement<Producto> createActualizarProducto(Producto value) {
        return new JAXBElement<Producto>(_ValidarProductoProducto_QNAME, Producto.class, Actualizar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ActualizarResult", scope = ActualizarResponse.class)
    public JAXBElement<Respuesta> createActualizarResponseActualizarResult(Respuesta value) {
        return new JAXBElement<Respuesta>(_ActualizarResponseActualizarResult_QNAME, Respuesta.class, ActualizarResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EliminarResult", scope = EliminarResponse.class)
    public JAXBElement<Respuesta> createEliminarResponseEliminarResult(Respuesta value) {
        return new JAXBElement<Respuesta>(_EliminarResponseEliminarResult_QNAME, Respuesta.class, EliminarResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Factura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Factura }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "Factura", scope = StockProducto.class)
    public JAXBElement<Factura> createStockProductoFactura(Factura value) {
        return new JAXBElement<Factura>(_Factura_QNAME, Factura.class, StockProducto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "Producto", scope = StockProducto.class)
    public JAXBElement<Producto> createStockProductoProducto(Producto value) {
        return new JAXBElement<Producto>(_Producto_QNAME, Producto.class, StockProducto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "nrofac", scope = StockProducto.class)
    public JAXBElement<Integer> createStockProductoNrofac(Integer value) {
        return new JAXBElement<Integer>(_StockProductoNrofac_QNAME, Integer.class, StockProducto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "app_label", scope = DjangoContentType.class)
    public JAXBElement<String> createDjangoContentTypeAppLabel(String value) {
        return new JAXBElement<String>(_DjangoContentTypeAppLabel_QNAME, String.class, DjangoContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthPermission }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfauthPermission }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_permission", scope = DjangoContentType.class)
    public JAXBElement<ArrayOfauthPermission> createDjangoContentTypeAuthPermission(ArrayOfauthPermission value) {
        return new JAXBElement<ArrayOfauthPermission>(_AuthPermission_QNAME, ArrayOfauthPermission.class, DjangoContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "model", scope = DjangoContentType.class)
    public JAXBElement<String> createDjangoContentTypeModel(String value) {
        return new JAXBElement<String>(_DjangoContentTypeModel_QNAME, String.class, DjangoContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "name", scope = DjangoContentType.class)
    public JAXBElement<String> createDjangoContentTypeName(String value) {
        return new JAXBElement<String>(_DjangoContentTypeName_QNAME, String.class, DjangoContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthPermission }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthPermission }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_permission", scope = AuthUserUserPermissions.class)
    public JAXBElement<AuthPermission> createAuthUserUserPermissionsAuthPermission(AuthPermission value) {
        return new JAXBElement<AuthPermission>(_AuthPermission_QNAME, AuthPermission.class, AuthUserUserPermissions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_user", scope = AuthUserUserPermissions.class)
    public JAXBElement<AuthUser> createAuthUserUserPermissionsAuthUser(AuthUser value) {
        return new JAXBElement<AuthUser>(_AuthUser_QNAME, AuthUser.class, AuthUserUserPermissions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthGroupPermissions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfauthGroupPermissions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_group_permissions", scope = AuthPermission.class)
    public JAXBElement<ArrayOfauthGroupPermissions> createAuthPermissionAuthGroupPermissions(ArrayOfauthGroupPermissions value) {
        return new JAXBElement<ArrayOfauthGroupPermissions>(_AuthGroupPermissions_QNAME, ArrayOfauthGroupPermissions.class, AuthPermission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthUserUserPermissions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfauthUserUserPermissions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_user_user_permissions", scope = AuthPermission.class)
    public JAXBElement<ArrayOfauthUserUserPermissions> createAuthPermissionAuthUserUserPermissions(ArrayOfauthUserUserPermissions value) {
        return new JAXBElement<ArrayOfauthUserUserPermissions>(_AuthUserUserPermissions_QNAME, ArrayOfauthUserUserPermissions.class, AuthPermission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "codename", scope = AuthPermission.class)
    public JAXBElement<String> createAuthPermissionCodename(String value) {
        return new JAXBElement<String>(_AuthPermissionCodename_QNAME, String.class, AuthPermission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DjangoContentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DjangoContentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "django_content_type", scope = AuthPermission.class)
    public JAXBElement<DjangoContentType> createAuthPermissionDjangoContentType(DjangoContentType value) {
        return new JAXBElement<DjangoContentType>(_DjangoContentType_QNAME, DjangoContentType.class, AuthPermission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "name", scope = AuthPermission.class)
    public JAXBElement<String> createAuthPermissionName(String value) {
        return new JAXBElement<String>(_DjangoContentTypeName_QNAME, String.class, AuthPermission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_group", scope = AuthGroupPermissions.class)
    public JAXBElement<AuthGroup> createAuthGroupPermissionsAuthGroup(AuthGroup value) {
        return new JAXBElement<AuthGroup>(_AuthGroup_QNAME, AuthGroup.class, AuthGroupPermissions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthPermission }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthPermission }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_permission", scope = AuthGroupPermissions.class)
    public JAXBElement<AuthPermission> createAuthGroupPermissionsAuthPermission(AuthPermission value) {
        return new JAXBElement<AuthPermission>(_AuthPermission_QNAME, AuthPermission.class, AuthGroupPermissions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthGroupPermissions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfauthGroupPermissions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_group_permissions", scope = AuthGroup.class)
    public JAXBElement<ArrayOfauthGroupPermissions> createAuthGroupAuthGroupPermissions(ArrayOfauthGroupPermissions value) {
        return new JAXBElement<ArrayOfauthGroupPermissions>(_AuthGroupPermissions_QNAME, ArrayOfauthGroupPermissions.class, AuthGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthUserGroups }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfauthUserGroups }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_user_groups", scope = AuthGroup.class)
    public JAXBElement<ArrayOfauthUserGroups> createAuthGroupAuthUserGroups(ArrayOfauthUserGroups value) {
        return new JAXBElement<ArrayOfauthUserGroups>(_AuthUserGroups_QNAME, ArrayOfauthUserGroups.class, AuthGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "name", scope = AuthGroup.class)
    public JAXBElement<String> createAuthGroupName(String value) {
        return new JAXBElement<String>(_DjangoContentTypeName_QNAME, String.class, AuthGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_group", scope = AuthUserGroups.class)
    public JAXBElement<AuthGroup> createAuthUserGroupsAuthGroup(AuthGroup value) {
        return new JAXBElement<AuthGroup>(_AuthGroup_QNAME, AuthGroup.class, AuthUserGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_user", scope = AuthUserGroups.class)
    public JAXBElement<AuthUser> createAuthUserGroupsAuthUser(AuthUser value) {
        return new JAXBElement<AuthUser>(_AuthUser_QNAME, AuthUser.class, AuthUserGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPerfilUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPerfilUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "PerfilUsuario", scope = AuthUser.class)
    public JAXBElement<ArrayOfPerfilUsuario> createAuthUserPerfilUsuario(ArrayOfPerfilUsuario value) {
        return new JAXBElement<ArrayOfPerfilUsuario>(_PerfilUsuario_QNAME, ArrayOfPerfilUsuario.class, AuthUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthUserGroups }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfauthUserGroups }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_user_groups", scope = AuthUser.class)
    public JAXBElement<ArrayOfauthUserGroups> createAuthUserAuthUserGroups(ArrayOfauthUserGroups value) {
        return new JAXBElement<ArrayOfauthUserGroups>(_AuthUserGroups_QNAME, ArrayOfauthUserGroups.class, AuthUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthUserUserPermissions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfauthUserUserPermissions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_user_user_permissions", scope = AuthUser.class)
    public JAXBElement<ArrayOfauthUserUserPermissions> createAuthUserAuthUserUserPermissions(ArrayOfauthUserUserPermissions value) {
        return new JAXBElement<ArrayOfauthUserUserPermissions>(_AuthUserUserPermissions_QNAME, ArrayOfauthUserUserPermissions.class, AuthUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "email", scope = AuthUser.class)
    public JAXBElement<String> createAuthUserEmail(String value) {
        return new JAXBElement<String>(_AuthUserEmail_QNAME, String.class, AuthUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "first_name", scope = AuthUser.class)
    public JAXBElement<String> createAuthUserFirstName(String value) {
        return new JAXBElement<String>(_AuthUserFirstName_QNAME, String.class, AuthUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "last_name", scope = AuthUser.class)
    public JAXBElement<String> createAuthUserLastName(String value) {
        return new JAXBElement<String>(_AuthUserLastName_QNAME, String.class, AuthUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "password", scope = AuthUser.class)
    public JAXBElement<String> createAuthUserPassword(String value) {
        return new JAXBElement<String>(_AuthUserPassword_QNAME, String.class, AuthUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "username", scope = AuthUser.class)
    public JAXBElement<String> createAuthUserUsername(String value) {
        return new JAXBElement<String>(_AuthUserUsername_QNAME, String.class, AuthUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Factura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Factura }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "Factura", scope = SolicitudServicio.class)
    public JAXBElement<Factura> createSolicitudServicioFactura(Factura value) {
        return new JAXBElement<Factura>(_Factura_QNAME, Factura.class, SolicitudServicio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerfilUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PerfilUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "PerfilUsuario", scope = SolicitudServicio.class)
    public JAXBElement<PerfilUsuario> createSolicitudServicioPerfilUsuario(PerfilUsuario value) {
        return new JAXBElement<PerfilUsuario>(_PerfilUsuario_QNAME, PerfilUsuario.class, SolicitudServicio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "descsol", scope = SolicitudServicio.class)
    public JAXBElement<String> createSolicitudServicioDescsol(String value) {
        return new JAXBElement<String>(_SolicitudServicioDescsol_QNAME, String.class, SolicitudServicio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "estadosol", scope = SolicitudServicio.class)
    public JAXBElement<String> createSolicitudServicioEstadosol(String value) {
        return new JAXBElement<String>(_SolicitudServicioEstadosol_QNAME, String.class, SolicitudServicio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "ruttec", scope = SolicitudServicio.class)
    public JAXBElement<String> createSolicitudServicioRuttec(String value) {
        return new JAXBElement<String>(_SolicitudServicioRuttec_QNAME, String.class, SolicitudServicio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "tiposol", scope = SolicitudServicio.class)
    public JAXBElement<String> createSolicitudServicioTiposol(String value) {
        return new JAXBElement<String>(_SolicitudServicioTiposol_QNAME, String.class, SolicitudServicio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFactura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFactura }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "Factura", scope = PerfilUsuario.class)
    public JAXBElement<ArrayOfFactura> createPerfilUsuarioFactura(ArrayOfFactura value) {
        return new JAXBElement<ArrayOfFactura>(_Factura_QNAME, ArrayOfFactura.class, PerfilUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSolicitudServicio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSolicitudServicio }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "SolicitudServicio", scope = PerfilUsuario.class)
    public JAXBElement<ArrayOfSolicitudServicio> createPerfilUsuarioSolicitudServicio(ArrayOfSolicitudServicio value) {
        return new JAXBElement<ArrayOfSolicitudServicio>(_SolicitudServicio_QNAME, ArrayOfSolicitudServicio.class, PerfilUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "apeusu", scope = PerfilUsuario.class)
    public JAXBElement<String> createPerfilUsuarioApeusu(String value) {
        return new JAXBElement<String>(_PerfilUsuarioApeusu_QNAME, String.class, PerfilUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "auth_user", scope = PerfilUsuario.class)
    public JAXBElement<AuthUser> createPerfilUsuarioAuthUser(AuthUser value) {
        return new JAXBElement<AuthUser>(_AuthUser_QNAME, AuthUser.class, PerfilUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "correo", scope = PerfilUsuario.class)
    public JAXBElement<String> createPerfilUsuarioCorreo(String value) {
        return new JAXBElement<String>(_PerfilUsuarioCorreo_QNAME, String.class, PerfilUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "dirusu", scope = PerfilUsuario.class)
    public JAXBElement<String> createPerfilUsuarioDirusu(String value) {
        return new JAXBElement<String>(_PerfilUsuarioDirusu_QNAME, String.class, PerfilUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "nomusu", scope = PerfilUsuario.class)
    public JAXBElement<String> createPerfilUsuarioNomusu(String value) {
        return new JAXBElement<String>(_PerfilUsuarioNomusu_QNAME, String.class, PerfilUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "pwd", scope = PerfilUsuario.class)
    public JAXBElement<String> createPerfilUsuarioPwd(String value) {
        return new JAXBElement<String>(_PerfilUsuarioPwd_QNAME, String.class, PerfilUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "rut", scope = PerfilUsuario.class)
    public JAXBElement<String> createPerfilUsuarioRut(String value) {
        return new JAXBElement<String>(_PerfilUsuarioRut_QNAME, String.class, PerfilUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "tipousu", scope = PerfilUsuario.class)
    public JAXBElement<String> createPerfilUsuarioTipousu(String value) {
        return new JAXBElement<String>(_PerfilUsuarioTipousu_QNAME, String.class, PerfilUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Factura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Factura }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "Factura", scope = GuiaDespacho.class)
    public JAXBElement<Factura> createGuiaDespachoFactura(Factura value) {
        return new JAXBElement<Factura>(_Factura_QNAME, Factura.class, GuiaDespacho.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "Producto", scope = GuiaDespacho.class)
    public JAXBElement<Producto> createGuiaDespachoProducto(Producto value) {
        return new JAXBElement<Producto>(_Producto_QNAME, Producto.class, GuiaDespacho.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "estadogd", scope = GuiaDespacho.class)
    public JAXBElement<String> createGuiaDespachoEstadogd(String value) {
        return new JAXBElement<String>(_GuiaDespachoEstadogd_QNAME, String.class, GuiaDespacho.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGuiaDespacho }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfGuiaDespacho }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "GuiaDespacho", scope = Factura.class)
    public JAXBElement<ArrayOfGuiaDespacho> createFacturaGuiaDespacho(ArrayOfGuiaDespacho value) {
        return new JAXBElement<ArrayOfGuiaDespacho>(_GuiaDespacho_QNAME, ArrayOfGuiaDespacho.class, Factura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerfilUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PerfilUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "PerfilUsuario", scope = Factura.class)
    public JAXBElement<PerfilUsuario> createFacturaPerfilUsuario(PerfilUsuario value) {
        return new JAXBElement<PerfilUsuario>(_PerfilUsuario_QNAME, PerfilUsuario.class, Factura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "Producto", scope = Factura.class)
    public JAXBElement<Producto> createFacturaProducto(Producto value) {
        return new JAXBElement<Producto>(_Producto_QNAME, Producto.class, Factura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSolicitudServicio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSolicitudServicio }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "SolicitudServicio", scope = Factura.class)
    public JAXBElement<ArrayOfSolicitudServicio> createFacturaSolicitudServicio(ArrayOfSolicitudServicio value) {
        return new JAXBElement<ArrayOfSolicitudServicio>(_SolicitudServicio_QNAME, ArrayOfSolicitudServicio.class, Factura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStockProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "StockProducto", scope = Factura.class)
    public JAXBElement<ArrayOfStockProducto> createFacturaStockProducto(ArrayOfStockProducto value) {
        return new JAXBElement<ArrayOfStockProducto>(_StockProducto_QNAME, ArrayOfStockProducto.class, Factura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "descfac", scope = Factura.class)
    public JAXBElement<String> createFacturaDescfac(String value) {
        return new JAXBElement<String>(_FacturaDescfac_QNAME, String.class, Factura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "rutcli", scope = Factura.class)
    public JAXBElement<String> createFacturaRutcli(String value) {
        return new JAXBElement<String>(_FacturaRutcli_QNAME, String.class, Factura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFactura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFactura }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "Factura", scope = Producto.class)
    public JAXBElement<ArrayOfFactura> createProductoFactura(ArrayOfFactura value) {
        return new JAXBElement<ArrayOfFactura>(_Factura_QNAME, ArrayOfFactura.class, Producto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGuiaDespacho }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfGuiaDespacho }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "GuiaDespacho", scope = Producto.class)
    public JAXBElement<ArrayOfGuiaDespacho> createProductoGuiaDespacho(ArrayOfGuiaDespacho value) {
        return new JAXBElement<ArrayOfGuiaDespacho>(_GuiaDespacho_QNAME, ArrayOfGuiaDespacho.class, Producto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStockProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "StockProducto", scope = Producto.class)
    public JAXBElement<ArrayOfStockProducto> createProductoStockProducto(ArrayOfStockProducto value) {
        return new JAXBElement<ArrayOfStockProducto>(_StockProducto_QNAME, ArrayOfStockProducto.class, Producto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "descprod", scope = Producto.class)
    public JAXBElement<String> createProductoDescprod(String value) {
        return new JAXBElement<String>(_ProductoDescprod_QNAME, String.class, Producto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "imagen", scope = Producto.class)
    public JAXBElement<String> createProductoImagen(String value) {
        return new JAXBElement<String>(_ProductoImagen_QNAME, String.class, Producto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", name = "nomprod", scope = Producto.class)
    public JAXBElement<String> createProductoNomprod(String value) {
        return new JAXBElement<String>(_ProductoNomprod_QNAME, String.class, Producto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Accion", scope = Respuesta.class)
    public JAXBElement<String> createRespuestaAccion(String value) {
        return new JAXBElement<String>(_RespuestaAccion_QNAME, String.class, Respuesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Mensaje", scope = Respuesta.class)
    public JAXBElement<String> createRespuestaMensaje(String value) {
        return new JAXBElement<String>(_RespuestaMensaje_QNAME, String.class, Respuesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "XmlFactura", scope = Respuesta.class)
    public JAXBElement<String> createRespuestaXmlFactura(String value) {
        return new JAXBElement<String>(_RespuestaXmlFactura_QNAME, String.class, Respuesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "XmlGuiaDespacho", scope = Respuesta.class)
    public JAXBElement<String> createRespuestaXmlGuiaDespacho(String value) {
        return new JAXBElement<String>(_RespuestaXmlGuiaDespacho_QNAME, String.class, Respuesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "XmlListaFactura", scope = Respuesta.class)
    public JAXBElement<String> createRespuestaXmlListaFactura(String value) {
        return new JAXBElement<String>(_RespuestaXmlListaFactura_QNAME, String.class, Respuesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "XmlListaGuiaDespacho", scope = Respuesta.class)
    public JAXBElement<String> createRespuestaXmlListaGuiaDespacho(String value) {
        return new JAXBElement<String>(_RespuestaXmlListaGuiaDespacho_QNAME, String.class, Respuesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "XmlListaPerfilUsuario", scope = Respuesta.class)
    public JAXBElement<String> createRespuestaXmlListaPerfilUsuario(String value) {
        return new JAXBElement<String>(_RespuestaXmlListaPerfilUsuario_QNAME, String.class, Respuesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "XmlListaProducto", scope = Respuesta.class)
    public JAXBElement<String> createRespuestaXmlListaProducto(String value) {
        return new JAXBElement<String>(_RespuestaXmlListaProducto_QNAME, String.class, Respuesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "XmlListaSolicitudServicio", scope = Respuesta.class)
    public JAXBElement<String> createRespuestaXmlListaSolicitudServicio(String value) {
        return new JAXBElement<String>(_RespuestaXmlListaSolicitudServicio_QNAME, String.class, Respuesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "XmlListaStockProducto", scope = Respuesta.class)
    public JAXBElement<String> createRespuestaXmlListaStockProducto(String value) {
        return new JAXBElement<String>(_RespuestaXmlListaStockProducto_QNAME, String.class, Respuesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "XmlPerfilUsuario", scope = Respuesta.class)
    public JAXBElement<String> createRespuestaXmlPerfilUsuario(String value) {
        return new JAXBElement<String>(_RespuestaXmlPerfilUsuario_QNAME, String.class, Respuesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "XmlProducto", scope = Respuesta.class)
    public JAXBElement<String> createRespuestaXmlProducto(String value) {
        return new JAXBElement<String>(_RespuestaXmlProducto_QNAME, String.class, Respuesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "XmlSolicitudServicio", scope = Respuesta.class)
    public JAXBElement<String> createRespuestaXmlSolicitudServicio(String value) {
        return new JAXBElement<String>(_RespuestaXmlSolicitudServicio_QNAME, String.class, Respuesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "XmlStockProducto", scope = Respuesta.class)
    public JAXBElement<String> createRespuestaXmlStockProducto(String value) {
        return new JAXBElement<String>(_RespuestaXmlStockProducto_QNAME, String.class, Respuesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", name = "Accion", scope = BcProducto.class)
    public JAXBElement<String> createBcProductoAccion(String value) {
        return new JAXBElement<String>(_BcProductoAccion_QNAME, String.class, BcProducto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", name = "Lista", scope = BcProducto.class)
    public JAXBElement<ArrayOfProducto> createBcProductoLista(ArrayOfProducto value) {
        return new JAXBElement<ArrayOfProducto>(_BcProductoLista_QNAME, ArrayOfProducto.class, BcProducto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", name = "Mensaje", scope = BcProducto.class)
    public JAXBElement<String> createBcProductoMensaje(String value) {
        return new JAXBElement<String>(_BcProductoMensaje_QNAME, String.class, BcProducto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", name = "Producto", scope = BcProducto.class)
    public JAXBElement<Producto> createBcProductoProducto(Producto value) {
        return new JAXBElement<Producto>(_BcProductoProducto_QNAME, Producto.class, BcProducto.class, value);
    }

}
