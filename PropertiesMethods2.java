import java.io.PrintStream;
import java.util.Properties;
public class PropertiesMethods2 {
   public static void main(String[] args){
       Properties properties = new Properties();
       properties.put("A", "1");
       properties.put("B", "2");
       properties.put("C", "3");
       properties.put("D", "4");
       System.out.println("Properties elements:" + properties);

       // list​(PrintStream out)
       PrintStream out = System.out;
        properties.list(out);

        //OR

        properties.list(System.out);
   } 
}
