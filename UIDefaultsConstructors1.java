import javax.swing.UIDefaults;
public class UIDefaultsConstructors1 {
    public static void main(String[] args) throws Exception {
        // UIDefaults(int initialCapacity, float loadFactor)
        UIDefaults defaultValue = new UIDefaults(10, 0.5f);
        defaultValue.put("A", 1);
        defaultValue.put("B", 2);
        defaultValue.put("C", 3);
        System.out.println(defaultValue);
    }
}
