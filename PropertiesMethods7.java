import java.util.Enumeration;
import java.util.Properties;

public class PropertiesMethods7 {
    public static void main(String[] args) {
        
        Properties properties = new Properties();
        properties.put("A", "1");
        properties.put("B", "2");
        properties.put("C", "3");
        properties.put("D", "4");
        properties.put("E", "5");
        properties.put("F", "6");
        System.out.println("Properties elements:" +properties);

        // propertyNames()
        Enumeration<?> e = properties.propertyNames();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }
}
