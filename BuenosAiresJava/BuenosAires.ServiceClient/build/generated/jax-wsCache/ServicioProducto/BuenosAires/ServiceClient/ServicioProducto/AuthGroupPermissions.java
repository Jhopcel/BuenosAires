
package BuenosAires.ServiceClient.ServicioProducto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para auth_group_permissions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="auth_group_permissions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth_group" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}auth_group" minOccurs="0"/&gt;
 *         &lt;element name="auth_permission" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}auth_permission" minOccurs="0"/&gt;
 *         &lt;element name="group_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="permission_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auth_group_permissions", propOrder = {
    "authGroup",
    "authPermission",
    "groupId",
    "id",
    "permissionId"
})
public class AuthGroupPermissions {

    @XmlElementRef(name = "auth_group", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthGroup> authGroup;
    @XmlElementRef(name = "auth_permission", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthPermission> authPermission;
    @XmlElement(name = "group_id")
    protected Integer groupId;
    protected Long id;
    @XmlElement(name = "permission_id")
    protected Integer permissionId;

    /**
     * Obtiene el valor de la propiedad authGroup.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthGroup }{@code >}
     *     
     */
    public JAXBElement<AuthGroup> getAuthGroup() {
        return authGroup;
    }

    /**
     * Define el valor de la propiedad authGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthGroup }{@code >}
     *     
     */
    public void setAuthGroup(JAXBElement<AuthGroup> value) {
        this.authGroup = value;
    }

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
     * Obtiene el valor de la propiedad groupId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * Define el valor de la propiedad groupId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupId(Integer value) {
        this.groupId = value;
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

}
