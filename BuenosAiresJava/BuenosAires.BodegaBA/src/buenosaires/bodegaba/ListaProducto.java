package buenosaires.bodegaba;

import BuenosAires.ServiceClient.Serializadores.XMLSerializer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ListaProducto")
public class ListaProducto extends ArrayList<Producto> {
 
    public ListaProducto() {
        
    }
    
    public List<Producto> getListaProducto() {
        return this;
    }
    
    public void addProducto(Producto producto) {
        this.add(producto);
    }
    
    public void addProductoXml(String xml) {
        try {
            Producto producto = (Producto)XMLSerializer.deserialize(xml, Producto.class);
            this.add(producto);
        } catch (JAXBException ex) {
            Logger.getLogger(ListaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public String toString() {
        String s = "";
        for (Producto prod : this) {
            s += prod.toString() + "\n"; 
        }
        return s;
    }
}