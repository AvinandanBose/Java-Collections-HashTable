import javax.swing.UIDefaults;
public class UIDefaultsConstructors2 {
    public static void main(String[] args) throws Exception {
        // UIDefaults(Object[] keyValueList)
        UIDefaults defaultValue = new UIDefaults(new Object[] { "A", 1, "B", 2, "C", 3 });
        System.out.println(defaultValue);
    }
}
