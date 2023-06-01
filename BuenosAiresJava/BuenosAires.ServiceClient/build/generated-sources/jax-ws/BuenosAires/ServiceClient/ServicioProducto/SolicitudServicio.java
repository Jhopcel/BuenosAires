
package BuenosAires.ServiceClient.ServicioProducto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para SolicitudServicio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SolicitudServicio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Factura" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}Factura" minOccurs="0"/&gt;
 *         &lt;element name="PerfilUsuario" type="{http://schemas.datacontract.org/2004/07/BuenosAires.Model}PerfilUsuario" minOccurs="0"/&gt;
 *         &lt;element name="descsol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadosol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechavisita" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="nrofac" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nrosol" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ruttec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tiposol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitudServicio", propOrder = {
    "factura",
    "perfilUsuario",
    "descsol",
    "estadosol",
    "fechavisita",
    "nrofac",
    "nrosol",
    "ruttec",
    "tiposol"
})
public class SolicitudServicio {

    @XmlElementRef(name = "Factura", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<Factura> factura;
    @XmlElementRef(name = "PerfilUsuario", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<PerfilUsuario> perfilUsuario;
    @XmlElementRef(name = "descsol", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descsol;
    @XmlElementRef(name = "estadosol", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadosol;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechavisita;
    protected Integer nrofac;
    protected Integer nrosol;
    @XmlElementRef(name = "ruttec", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ruttec;
    @XmlElementRef(name = "tiposol", namespace = "http://schemas.datacontract.org/2004/07/BuenosAires.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tiposol;

    /**
     * Obtiene el valor de la propiedad factura.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Factura }{@code >}
     *     
     */
    public JAXBElement<Factura> getFactura() {
        return factura;
    }

    /**
     * Define el valor de la propiedad factura.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Factura }{@code >}
     *     
     */
    public void setFactura(JAXBElement<Factura> value) {
        this.factura = value;
    }

    /**
     * Obtiene el valor de la propiedad perfilUsuario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PerfilUsuario }{@code >}
     *     
     */
    public JAXBElement<PerfilUsuario> getPerfilUsuario() {
        return perfilUsuario;
    }

    /**
     * Define el valor de la propiedad perfilUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PerfilUsuario }{@code >}
     *     
     */
    public void setPerfilUsuario(JAXBElement<PerfilUsuario> value) {
        this.perfilUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad descsol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescsol() {
        return descsol;
    }

    /**
     * Define el valor de la propiedad descsol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescsol(JAXBElement<String> value) {
        this.descsol = value;
    }

    /**
     * Obtiene el valor de la propiedad estadosol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadosol() {
        return estadosol;
    }

    /**
     * Define el valor de la propiedad estadosol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadosol(JAXBElement<String> value) {
        this.estadosol = value;
    }

    /**
     * Obtiene el valor de la propiedad fechavisita.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechavisita() {
        return fechavisita;
    }

    /**
     * Define el valor de la propiedad fechavisita.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechavisita(XMLGregorianCalendar value) {
        this.fechavisita = value;
    }

    /**
     * Obtiene el valor de la propiedad nrofac.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNrofac() {
        return nrofac;
    }

    /**
     * Define el valor de la propiedad nrofac.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNrofac(Integer value) {
        this.nrofac = value;
    }

    /**
     * Obtiene el valor de la propiedad nrosol.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNrosol() {
        return nrosol;
    }

    /**
     * Define el valor de la propiedad nrosol.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNrosol(Integer value) {
        this.nrosol = value;
    }

    /**
     * Obtiene el valor de la propiedad ruttec.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRuttec() {
        return ruttec;
    }

    /**
     * Define el valor de la propiedad ruttec.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRuttec(JAXBElement<String> value) {
        this.ruttec = value;
    }

    /**
     * Obtiene el valor de la propiedad tiposol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTiposol() {
        return tiposol;
    }

    /**
     * Define el valor de la propiedad tiposol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTiposol(JAXBElement<String> value) {
        this.tiposol = value;
    }

}
