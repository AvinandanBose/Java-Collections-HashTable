import java.io.PrintWriter;
import java.util.Properties;
public class PropertiesMethods3 {
    public static void main(String[] args){
        // list​(PrintWriter out)
        Properties properties = new Properties();
        properties.put("A", "1");
        properties.put("B", "2");
        properties.put("C", "3");
        properties.put("D", "4");
        System.out.println("Properties elements:" + properties);

        // list​(PrintWriter out)
        PrintWriter writer = new PrintWriter(System.out);
        properties.list(writer);
        writer.flush();
    }
}
