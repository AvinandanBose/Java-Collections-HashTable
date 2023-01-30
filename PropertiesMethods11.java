import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;
public class PropertiesMethods11 {
    public static void main(String[] args)throws IOException {
        Properties properties = new Properties();
        properties.put("A", "1");
        properties.put("B", "2");
        properties.put("C", "3");
        properties.put("D", "4");
        
        // store​(Writer writer, String comments)
        Writer writer1 = new FileWriter("PropertiesMethods2.txt");
        properties.store(writer1, "This is a comment");

        // if make an output stream to a specific location, it will create a file in that location

        Writer writer2 = new FileWriter("C:\\Users\\bosea\\Java_HashTable\\PropertiesMethods3.txt");
        properties.store(writer2, "This is a comment");

    }
}
