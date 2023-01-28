import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
public class ConstructorJavaHashTable3 {
    public static void main(String args[]) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);

    // create a hash table
    Hashtable<String,Integer> balance = new Hashtable<>(map);

    // print values after put
    System.out.println("Values after put: " + balance);
    }
}
