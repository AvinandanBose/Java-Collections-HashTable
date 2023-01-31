import java.util.Collection;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;
public class PropertiesHashTableMethods {
    public static void main(String[] args)  {
        Properties properties = new Properties();
        // put​(K key, V value)
        properties.put("A", "1");
        properties.put("B", "2");
        properties.put("C", "3");
        properties.put("D", "4");
        properties.put("E", "5");
        properties.put("F", "6");
        System.out.println("Properties elements:" +properties);

        // clone()
        Properties propertiesClone = (Properties)properties.clone();
        System.out.println("Properties clone:" +propertiesClone);

        // compute​(K key, BiFunction<? super K,​? super V,​? extends V> remappingFunction)
        properties.compute("A", (key, value) -> value + "1");
        System.out.println("Properties compute:" +properties);

        // computeIfAbsent​(K key, Function<? super K,​? extends V> mappingFunction)
        properties.computeIfAbsent("G", key -> "7");
        System.out.println("Properties computeIfAbsent:" +properties);

        // computeIfPresent​(K key, BiFunction<? super K,​? super V,​? extends V> remappingFunction)
        properties.computeIfPresent("G", (key, value) -> value + "1");
        System.out.println("Properties computeIfPresent:" + properties);

        // contains​(Object value)
        Boolean contains = properties.contains("2");
        System.out.println("Properties contains:" + contains);

        // containsKey​(Object key)
        Boolean containsKey = properties.containsKey("A");
        System.out.println("Properties containsKey:" + containsKey);

        // containsValue​(Object value)
        Boolean containsValue = properties.containsValue("11");
        System.out.println("Properties containsValue:" + containsValue);

        // elements()
        Enumeration<Object> elements = properties.elements();
        System.out.println("Properties elements:");
        while (elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
        }

        // entrySet()
        Set<?> entrySet = properties.entrySet();
        System.out.println("Properties entrySet:" + entrySet);

        // equals​(Object o)
        Boolean equals = properties.equals(propertiesClone);
        System.out.println("Properties equals:" + equals);

        // get​(Object key)
        Object get = properties.get("A");
        System.out.println("Properties get:" + get);

        // hashCode()
        Integer hashCode = properties.hashCode();
        System.out.println("Properties hashCode:" + hashCode);

        // isEmpty()
        Boolean isEmpty = properties.isEmpty();
        System.out.println("Properties isEmpty:" + isEmpty);

        //Keys()
        Enumeration<Object> keys = properties.keys();
        System.out.println("Properties keys:");
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }

        // keySet()
        Set<?> keySet = properties.keySet();
        System.out.println("Properties keySet:" + keySet);

        // merge​(K key, V value, BiFunction<? super V,​? super V,​? extends V> remappingFunction)
        properties.merge("A", "1", (value1, value2) -> Double.parseDouble( value2.toString()));
        System.out.println("Properties merge:" + properties);

       // putAll​(Map<? extends K,​? extends V> t)
       Properties properties2 = new Properties();
       properties2.putAll(properties);
       System.out.println("Properties putAll:" + properties2);

        //  remove​(Object key)
        properties.remove("A");
        System.out.println("Properties remove:" + properties);

        // size()
        Integer size = properties.size();
        System.out.println("Properties size:" + size);

        // toString()
        String toString = properties.toString();
        System.out.println("Properties toString:" + toString);

        // values()
        Collection<Object> values = properties.values();
        System.out.println("Properties values:" + values);

        //clear()
        properties.clear();
        System.out.println("Properties clear:" + properties);

        //Import from interface java.util.Map

        // forEach​(BiConsumer<? super K,​? super V> action)
        properties2.forEach((key, value) -> System.out.println(key + " = " + value));

        // getOrDefault​(Object key, V defaultValue)
        Object getOrDefault = properties2.getOrDefault("A", "1");
        System.out.println("Properties getOrDefault:" + getOrDefault);

        // putIfAbsent​(K key, V value)
        properties2.putIfAbsent("H", "8");
        System.out.println("Properties putIfAbsent:" + properties2);

        // remove​(Object key, Object value)
        properties2.remove("H", "8");
        System.out.println("Properties remove:" + properties2);

        // replace​(K key, V oldValue, V newValue)
        properties2.replace("G", "71",7);
        System.out.println("Properties replace:" + properties2);

        // replaceAll​(BiFunction<? super K,​? super V,​? extends V> function)
        properties2.replaceAll((key, value) -> Double.parseDouble(value.toString())  );
        System.out.println("Properties replaceAll:" + properties2);

        
        
    }
}