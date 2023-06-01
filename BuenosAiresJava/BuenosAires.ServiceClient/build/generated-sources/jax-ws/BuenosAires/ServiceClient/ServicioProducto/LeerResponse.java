
package BuenosAires.ServiceClient.ServicioProducto;

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
 *         &lt;element name="LeerResult" type="{http://schemas.datacontract.org/2004/07/}Respuesta" minOccurs="0"/&gt;
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
    "leerResult"
})
@XmlRootElement(name = "LeerResponse", namespace = "http://tempuri.org/")
public class LeerResponse {

    @XmlElementRef(name = "LeerResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Respuesta> leerResult;

    /**
     * Obtiene el valor de la propiedad leerResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     *     
     */
    public JAXBElement<Respuesta> getLeerResult() {
        return leerResult;
    }

    /**
     * Define el valor de la propiedad leerResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Respuesta }{@code >}
     *     
     */
    public void setLeerResult(JAXBElement<Respuesta> value) {
        this.leerResult = value;
    }

}
