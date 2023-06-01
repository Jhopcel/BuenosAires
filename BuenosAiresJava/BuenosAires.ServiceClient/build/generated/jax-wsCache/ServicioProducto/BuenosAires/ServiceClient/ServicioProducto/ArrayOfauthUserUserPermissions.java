
package BuenosAires.ServiceClient.ServicioProducto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfauth_user_user_permissions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfauth_user_user_permissions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth_user_user_permissions" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}auth_user_user_permissions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfauth_user_user_permissions", propOrder = {
    "authUserUserPermissions"
})
public class ArrayOfauthUserUserPermissions {

    @XmlElement(name = "auth_user_user_permissions", nillable = true)
    protected List<AuthUserUserPermissions> authUserUserPermissions;

    /**
     * Gets the value of the authUserUserPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authUserUserPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthUserUserPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthUserUserPermissions }
     * 
     * 
     */
    public List<AuthUserUserPermissions> getAuthUserUserPermissions() {
        if (authUserUserPermissions == null) {
            authUserUserPermissions = new ArrayList<AuthUserUserPermissions>();
        }
        return this.authUserUserPermissions;
    }

}
