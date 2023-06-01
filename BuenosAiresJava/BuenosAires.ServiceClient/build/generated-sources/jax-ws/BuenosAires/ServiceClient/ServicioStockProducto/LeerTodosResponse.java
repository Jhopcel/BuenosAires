
package BuenosAires.ServiceClient.ServicioStockProducto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LeerTodosResult" type="{http://schemas.datacontract.org/2004/07/}Respuesta" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "leerTodosResult"
})
@XmlRootElement(name = "LeerTodosResponse", namespace = "http://tempuri.org/")
public class LeerTodosResponse {

    @XmlElementRef(name = "LeerTodosResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Respuesta> leerTodosResult;

    /**
     * Obtiene el valor de la propiedad leerTodosResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     *     
     */
    public JAXBElement<Respuesta> getLeerTodosResult() {
        return leerTodosResult;
    }

    /**
     * Define el valor de la propiedad leerTodosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     *     
     */
    public void setLeerTodosResult(JAXBElement<Respuesta> value) {
        this.leerTodosResult = value;
    }

}
