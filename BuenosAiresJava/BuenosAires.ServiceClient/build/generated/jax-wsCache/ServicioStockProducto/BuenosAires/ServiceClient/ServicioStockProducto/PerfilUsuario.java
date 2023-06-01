
package BuenosAires.ServiceClient.ServicioStockProducto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PerfilUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PerfilUsuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Factura" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}ArrayOfFactura" minOccurs="0"/&gt;
 *         &lt;element name="SolicitudServicio" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}ArrayOfSolicitudServicio" minOccurs="0"/&gt;
 *         &lt;element name="apeusu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="auth_user" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}auth_user" minOccurs="0"/&gt;
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dirusu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomusu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipousu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfilUsuario", propOrder = {
    "factura",
    "solicitudServicio",
    "apeusu",
    "authUser",
    "correo",
    "dirusu",
    "nomusu",
    "pwd",
    "rut",
    "tipousu",
    "userId"
})
public class PerfilUsuario {

    @XmlElementRef(name = "Factura", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFactura> factura;
    @XmlElementRef(name = "SolicitudServicio", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSolicitudServicio> solicitudServicio;
    @XmlElementRef(name = "apeusu", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apeusu;
    @XmlElementRef(name = "auth_user", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthUser> authUser;
    @XmlElementRef(name = "correo", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correo;
    @XmlElementRef(name = "dirusu", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dirusu;
    @XmlElementRef(name = "nomusu", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomusu;
    @XmlElementRef(name = "pwd", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pwd;
    @XmlElementRef(name = "rut", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rut;
    @XmlElementRef(name = "tipousu", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipousu;
    @XmlElement(name = "user_id")
    protected Integer userId;

    /**
     * Obtiene el valor de la propiedad factura.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFactura }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFactura> getFactura() {
        return factura;
    }

    /**
     * Define el valor de la propiedad factura.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFactura }{@code >}
     *     
     */
    public void setFactura(JAXBElement<ArrayOfFactura> value) {
        this.factura = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitudServicio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSolicitudServicio }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSolicitudServicio> getSolicitudServicio() {
        return solicitudServicio;
    }

    /**
     * Define el valor de la propiedad solicitudServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSolicitudServicio }{@code >}
     *     
     */
    public void setSolicitudServicio(JAXBElement<ArrayOfSolicitudServicio> value) {
        this.solicitudServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad apeusu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApeusu() {
        return apeusu;
    }

    /**
     * Define el valor de la propiedad apeusu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApeusu(JAXBElement<String> value) {
        this.apeusu = value;
    }

    /**
     * Obtiene el valor de la propiedad authUser.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthUser }{@code >}
     *     
     */
    public JAXBElement<AuthUser> getAuthUser() {
        return authUser;
    }

    /**
     * Define el valor de la propiedad authUser.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthUser }{@code >}
     *     
     */
    public void setAuthUser(JAXBElement<AuthUser> value) {
        this.authUser = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorreo(JAXBElement<String> value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad dirusu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirusu() {
        return dirusu;
    }

    /**
     * Define el valor de la propiedad dirusu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirusu(JAXBElement<String> value) {
        this.dirusu = value;
    }

    /**
     * Obtiene el valor de la propiedad nomusu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomusu() {
        return nomusu;
    }

    /**
     * Define el valor de la propiedad nomusu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomusu(JAXBElement<String> value) {
        this.nomusu = value;
    }

    /**
     * Obtiene el valor de la propiedad pwd.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPwd() {
        return pwd;
    }

    /**
     * Define el valor de la propiedad pwd.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPwd(JAXBElement<String> value) {
        this.pwd = value;
    }

    /**
     * Obtiene el valor de la propiedad rut.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRut() {
        return rut;
    }

    /**
     * Define el valor de la propiedad rut.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRut(JAXBElement<String> value) {
        this.rut = value;
    }

    /**
     * Obtiene el valor de la propiedad tipousu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipousu() {
        return tipousu;
    }

    /**
     * Define el valor de la propiedad tipousu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipousu(JAXBElement<String> value) {
        this.tipousu = value;
    }

    /**
     * Obtiene el valor de la propiedad userId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Define el valor de la propiedad userId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserId(Integer value) {
        this.userId = value;
    }

}
