import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class PropertiesMethods4 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
     //load​(InputStream inStream)
        InputStream inputStream = new FileInputStream("C:\\Users\\bosea\\Java_HashTable\\Print.txt");
        properties.load(inputStream);
        properties.list(System.out);
    }
}
