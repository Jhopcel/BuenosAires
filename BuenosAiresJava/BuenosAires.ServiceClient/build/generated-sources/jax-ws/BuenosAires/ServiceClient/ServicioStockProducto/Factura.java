
package BuenosAires.ServiceClient.ServicioStockProducto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Factura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Factura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuiaDespacho" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}ArrayOfGuiaDespacho" minOccurs="0"/&gt;
 *         &lt;element name="PerfilUsuario" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}PerfilUsuario" minOccurs="0"/&gt;
 *         &lt;element name="Producto" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}Producto" minOccurs="0"/&gt;
 *         &lt;element name="SolicitudServicio" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}ArrayOfSolicitudServicio" minOccurs="0"/&gt;
 *         &lt;element name="StockProducto" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}ArrayOfStockProducto" minOccurs="0"/&gt;
 *         &lt;element name="descfac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechafac" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idprod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nrofac" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="rutcli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Factura", propOrder = {
    "guiaDespacho",
    "perfilUsuario",
    "producto",
    "solicitudServicio",
    "stockProducto",
    "descfac",
    "fechafac",
    "idprod",
    "monto",
    "nrofac",
    "rutcli"
})
public class Factura {

    @XmlElementRef(name = "GuiaDespacho", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGuiaDespacho> guiaDespacho;
    @XmlElementRef(name = "PerfilUsuario", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<PerfilUsuario> perfilUsuario;
    @XmlElementRef(name = "Producto", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<Producto> producto;
    @XmlElementRef(name = "SolicitudServicio", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSolicitudServicio> solicitudServicio;
    @XmlElementRef(name = "StockProducto", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStockProducto> stockProducto;
    @XmlElementRef(name = "descfac", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descfac;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechafac;
    protected Integer idprod;
    protected Integer monto;
    protected Integer nrofac;
    @XmlElementRef(name = "rutcli", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rutcli;

    /**
     * Obtiene el valor de la propiedad guiaDespacho.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGuiaDespacho }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGuiaDespacho> getGuiaDespacho() {
        return guiaDespacho;
    }

    /**
     * Define el valor de la propiedad guiaDespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGuiaDespacho }{@code >}
     *     
     */
    public void setGuiaDespacho(JAXBElement<ArrayOfGuiaDespacho> value) {
        this.guiaDespacho = value;
    }

    /**
     * Obtiene el valor de la propiedad perfilUsuario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PerfilUsuario }{@code >}
     *     
     */
    public JAXBElement<PerfilUsuario> getPerfilUsuario() {
        return perfilUsuario;
    }

    /**
     * Define el valor de la propiedad perfilUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PerfilUsuario }{@code >}
     *     
     */
    public void setPerfilUsuario(JAXBElement<PerfilUsuario> value) {
        this.perfilUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Producto }{@code >}
     *     
     */
    public JAXBElement<Producto> getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Producto }{@code >}
     *     
     */
    public void setProducto(JAXBElement<Producto> value) {
        this.producto = value;
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
     * Obtiene el valor de la propiedad stockProducto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockProducto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStockProducto> getStockProducto() {
        return stockProducto;
    }

    /**
     * Define el valor de la propiedad stockProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockProducto }{@code >}
     *     
     */
    public void setStockProducto(JAXBElement<ArrayOfStockProducto> value) {
        this.stockProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad descfac.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescfac() {
        return descfac;
    }

    /**
     * Define el valor de la propiedad descfac.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescfac(JAXBElement<String> value) {
        this.descfac = value;
    }

    /**
     * Obtiene el valor de la propiedad fechafac.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechafac() {
        return fechafac;
    }

    /**
     * Define el valor de la propiedad fechafac.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechafac(XMLGregorianCalendar value) {
        this.fechafac = value;
    }

    /**
     * Obtiene el valor de la propiedad idprod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdprod() {
        return idprod;
    }

    /**
     * Define el valor de la propiedad idprod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdprod(Integer value) {
        this.idprod = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonto(Integer value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad nrofac.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNrofac() {
        return nrofac;
    }

    /**
     * Define el valor de la propiedad nrofac.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNrofac(Integer value) {
        this.nrofac = value;
    }

    /**
     * Obtiene el valor de la propiedad rutcli.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRutcli() {
        return rutcli;
    }

    /**
     * Define el valor de la propiedad rutcli.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRutcli(JAXBElement<String> value) {
        this.rutcli = value;
    }

}
