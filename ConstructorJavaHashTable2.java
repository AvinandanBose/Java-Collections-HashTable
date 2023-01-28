import java.util.Hashtable;
public class ConstructorJavaHashTable2 {
    public static void main(String args[]) {
    // create a hash table
    Hashtable<String,Integer> balance = new Hashtable<>(11, 0.75f);
    // insert some key-value pairs                  
    balance.put("A", 1);
    balance.put("B", 2);
    balance.put("C", 3);
    balance.put("D", 4);
    balance.put("E", 5);

    // print values after put
    System.out.println("Values after put: " + balance);
    }

}
