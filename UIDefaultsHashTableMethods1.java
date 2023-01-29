import javax.swing.UIDefaults;

public class UIDefaultsHashTableMethods1 extends UIDefaults{
    public static void main(String[] args) {
        UIDefaultsHashTableMethods1 ex = new UIDefaultsHashTableMethods1();
        ex.put("A", 1);
        ex.put("B", 2);
        ex.put("C", 3);                                     
      
       ex.rehash();
   
    }

  
    
}
