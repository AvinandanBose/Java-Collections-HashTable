import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class PropertiesMethods6 {
    public static void main(String[] args) throws IOException{
        // loadFromXML​(InputStream in)
        Properties properties = new Properties();

        // loadFromXML​(InputStream in)
        InputStream inputStream2 = new FileInputStream("C:\\Users\\bosea\\Java_HashTable\\PropertiesHashtable.xml");
        properties.loadFromXML(inputStream2);
        properties.list(System.out);

    }
}
