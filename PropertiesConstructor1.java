import java.util.Properties;
public class PropertiesConstructor1 {
    public static void main(String[] args) {
       
        Properties properties = new Properties(12);
        properties.put("A", "1");
        properties.put("B", "2");
        properties.put("C", "3");

        System.out.println("Properties elements:" +properties);

        

    }

    
}
