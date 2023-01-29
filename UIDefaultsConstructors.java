import javax.swing.UIDefaults;
public class UIDefaultsConstructors {
    public static void main(String[] args) throws Exception {
        // UIDefaults()
        UIDefaults defaultValue = new UIDefaults();
        defaultValue.put("A", 1);
        defaultValue.put("B", 2);
        defaultValue.put("C", 3);
        System.out.println(defaultValue);

       
    }
    
}
