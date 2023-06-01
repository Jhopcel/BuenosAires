package buenosaires.bodegaba;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import java.io.StringReader;
import java.util.ArrayList;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 *
 * @author cgome
 */
public class XMLSerializerList {

    public static ArrayList<String> getProductoStringsFromXML_1(String xml) throws XMLStreamException {
        ArrayList<String> productoStrings = new ArrayList<>();
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(new StringReader(xml));
        String productoXml = null;
        while (xmlStreamReader.hasNext()) {
            int event = xmlStreamReader.next();
            switch (event) {
                case XMLStreamConstants.START_ELEMENT:
                    if (xmlStreamReader.getLocalName().equals("Producto")) {
                        productoXml = "<Producto>";
                    } else if (productoXml != null) {
                        productoXml += "<" + xmlStreamReader.getLocalName() + ">";
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    if (xmlStreamReader.getLocalName().equals("Producto")) {
                        productoXml += "</Producto>";
                        productoStrings.add(productoXml);
                        productoXml = null;
                    } else if (productoXml != null) {
                        productoXml += "</" + xmlStreamReader.getLocalName() + ">";
                    }
                    break;
                case XMLStreamConstants.CHARACTERS:
                    if (productoXml != null) {
                        productoXml += xmlStreamReader.getText();
                    }
                    break;
                default:
                    break;
            }
        }
        return productoStrings;
    }
    
}
