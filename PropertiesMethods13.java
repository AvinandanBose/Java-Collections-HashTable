import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
public class PropertiesMethods13 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.put("A", "1");
        properties.put("B", "2");
        properties.put("C", "3");
        properties.put("D", "4");
        properties.put("E", "5");
        properties.put("F", "6");
        System.out.println("Properties elements:" +properties);

        
        // storeToXML​(OutputStream os, String comment, String encoding)
        OutputStream outputStream = new FileOutputStream("PropertiesMethods3.xml");
        properties.storeToXML(outputStream, "This is a comment", "UTF-8");


        // To make an output stream to a specific location, it will create a XML file in
        // that location

        OutputStream outputStream1 = new FileOutputStream("C:\\Users\\bosea\\Java_HashTable\\PropertiesMethods4.xml");
        properties.storeToXML(outputStream1, "This is a comment", "UTF-8");
    }
    
}
