import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
public class PropertiesMethods12 {
    public static void main(String[] args)throws IOException {
        Properties properties = new Properties();
        properties.put("A", "1");
        properties.put("B", "2");
        properties.put("C", "3");
        properties.put("D", "4");
        System.out.println("Properties elements:" +properties);

        // storeToXML​(OutputStream os, String comment)
        OutputStream outputStream1 = new FileOutputStream("PropertiesMethods.xml");
        properties.storeToXML(outputStream1, "This is a comment");

        // if make an output stream to a specific location, it will create a XML file in
        // that location

        // storeToXML​(OutputStream os, String comment)
        OutputStream outputStream2 = new FileOutputStream("C:\\Users\\bosea\\Java_HashTable\\PropertiesMethods1.xml");
        properties.storeToXML(outputStream2, "This is a comment");
    }
    
}
