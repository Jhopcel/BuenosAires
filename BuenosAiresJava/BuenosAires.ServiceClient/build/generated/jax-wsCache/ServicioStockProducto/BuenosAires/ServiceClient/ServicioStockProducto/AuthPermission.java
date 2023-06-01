
package BuenosAires.ServiceClient.ServicioStockProducto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para auth_permission complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="auth_permission"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth_group_permissions" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}ArrayOfauth_group_permissions" minOccurs="0"/&gt;
 *         &lt;element name="auth_user_user_permissions" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}ArrayOfauth_user_user_permissions" minOccurs="0"/&gt;
 *         &lt;element name="codename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="content_type_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="django_content_type" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}django_content_type" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auth_permission", propOrder = {
    "authGroupPermissions",
    "authUserUserPermissions",
    "codename",
    "contentTypeId",
    "djangoContentType",
    "id",
    "name"
})
public class AuthPermission {

    @XmlElementRef(name = "auth_group_permissions", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfauthGroupPermissions> authGroupPermissions;
    @XmlElementRef(name = "auth_user_user_permissions", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfauthUserUserPermissions> authUserUserPermissions;
    @XmlElementRef(name = "codename", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codename;
    @XmlElement(name = "content_type_id")
    protected Integer contentTypeId;
    @XmlElementRef(name = "django_content_type", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<DjangoContentType> djangoContentType;
    protected Integer id;
    @XmlElementRef(name = "name", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;

    /**
     * Obtiene el valor de la propiedad authGroupPermissions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfauthGroupPermissions }{@code >}
     *     
     */
    public JAXBElement<ArrayOfauthGroupPermissions> getAuthGroupPermissions() {
        return authGroupPermissions;
    }

    /**
     * Define el valor de la propiedad authGroupPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfauthGroupPermissions }{@code >}
     *     
     */
    public void setAuthGroupPermissions(JAXBElement<ArrayOfauthGroupPermissions> value) {
        this.authGroupPermissions = value;
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
     * Obtiene el valor de la propiedad codename.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodename() {
        return codename;
    }

    /**
     * Define el valor de la propiedad codename.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodename(JAXBElement<String> value) {
        this.codename = value;
    }

    /**
     * Obtiene el valor de la propiedad contentTypeId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContentTypeId() {
        return contentTypeId;
    }

    /**
     * Define el valor de la propiedad contentTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContentTypeId(Integer value) {
        this.contentTypeId = value;
    }

    /**
     * Obtiene el valor de la propiedad djangoContentType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DjangoContentType }{@code >}
     *     
     */
    public JAXBElement<DjangoContentType> getDjangoContentType() {
        return djangoContentType;
    }

    /**
     * Define el valor de la propiedad djangoContentType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DjangoContentType }{@code >}
     *     
     */
    public void setDjangoContentType(JAXBElement<DjangoContentType> value) {
        this.djangoContentType = value;
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
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

}
