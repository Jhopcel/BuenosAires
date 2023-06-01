package buenosaires.bodegaba;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Producto")
public class Producto {
    
    @XmlElement(name = "idprod")
    protected int idprod;
    
    @XmlElement(name = "nomprod")
    protected String nomprod;
    
    @XmlElement(name = "descprod")
    protected String descprod;
    
    @XmlElement(name = "precio")
    protected int precio;
    
    @XmlElement(name = "imagen")
    protected String imagen;

    public Producto() {
    }

    public int getIdProd() {
        return idprod;
    }

    public void setIdProd(int idprod) {
        this.idprod = idprod;
    }

    public String getNomProd() {
        return nomprod;
    }

    public void setNomProd(String nomprod) {
        this.nomprod = nomprod;
    }

    public String getDescProd() {
        return descprod;
    }

    public void setDescProd(String descprod) {
        this.descprod = descprod;
    }

    public int getPrecioProd() {
        return precio;
    }

    public void setPrecioProd(int precio) {
        this.precio = precio;
    }

    public String getImagenProd() {
        return imagen;
    }

    public void setImagenProd(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Producto{" + "idprod=" + idprod + ", nomprod=" + nomprod + ", descprod=" + descprod + ", precio=" + precio + ", imagen=" + imagen + '}';
    }
    
}