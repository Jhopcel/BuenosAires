
package BuenosAires.ServiceClient.ServicioStockProducto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BcStockProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BcStockProducto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Accion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HayErrores" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Lista" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}ArrayOfStockProducto" minOccurs="0"/&gt;
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StockProducto" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}StockProducto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BcStockProducto", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", propOrder = {
    "accion",
    "hayErrores",
    "lista",
    "mensaje",
    "stockProducto"
})
public class BcStockProducto {

    @XmlElementRef(name = "Accion", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accion;
    @XmlElement(name = "HayErrores")
    protected Boolean hayErrores;
    @XmlElementRef(name = "Lista", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStockProducto> lista;
    @XmlElementRef(name = "Mensaje", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensaje;
    @XmlElementRef(name = "StockProducto", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", type = JAXBElement.class, required = false)
    protected JAXBElement<StockProducto> stockProducto;

    /**
     * Obtiene el valor de la propiedad accion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccion() {
        return accion;
    }

    /**
     * Define el valor de la propiedad accion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccion(JAXBElement<String> value) {
        this.accion = value;
    }

    /**
     * Obtiene el valor de la propiedad hayErrores.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHayErrores() {
        return hayErrores;
    }

    /**
     * Define el valor de la propiedad hayErrores.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHayErrores(Boolean value) {
        this.hayErrores = value;
    }

    /**
     * Obtiene el valor de la propiedad lista.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockProducto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStockProducto> getLista() {
        return lista;
    }

    /**
     * Define el valor de la propiedad lista.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockProducto }{@code >}
     *     
     */
    public void setLista(JAXBElement<ArrayOfStockProducto> value) {
        this.lista = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMensaje(JAXBElement<String> value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad stockProducto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StockProducto }{@code >}
     *     
     */
    public JAXBElement<StockProducto> getStockProducto() {
        return stockProducto;
    }

    /**
     * Define el valor de la propiedad stockProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StockProducto }{@code >}
     *     
     */
    public void setStockProducto(JAXBElement<StockProducto> value) {
        this.stockProducto = value;
    }

}
