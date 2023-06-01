package buenosaires.bodegaba;

import BuenosAires.ServiceClient.ServicioProducto.ServicioProducto;
import BuenosAires.ServiceClient.Serializadores.XMLSerializer;
import java.util.List;
import javax.xml.bind.JAXBException;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.xml.stream.XMLStreamException;
        
public class BuenosAiresBodegaBA {

    public static void main(String[] args) throws JAXBException {
        
        getProductoFromWsXMLProducto(true);
        getWsListaProducto(true);
        
        //getProductoFromWsXMLProducto(true);
        //getWsXmlListaProducto(true);
        //getProductoFromProductoConDatos(true);
        
    }
    
    public static ListaProducto getWsListaProducto(Boolean show) {
        var ws = new ServicioProducto();
        var port = ws.getBasicHttpBindingIServicioProducto();
        BuenosAires.ServiceClient.ServicioProducto.Respuesta resp = port.leerTodos();
        String xml = resp.getXmlListaProducto().getValue();
        
        List<String> listaXmlElements;
        ListaProducto lista = new ListaProducto();
        try {
            listaXmlElements = XMLSerializer.getXmlElelemnts(xml, "Producto");
            for (String xmlProd : listaXmlElements) {
                lista.addProductoXml(xmlProd);
            }
            System.out.println(lista.toString());
        } catch (XMLStreamException ex) {
            Logger.getLogger(BuenosAiresBodegaBA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public static String getWsXmlProducto(Boolean show) {
        var ws = new ServicioProducto();
        var port = ws.getBasicHttpBindingIServicioProducto();
        BuenosAires.ServiceClient.ServicioProducto.Respuesta resp = port.leer(1);
        String xml = resp.getXmlProducto().getValue();
        if (show) {
            System.out.println(xml);
            System.out.println("");
        }
        return xml;
    }
    
    public static Producto getProductoFromWsXMLProducto(Boolean show) {
        try {
            String xml = getWsXmlProducto(show);
            Producto p = (Producto)XMLSerializer.deserialize(xml, Producto.class);
            if (show) {
                System.out.println(xml);
                System.out.println("");
                System.out.println(p.toString());
                System.out.println("");
            }
            return p;
        }
        catch(JAXBException ex) {
            Logger.getLogger(BuenosAiresBodegaBA.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    /*
    public static Producto getProductoConDatos() {
        Producto p = new Producto();
        p.setIdProd(1);
        p.setNomProd("Aire Nombre");
        p.setDescProd("Aire Descripcion");
        p.setPrecioProd(123);
        p.setImagenProd("001.png");
        return p;
    }
    
    public static ArrayOfProducto getArrayOfProductoConDatos() {
        var arrayOfProducto = new ArrayOfProducto();
        Producto p1 = new Producto();
        p1.setIdProd(1);
        p1.setNomProd("Aire N1");
        p1.setDescProd("Aire D1");
        p1.setPrecioProd(111);
        p1.setImagenProd("111.png");
        arrayOfProducto.add(p1);
        Producto p2 = new Producto();
        p2.setIdProd(2);
        p2.setNomProd("Aire N2");
        p2.setDescProd("Aire D2");
        p2.setPrecioProd(222);
        p2.setImagenProd("222.png");
        arrayOfProducto.add(p2);
        return arrayOfProducto;
    }
    
    public static Producto getProductoFromProductoConDatos(Boolean show) {
        try {
            String xml = XMLSerializer.serialize(getProductoConDatos());
            Producto p = (Producto)XMLSerializer.deserialize(xml, Producto.class);
            if (show) {
                System.out.println(xml);
                System.out.println("");
                System.out.println(p.toString());
                System.out.println("");
            }
            return p;
        }
        catch(JAXBException ex) {
            Logger.getLogger(BuenosAiresBodegaBA.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static ArrayOfProducto getArrayOfProductoFromArrayOfProductoConDatos(Boolean show) {
        var ws = new ServicioProducto();
        var port = ws.getBasicHttpBindingIServicioProducto();
        BuenosAires.ServiceClient.ServicioProducto.Respuesta resp = port.leerTodos();
        String xml = resp.getXmlListaProducto().getValue();
        
        List<String> listaXmlElements;
        ArrayOfProducto lista = new ArrayOfProducto();
        try {
            listaXmlElements = XMLSerializer.getXmlElelemnts(xml, "Producto");
            for (String xmlProd : listaXmlElements) {
                lista.add(xmlProd);
            }
            System.out.println(lista.toString());
        } catch (XMLStreamException ex) {
            Logger.getLogger(BuenosAiresBodegaBA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public static String getWsXmlListaProducto(Boolean show) {
        var ws = new ServicioProducto();
        var port = ws.getBasicHttpBindingIServicioProducto();
        BuenosAires.ServiceClient.ServicioProducto.Respuesta resp = port.leerTodos();
        String xml = resp.getXmlListaProducto().getValue();
        if (show) {
            System.out.println(xml);
            System.out.println("");
        }
        return xml;
    }
    */
}
