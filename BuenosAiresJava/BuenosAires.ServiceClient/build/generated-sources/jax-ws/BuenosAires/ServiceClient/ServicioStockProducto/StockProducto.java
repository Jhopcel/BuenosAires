
package BuenosAires.ServiceClient.ServicioStockProducto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para StockProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="StockProducto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Factura" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}Factura" minOccurs="0"/&gt;
 *         &lt;element name="Producto" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}Producto" minOccurs="0"/&gt;
 *         &lt;element name="idprod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idstock" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nrofac" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockProducto", propOrder = {
    "factura",
    "producto",
    "idprod",
    "idstock",
    "nrofac"
})
public class StockProducto {

    @XmlElementRef(name = "Factura", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<Factura> factura;
    @XmlElementRef(name = "Producto", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<Producto> producto;
    protected Integer idprod;
    protected Integer idstock;
    @XmlElementRef(name = "nrofac", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nrofac;

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
     * Obtiene el valor de la propiedad idstock.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdstock() {
        return idstock;
    }

    /**
     * Define el valor de la propiedad idstock.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdstock(Integer value) {
        this.idstock = value;
    }

    /**
     * Obtiene el valor de la propiedad nrofac.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNrofac() {
        return nrofac;
    }

    /**
     * Define el valor de la propiedad nrofac.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNrofac(JAXBElement<Integer> value) {
        this.nrofac = value;
    }

}
