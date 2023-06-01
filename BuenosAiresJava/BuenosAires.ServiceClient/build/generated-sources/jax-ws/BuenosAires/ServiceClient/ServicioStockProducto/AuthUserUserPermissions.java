
package BuenosAires.ServiceClient.ServicioStockProducto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para auth_user_user_permissions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="auth_user_user_permissions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth_permission" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}auth_permission" minOccurs="0"/&gt;
 *         &lt;element name="auth_user" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}auth_user" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="permission_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auth_user_user_permissions", propOrder = {
    "authPermission",
    "authUser",
    "id",
    "permissionId",
    "userId"
})
public class AuthUserUserPermissions {

    @XmlElementRef(name = "auth_permission", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthPermission> authPermission;
    @XmlElementRef(name = "auth_user", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthUser> authUser;
    protected Long id;
    @XmlElement(name = "permission_id")
    protected Integer permissionId;
    @XmlElement(name = "user_id")
    protected Integer userId;

    /**
     * Obtiene el valor de la propiedad authPermission.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthPermission }{@code >}
     *     
     */
    public JAXBElement<AuthPermission> getAuthPermission() {
        return authPermission;
    }

    /**
     * Define el valor de la propiedad authPermission.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthPermission }{@code >}
     *     
     */
    public void setAuthPermission(JAXBElement<AuthPermission> value) {
        this.authPermission = value;
    }

    /**
     * Obtiene el valor de la propiedad authUser.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthUser }{@code >}
     *     
     */
    public JAXBElement<AuthUser> getAuthUser() {
        return authUser;
    }

    /**
     * Define el valor de la propiedad authUser.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthUser }{@code >}
     *     
     */
    public void setAuthUser(JAXBElement<AuthUser> value) {
        this.authUser = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad permissionId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * Define el valor de la propiedad permissionId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPermissionId(Integer value) {
        this.permissionId = value;
    }

    /**
     * Obtiene el valor de la propiedad userId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Define el valor de la propiedad userId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserId(Integer value) {
        this.userId = value;
    }

}
