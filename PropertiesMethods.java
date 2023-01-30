import java.util.Properties;

public class PropertiesMethods {
    public static void main(String[] args) {
        Properties properties = new Properties();
        // Put
        properties.put("A", "1");
        properties.put("B", "2");
        properties.put("C", "3");
        properties.put("D", "4");

        System.out.println("Properties elements:" + properties);

        // getProperty​(String key)
        String value = properties.getProperty("A");
        System.out.println("Value of A is: " + value);

    }
}
