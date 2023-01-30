import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
public class PropertiesMethods8 {
    public static void main(String[] args) throws IOException {
        // load​(Reader reader)
        Properties properties = new Properties();
        properties.put("A", "1");
        properties.put("B", "2");
        properties.put("C", "3");
        properties.put("D", "4");
        properties.put("E", "5");
        
        // store​(OutputStream out, String comments)
        OutputStream outputStream = new FileOutputStream("PropertiesMethods.txt");
        properties.store(outputStream, "This is a comment");

        //if make an output stream to a specific location, it will create a file in that location

        OutputStream outputStream1 = new FileOutputStream("C:\\Users\\bosea\\Java_HashTable\\PropertiesMethodsNew.txt");
        properties.store(outputStream1, "This is a comment");
    }
    
}
