
package BuenosAires.ServiceClient.ServicioProducto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GuiaDespacho complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GuiaDespacho"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Factura" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}Factura" minOccurs="0"/&gt;
 *         &lt;element name="Producto" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}Producto" minOccurs="0"/&gt;
 *         &lt;element name="estadogd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idprod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nrofac" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nrogd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuiaDespacho", propOrder = {
    "factura",
    "producto",
    "estadogd",
    "idprod",
    "nrofac",
    "nrogd"
})
public class GuiaDespacho {

    @XmlElementRef(name = "Factura", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<Factura> factura;
    @XmlElementRef(name = "Producto", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<Producto> producto;
    @XmlElementRef(name = "estadogd", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadogd;
    protected Integer idprod;
    protected Integer nrofac;
    protected Integer nrogd;

    /**
     * Obtiene el valor de la propiedad factura.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Factura }{@code >}
     *     
     */
    public JAXBElement<Factura> getFactura() {
        return factura;
    }

    /**
     * Define el valor de la propiedad factura.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Factura }{@code >}
     *     
     */
    public void setFactura(JAXBElement<Factura> value) {
        this.factura = value;
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
     * Obtiene el valor de la propiedad estadogd.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadogd() {
        return estadogd;
    }

    /**
     * Define el valor de la propiedad estadogd.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadogd(JAXBElement<String> value) {
        this.estadogd = value;
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
     * Obtiene el valor de la propiedad nrogd.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNrogd() {
        return nrogd;
    }

    /**
     * Define el valor de la propiedad nrogd.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNrogd(Integer value) {
        this.nrogd = value;
    }

}
