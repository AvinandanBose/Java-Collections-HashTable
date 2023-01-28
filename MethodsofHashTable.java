import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
public class MethodsofHashTable {
    
    public static void main(String[] args){
        //put
        Hashtable<String, String> ht = new Hashtable<String, String>();
        ht.put("1", "one");
        ht.put("2", "two");
        ht.put("3", "three");
        ht.put("4", "four");
        ht.put("5", "five");
        System.out.println("Hashtable: " + ht);

        //clone
        Hashtable<String, String> ht2 = new Hashtable<String, String>();
        ht2 = (Hashtable<String, String>) ht.clone();
        System.out.println("Cloned Hashtable: " + ht2);

        // compute
        ht.compute("1", (k, v) -> v + "one");
        System.out.println("Hashtable after compute: " + ht);

        // computeIfAbsent
        ht.computeIfAbsent("6", k -> "six");
        System.out.println("Hashtable after computeIfAbsent: " + ht);

        // computeIfPresent
        ht.computeIfPresent("1", (k, v) -> v + "one");
        System.out.println("Hashtable after computeIfPresent: " + ht);

        // contains
        Boolean result = ht.contains("1");
        System.out.println("Hashtable contains key 1: " + result);

        // containsValue
        Boolean result2 = ht.containsValue("one");
        System.out.println("Hashtable contains value one: " + result2);

        //contaisKey
        Boolean result3 = ht.containsKey("1");
        System.out.println("Hashtable contains key 1: " + result3);

        //elements
       Enumeration<String> e = ht.elements();
         System.out.println("Elements in Hashtable: ");
            while (e.hasMoreElements()) {
                System.out.println(e.nextElement());
            }
            System.out.println();
            

            //entrySet

            Set<Entry<String, String>> entries = ht.entrySet();

            System.out.println("Entries in Hashtable: ");
            for (Entry<String, String> entry : entries) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }   
            
            System.out.println("Entries in Hashtable: " + entries);

            //equals(Object o)
            Boolean result4 = ht.equals(ht2);
            System.out.println("Hashtable equals ht2: " + result4);

            //get
            String result5 = ht.get("1");
            System.out.println("Value of key 1: " + result5);

            //hashCode

            int result6 = ht.hashCode();
            System.out.println("Hashcode of Hashtable: " + result6);

            //isEmpty
            Boolean result7 = ht.isEmpty();
            System.out.println("Hashtable is empty: " + result7);

            //keys
            Enumeration<String> e2 = ht.keys();
            System.out.println("Keys in Hashtable: ");
            while (e2.hasMoreElements()) {
                System.out.println(e2.nextElement());
            }           
            System.out.println();

            //keySet
            Set<String> keys = ht.keySet();
            System.out.println("Keys in Hashtable: " + keys);
            System.out.println();
            
            //clear
            ht.clear();
            System.out.println("Hashtable after clear: " + ht);

            //putAll
            ht.putAll(ht2);
            System.out.println("Hashtable after putAll: " + ht);
            System.out.println();
            
            //merge
            ht.merge("1", "one", (v1, v2) -> v1 + v2);
            System.out.println("Hashtable after merge: " + ht);
            System.out.println();

            //remove​(Object key)
            ht.remove("1");
            System.out.println("Hashtable after remove: " + ht);
            System.out.println();

            // size()
            int result8 = ht.size();
            System.out.println("Size of Hashtable: " + result8);
            System.out.println();
            
            //toString()
            String result9 = ht.toString();
            System.out.println("String representation of Hashtable: " + result9);

            //values
            Collection<String> values = ht.values();
            System.out.println("Values in Hashtable: " + values);

            // interface java.util.Map<K,V>

            // forEach(BiConsumer<? super K,? super V> action)
            ht.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
            System.out.println();
            Iterable<Entry<String, String>> iterable = ht.entrySet();
            iterable.forEach(entry -> System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue()));

            System.out.println();
            Iterator<Entry<String, String>> iterator = ht.entrySet().iterator();
            iterator.forEachRemaining(entry -> System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue()));
            System.out.println();

            // getOrDefault(Object key, V defaultValue)
            String result10 = ht.getOrDefault("1", "one");
            System.out.println("Value of key 1: " + result10);
            System.out.println();

            // putIfAbsent​(K key, V value)
            ht.putIfAbsent("1", "one");
            System.out.println("Hashtable after putIfAbsent: " + ht);
            System.out.println();

            //remove​(Object key, Object value)
            ht.remove("2", "two");
            System.out.println("Hashtable after remove: " + ht);
            System.out.println();
           
            // replace(K key, V value)
            ht.replace("1", "ONE");
            System.out.println("Hashtable after replace: " + ht);
            System.out.println();

            // replace(K key, V oldValue, V newValue)
            ht.replace("1", "ONE", "one");
            System.out.println("Hashtable after replace: " + ht);                                       
            System.out.println(); 

            //replaceAll(BiFunction<? super K,? super V,? extends V> function)
            ht.replaceAll((k, v) -> v.toUpperCase());
            System.out.println("Hashtable after replaceAll: " + ht);
            System.out.println();
    }
}

