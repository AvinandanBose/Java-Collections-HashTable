import java.util.Properties;
import java.util.Set;
public class PropertiesMethods15 {
    public static void main(String[] args)  {
        Properties properties = new Properties();
        properties.put("A", "1");
        properties.put("B", "2");
        properties.put("C", "3");
        properties.put("D", "4");
        properties.put("E", "5");
        properties.put("F", "6");
        System.out.println("Properties elements:" +properties);

        // stringPropertyNames()
        Set<?> set = properties.stringPropertyNames();
        System.out.println(set);
    }
}
