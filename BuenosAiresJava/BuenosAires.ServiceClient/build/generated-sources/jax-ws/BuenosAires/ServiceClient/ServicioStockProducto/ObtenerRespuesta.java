
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
 *         &lt;element name="bc" type="{http://schemas.datacontract.org/2004/07/BuenosAires.BusinessLayer}BcStockProducto" minOccurs="0"/&gt;
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
    "bc"
})
@XmlRootElement(name = "ObtenerRespuesta", namespace = "http://tempuri.org/")
public class ObtenerRespuesta {

    @XmlElementRef(name = "bc", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<BcStockProducto> bc;

    /**
     * Obtiene el valor de la propiedad bc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BcStockProducto }{@code >}
     *     
     */
    public JAXBElement<BcStockProducto> getBc() {
        return bc;
    }

    /**
     * Define el valor de la propiedad bc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BcStockProducto }{@code >}
     *     
     */
    public void setBc(JAXBElement<BcStockProducto> value) {
        this.bc = value;
    }

}
