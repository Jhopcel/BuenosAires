
package BuenosAires.ServiceClient.ServicioProducto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfauth_group_permissions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfauth_group_permissions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth_group_permissions" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}auth_group_permissions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfauth_group_permissions", propOrder = {
    "authGroupPermissions"
})
public class ArrayOfauthGroupPermissions {

    @XmlElement(name = "auth_group_permissions", nillable = true)
    protected List<AuthGroupPermissions> authGroupPermissions;

    /**
     * Gets the value of the authGroupPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authGroupPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthGroupPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthGroupPermissions }
     * 
     * 
     */
    public List<AuthGroupPermissions> getAuthGroupPermissions() {
        if (authGroupPermissions == null) {
            authGroupPermissions = new ArrayList<AuthGroupPermissions>();
        }
        return this.authGroupPermissions;
    }

}
