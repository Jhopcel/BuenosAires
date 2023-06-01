
package BuenosAires.ServiceClient.ServicioStockProducto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Producto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Producto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Factura" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}ArrayOfFactura" minOccurs="0"/&gt;
 *         &lt;element name="GuiaDespacho" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}ArrayOfGuiaDespacho" minOccurs="0"/&gt;
 *         &lt;element name="StockProducto" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}ArrayOfStockProducto" minOccurs="0"/&gt;
 *         &lt;element name="descprod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idprod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomprod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Producto", propOrder = {
    "factura",
    "guiaDespacho",
    "stockProducto",
    "descprod",
    "idprod",
    "imagen",
    "nomprod",
    "precio"
})
public class Producto {

    @XmlElementRef(name = "Factura", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFactura> factura;
    @XmlElementRef(name = "GuiaDespacho", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGuiaDespacho> guiaDespacho;
    @XmlElementRef(name = "StockProducto", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStockProducto> stockProducto;
    @XmlElementRef(name = "descprod", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descprod;
    protected Integer idprod;
    @XmlElementRef(name = "imagen", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imagen;
    @XmlElementRef(name = "nomprod", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomprod;
    protected Integer precio;

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
     * Obtiene el valor de la propiedad descprod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescprod() {
        return descprod;
    }

    /**
     * Define el valor de la propiedad descprod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescprod(JAXBElement<String> value) {
        this.descprod = value;
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
     * Obtiene el valor de la propiedad imagen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImagen() {
        return imagen;
    }

    /**
     * Define el valor de la propiedad imagen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImagen(JAXBElement<String> value) {
        this.imagen = value;
    }

    /**
     * Obtiene el valor de la propiedad nomprod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomprod() {
        return nomprod;
    }

    /**
     * Define el valor de la propiedad nomprod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomprod(JAXBElement<String> value) {
        this.nomprod = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecio(Integer value) {
        this.precio = value;
    }

}
