import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

public class PropertiesMethods5 {
    // load​(Reader reader)
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        InputStream inputStream1 = new FileInputStream("C:\\Users\\bosea\\Java_HashTable\\Print.txt");
        Reader reader = new InputStreamReader(inputStream1);
        properties.load(reader);
        properties.list(System.out);
    }
}
