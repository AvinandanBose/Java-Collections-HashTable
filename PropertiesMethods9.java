import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesMethods9 {
    public static void main(String[] args) throws IOException{
        Properties properties = new Properties();
        properties.put("A", "1");
        properties.put("B", "2");
        properties.put("C", "3");
        properties.put("D", "4");
        
    // save​(OutputStream out, String comments)
        OutputStream outputStream1 = new FileOutputStream("PropertiesMethodsNew1.txt");
        properties.save(outputStream1, "This is a comment"); //Deprecated

        // if make an output stream to a specific location, it will create a file in
        // that location

        OutputStream outputStream2 = new FileOutputStream("C:\\Users\\bosea\\Java_HashTable\\PropertiesMethods1.txt");
        properties.save(outputStream2, "This is a comment"); // Deprecated
    }
}
