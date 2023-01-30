import java.util.Properties;
public class PropertiesConstructor2 {
    public static void main(String[] args) {
                   
        Properties properties = new Properties();
        properties.put("A", "1");
        properties.put("B", "2");
        properties.put("C", "3");

        System.out.println("Properties elements:" +properties);

        Properties properties2 = new Properties(properties);
        properties2.put("D", "4");
        properties2.put("E", "5");
        properties2.put("F", "6");

        System.out.println("Properties elements:" +properties2);

        

    }
}
