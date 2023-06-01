
package BuenosAires.ServiceClient.ServicioProducto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfSolicitudServicio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSolicitudServicio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SolicitudServicio" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}SolicitudServicio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSolicitudServicio", propOrder = {
    "solicitudServicio"
})
public class ArrayOfSolicitudServicio {

    @XmlElement(name = "SolicitudServicio", nillable = true)
    protected List<SolicitudServicio> solicitudServicio;

    /**
     * Gets the value of the solicitudServicio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solicitudServicio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolicitudServicio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SolicitudServicio }
     * 
     * 
     */
    public List<SolicitudServicio> getSolicitudServicio() {
        if (solicitudServicio == null) {
            solicitudServicio = new ArrayList<SolicitudServicio>();
        }
        return this.solicitudServicio;
    }

}
