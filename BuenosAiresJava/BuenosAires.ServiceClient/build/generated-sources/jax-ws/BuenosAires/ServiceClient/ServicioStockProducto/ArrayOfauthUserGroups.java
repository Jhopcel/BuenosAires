
package BuenosAires.ServiceClient.ServicioStockProducto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfauth_user_groups complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfauth_user_groups"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth_user_groups" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}auth_user_groups" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfauth_user_groups", propOrder = {
    "authUserGroups"
})
public class ArrayOfauthUserGroups {

    @XmlElement(name = "auth_user_groups", nillable = true)
    protected List<AuthUserGroups> authUserGroups;

    /**
     * Gets the value of the authUserGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authUserGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthUserGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthUserGroups }
     * 
     * 
     */
    public List<AuthUserGroups> getAuthUserGroups() {
        if (authUserGroups == null) {
            authUserGroups = new ArrayList<AuthUserGroups>();
        }
        return this.authUserGroups;
    }

}
