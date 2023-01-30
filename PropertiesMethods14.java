import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Properties;
public class PropertiesMethods14 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.put("A", "1");
        properties.put("B", "2");
        properties.put("C", "3");
        properties.put("D", "4");
        properties.put("E", "5");
        properties.put("F", "6");
        properties.put("G", "7");
        properties.put("H", "8");
        properties.put("I", "9");
        properties.put("J", "10");
        System.out.println("Properties elements:" + properties);


        // storeToXML​(OutputStream os, String comment, Charset charset)
        Charset charset = Charset.forName("UTF-8");
        OutputStream outputStream = new FileOutputStream("PropertiesMethods5.xml");
        properties.storeToXML(outputStream, "This is a comment", charset);


        // To make an output stream to a specific location, it will create a XML file in
        // that location
        
        // storeToXML​(OutputStream os, String comment, Charset charset)
        Charset charset1 = Charset.forName("ASCII");
        OutputStream outputStream1 = new FileOutputStream("C:\\Users\\bosea\\Java_HashTable\\PropertiesMethods6.xml");
        properties.storeToXML(outputStream1, "This is a comment", charset1);
        
    }
}
