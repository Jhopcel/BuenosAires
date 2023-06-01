
package BuenosAires.ServiceClient.ServicioProducto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BcProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BcProducto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Accion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HayErrores" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Lista" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}ArrayOfProducto" minOccurs="0"/&gt;
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Producto" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}Producto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BcProducto", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", propOrder = {
    "accion",
    "hayErrores",
    "lista",
    "mensaje",
    "producto"
})
public class BcProducto {

    @XmlElementRef(name = "Accion", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accion;
    @XmlElement(name = "HayErrores")
    protected Boolean hayErrores;
    @XmlElementRef(name = "Lista", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProducto> lista;
    @XmlElementRef(name = "Mensaje", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensaje;
    @XmlElementRef(name = "Producto", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer", type = JAXBElement.class, required = false)
    protected JAXBElement<Producto> producto;

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
     *     {@link JAXBElement }{@code <}{@link ArrayOfProducto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProducto> getLista() {
        return lista;
    }

    /**
     * Define el valor de la propiedad lista.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProducto }{@code >}
     *     
     */
    public void setLista(JAXBElement<ArrayOfProducto> value) {
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

}
