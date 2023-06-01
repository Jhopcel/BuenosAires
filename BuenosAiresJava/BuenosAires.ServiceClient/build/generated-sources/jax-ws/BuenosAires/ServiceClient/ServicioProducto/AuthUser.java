
package BuenosAires.ServiceClient.ServicioProducto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para auth_user complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="auth_user"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PerfilUsuario" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}ArrayOfPerfilUsuario" minOccurs="0"/&gt;
 *         &lt;element name="auth_user_groups" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}ArrayOfauth_user_groups" minOccurs="0"/&gt;
 *         &lt;element name="auth_user_user_permissions" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}ArrayOfauth_user_user_permissions" minOccurs="0"/&gt;
 *         &lt;element name="date_joined" type="{http://schemas.datacontract.org/2004/07/System}DateTimeOffset" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="is_active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="is_staff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="is_superuser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="last_login" type="{http://schemas.datacontract.org/2004/07/System}DateTimeOffset" minOccurs="0"/&gt;
 *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auth_user", propOrder = {
    "perfilUsuario",
    "authUserGroups",
    "authUserUserPermissions",
    "dateJoined",
    "email",
    "firstName",
    "id",
    "isActive",
    "isStaff",
    "isSuperuser",
    "lastLogin",
    "lastName",
    "password",
    "username"
})
public class AuthUser {

    @XmlElementRef(name = "PerfilUsuario", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPerfilUsuario> perfilUsuario;
    @XmlElementRef(name = "auth_user_groups", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfauthUserGroups> authUserGroups;
    @XmlElementRef(name = "auth_user_user_permissions", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfauthUserUserPermissions> authUserUserPermissions;
    @XmlElement(name = "date_joined")
    protected DateTimeOffset dateJoined;
    @XmlElementRef(name = "email", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "first_name", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    protected Integer id;
    @XmlElement(name = "is_active")
    protected Boolean isActive;
    @XmlElement(name = "is_staff")
    protected Boolean isStaff;
    @XmlElement(name = "is_superuser")
    protected Boolean isSuperuser;
    @XmlElement(name = "last_login")
    protected DateTimeOffset lastLogin;
    @XmlElementRef(name = "last_name", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "password", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "username", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> username;

    /**
     * Obtiene el valor de la propiedad perfilUsuario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPerfilUsuario }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPerfilUsuario> getPerfilUsuario() {
        return perfilUsuario;
    }

    /**
     * Define el valor de la propiedad perfilUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPerfilUsuario }{@code >}
     *     
     */
    public void setPerfilUsuario(JAXBElement<ArrayOfPerfilUsuario> value) {
        this.perfilUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad authUserGroups.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfauthUserGroups }{@code >}
     *     
     */
    public JAXBElement<ArrayOfauthUserGroups> getAuthUserGroups() {
        return authUserGroups;
    }

    /**
     * Define el valor de la propiedad authUserGroups.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfauthUserGroups }{@code >}
     *     
     */
    public void setAuthUserGroups(JAXBElement<ArrayOfauthUserGroups> value) {
        this.authUserGroups = value;
    }

    /**
     * Obtiene el valor de la propiedad authUserUserPermissions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfauthUserUserPermissions }{@code >}
     *     
     */
    public JAXBElement<ArrayOfauthUserUserPermissions> getAuthUserUserPermissions() {
        return authUserUserPermissions;
    }

    /**
     * Define el valor de la propiedad authUserUserPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfauthUserUserPermissions }{@code >}
     *     
     */
    public void setAuthUserUserPermissions(JAXBElement<ArrayOfauthUserUserPermissions> value) {
        this.authUserUserPermissions = value;
    }

    /**
     * Obtiene el valor de la propiedad dateJoined.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeOffset }
     *     
     */
    public DateTimeOffset getDateJoined() {
        return dateJoined;
    }

    /**
     * Define el valor de la propiedad dateJoined.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeOffset }
     *     
     */
    public void setDateJoined(DateTimeOffset value) {
        this.dateJoined = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad firstName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Define el valor de la propiedad firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad isActive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Define el valor de la propiedad isActive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Obtiene el valor de la propiedad isStaff.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStaff() {
        return isStaff;
    }

    /**
     * Define el valor de la propiedad isStaff.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStaff(Boolean value) {
        this.isStaff = value;
    }

    /**
     * Obtiene el valor de la propiedad isSuperuser.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSuperuser() {
        return isSuperuser;
    }

    /**
     * Define el valor de la propiedad isSuperuser.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSuperuser(Boolean value) {
        this.isSuperuser = value;
    }

    /**
     * Obtiene el valor de la propiedad lastLogin.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeOffset }
     *     
     */
    public DateTimeOffset getLastLogin() {
        return lastLogin;
    }

    /**
     * Define el valor de la propiedad lastLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeOffset }
     *     
     */
    public void setLastLogin(DateTimeOffset value) {
        this.lastLogin = value;
    }

    /**
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad username.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsername() {
        return username;
    }

    /**
     * Define el valor de la propiedad username.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsername(JAXBElement<String> value) {
        this.username = value;
    }

}
