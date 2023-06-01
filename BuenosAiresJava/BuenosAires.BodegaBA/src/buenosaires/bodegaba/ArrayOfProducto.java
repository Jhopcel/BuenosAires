package buenosaires.bodegaba;

import BuenosAires.ServiceClient.Serializadores.XMLSerializer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ArrayOfProducto")
public class ArrayOfProducto {
 
    private List<Producto> productoList;
    
    public ArrayOfProducto() {
        this.productoList = new ArrayList<>();
    }
    
    public List<Producto> getListProducto() {
        return productoList;
    }
    
    public void add(Producto producto) {
        this.productoList.add(producto);
    }
    
    public void add(String xml) {
        try {
            Producto producto = (Producto)XMLSerializer.deserialize(xml, Producto.class);
            this.productoList.add(producto);
        } catch (JAXBException ex) {
            Logger.getLogger(ArrayOfProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public String toString() {
        String s = "";
        for (Producto prod:this.productoList) {
            s += prod.toString() + "\n"; 
        }
        return s;
    }
}