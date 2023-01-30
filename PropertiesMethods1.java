import java.util.Properties;
public class PropertiesMethods1 {
    public static void main(String[] args){
        Properties properties = new Properties();
        properties.put("A", "1");
        properties.put("B", "2");
        properties.put("C", "3");
        properties.put("D", "4");
        System.out.println("Properties elements:" + properties);
        // getProperty​(String key, String defaultValue)
        String value2 = properties.getProperty("G", "7");
        System.out.println("Value of G is: " + value2);
    }
}
