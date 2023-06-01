
package BuenosAires.ServiceClient.ServicioStockProducto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfGuiaDespacho complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGuiaDespacho"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuiaDespacho" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}GuiaDespacho" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuiaDespacho", propOrder = {
    "guiaDespacho"
})
public class ArrayOfGuiaDespacho {

    @XmlElement(name = "GuiaDespacho", nillable = true)
    protected List<GuiaDespacho> guiaDespacho;

    /**
     * Gets the value of the guiaDespacho property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guiaDespacho property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuiaDespacho().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuiaDespacho }
     * 
     * 
     */
    public List<GuiaDespacho> getGuiaDespacho() {
        if (guiaDespacho == null) {
            guiaDespacho = new ArrayList<GuiaDespacho>();
        }
        return this.guiaDespacho;
    }

}
