
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
 *         &lt;element name="stockProducto" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}StockProducto" minOccurs="0"/&gt;
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
    "stockProducto"
})
@XmlRootElement(name = "ValidarStockProducto", namespace = "http://tempuri.org/")
public class ValidarStockProducto {

    @XmlElementRef(name = "stockProducto", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<StockProducto> stockProducto;

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
