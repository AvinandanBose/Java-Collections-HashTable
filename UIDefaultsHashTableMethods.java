import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.lang.Iterable;
import javax.swing.UIDefaults;
public class UIDefaultsHashTableMethods {
    public static void main(String[] args) throws Exception {
        UIDefaults table = new UIDefaults();
        // put(Object key, Object value)-1
        table.put("A", "1");
        table.put("B", "2");
        table.put("C", "3");
        table.put("D", "4");
        table.put("E", "5");
        table.put("F", "6");

        System.out.println("Hashtable elements:" +table);

        //putIfAbsent(Object key, Object value)-2
        table.putIfAbsent("G",7);
        System.out.println("Hashtable elements:" +table);

        //clone-3
        UIDefaults clone = (UIDefaults) table.clone();
        System.out.println("Cloned Hashtable elements:" +clone);

        //putAll-4
        UIDefaults table2 = new UIDefaults() ;
         table2.putAll(table);
        System.out.println("Hashtable elements:" +table2);

        
        //getOrDefault(Object key, Object defaultValue)-5

        Object value = table.getOrDefault("G", "7");

        System.out.println("Value of A is: " + value);

        //remove(Object key, Object value)-6
        table.remove("G",7);
        System.out.println("Hashtable elements:" +table);

        

        //replace(Object key, Object oldValue, Object newValue)-7
        table.replace("A", "1", "7");
        System.out.println("Hashtable elements:" +table);

        // contains-8
        Boolean k = table.contains("7");
        System.out.println("Hashtable elements:" +k);

        //containsValue-9
        Boolean k1 = table.containsValue("7");
        System.out.println("Hashtable elements:" +k1);

        //containsKey-10
        Boolean k2 = table.containsKey("A");
        System.out.println("Hashtable elements:" +k2);

        //elements-11
        Enumeration<Object> e = table.elements();
        System.out.println("Hashtable elements:");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        Iterator<Object> iterator = table.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Iterable<Object> iterable = table.values();
        for (Object o : iterable) {
            System.out.println(o);
        }

        //keys-12
        Enumeration<Object> e1 = table.keys();
        System.out.println("Hashtable elements:");
        while (e1.hasMoreElements()) {
            System.out.println(e1.nextElement());
        }
        Iterator<Object> e2 = table.keySet().iterator();
        while (e2.hasNext()) {
            System.out.println(e2.next());
        }
        Iterable<Object> e3 = table.keySet();
        for (Object o : e3) {
            System.out.println(o);
        }

        //keySet-13
        Set<Object> set1 = table.keySet();
        System.out.println("Hashtable elements:" +set1);

        //values-14
        Collection<Object> col = table.values();
        System.out.println("Hashtable elements:" +col);

        //entrySet-15
        Set<Map.Entry<Object, Object>> set2 = table.entrySet();
        System.out.println("Hashtable elements:" +set2);
        Set<Entry<Object, Object>> set3 = table.entrySet();
        for (Entry<Object, Object> entry : set3) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //size-16
        int size = table.size();
        System.out.println("Hashtable elements:" +size);

        //isEmpty-17
        Boolean k3 = table.isEmpty();
        System.out.println("Hashtable elements:" +k3);

        //compute-18
        table.compute("A", (k4, v) -> v + "7");
        System.out.println("Hashtable elements:" +table);

        //computeIfAbsent-19
        table.computeIfAbsent("G", k5 -> "7");
        System.out.println("Hashtable elements:" +table);

        //computeIfPresent-20
        table.computeIfPresent("G", (k6, v) -> v + "8");
        System.out.println("Hashtable elements:" +table);

        //merge-21
        table.merge("G", "7", (v1, v2) ->  v2 + "9");
        System.out.println("Hashtable elements:" +table);

        //replaceAll-22
        table.replaceAll((k7, v) -> v + "9");
        System.out.println("Hashtable elements:" +table);

        //forEach-23
        table.forEach((k8, v) -> System.out.println(k8 + " " + v));

        //clear-24
        table.clear();
        System.out.println("Hashtable elements:" +table);

        //equals-25
        table.putAll(table2);
        Boolean k4 = table.equals(clone);
        System.out.println("Hashtable elements:" +k4);

        //hashCode-26
        int hash = table.hashCode();
        System.out.println("Hashtable elements:" +hash);

        //toString-27
        String str = table.toString();
        System.out.println("Hashtable elements:" +str);

        
    }
}
