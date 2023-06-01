
package BuenosAires.ServiceClient.ServicioStockProducto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfStockProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStockProducto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StockProducto" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}StockProducto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStockProducto", propOrder = {
    "stockProducto"
})
public class ArrayOfStockProducto {

    @XmlElement(name = "StockProducto", nillable = true)
    protected List<StockProducto> stockProducto;

    /**
     * Gets the value of the stockProducto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockProducto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockProducto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockProducto }
     * 
     * 
     */
    public List<StockProducto> getStockProducto() {
        if (stockProducto == null) {
            stockProducto = new ArrayList<StockProducto>();
        }
        return this.stockProducto;
    }

}
