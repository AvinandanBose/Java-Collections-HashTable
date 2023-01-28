import java.util.Hashtable;

public class MethodsofHashTable1 extends Hashtable<String, String>{

    public static void main(String[] args){
        MethodsofHashTable1 m = new MethodsofHashTable1();
        m.put("1", "one");
        m.put("2", "two");
        m.put("3", "three");
        m.put("4", "four");
        m.put("5", "five");
        m.put("6", "six");
        m.put("7", "seven");
        m.put("8", "eight");
        m.put("9", "nine");
        System.out.println("Hashtable: " + m);
        System.out.println("Hashtable Size: " + m.size());
        System.out.println();
        m.rehash();
        System.out.println("Hashtable Size after rehash: " + m.size());
    }
}
