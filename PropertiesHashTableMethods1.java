import java.util.Properties;
public class PropertiesHashTableMethods1 extends Properties {
    public static void main(String[] args) {
        PropertiesHashTableMethods1 properties = new PropertiesHashTableMethods1();
        properties.put("key1", "value1");
        properties.put("key2", "value2");
        properties.put("key3", "value3");

        System.out.println("Properties elements:" + properties);

        //rehasing
        properties.rehash();
        System.out.println("After rehashing:" + properties);
    }
    
}
