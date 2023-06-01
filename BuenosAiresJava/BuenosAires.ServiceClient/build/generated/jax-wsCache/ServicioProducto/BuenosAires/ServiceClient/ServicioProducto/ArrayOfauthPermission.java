
package BuenosAires.ServiceClient.ServicioProducto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfauth_permission complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfauth_permission"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth_permission" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}auth_permission" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfauth_permission", propOrder = {
    "authPermission"
})
public class ArrayOfauthPermission {

    @XmlElement(name = "auth_permission", nillable = true)
    protected List<AuthPermission> authPermission;

    /**
     * Gets the value of the authPermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authPermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthPermission }
     * 
     * 
     */
    public List<AuthPermission> getAuthPermission() {
        if (authPermission == null) {
            authPermission = new ArrayList<AuthPermission>();
        }
        return this.authPermission;
    }

}
