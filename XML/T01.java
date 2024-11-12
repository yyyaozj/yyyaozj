package XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class T01 {


    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document= builder.parse("src/XML/books.xml");
            NodeList list = document.getElementsByTagName("book");
            for (int i = 0; i<list.getLength();i++)
            {
                Element book = (Element) list.item(i);
                String id = book.getAttribute("id");
                String name = book.getElementsByTagName("name")
                        .item(0).getFirstChild().getNodeValue();

                String price = book.getElementsByTagName("price")
                        .item(0).getFirstChild().getNodeValue();

                String author = book.getElementsByTagName("author")
                        .item(0).getFirstChild().getNodeValue();

                System.out.println(id+"\t"+name+"\t"+price+"\t"+author);
            }
        } catch ( Exception e) {
           e.printStackTrace();
        }
    }
}
