import javax.swing.UIDefaults;

public class UIDefaultsClassActiveValue {
    public static void main(String[] args) {

        // UIDefaults.ActiveValue

        UIDefaults.ActiveValue activeValue = new UIDefaults.ActiveValue() {
            @Override
            public Object createValue(UIDefaults table) {
                System.out.println(table);
                return table;
            }
        };

        UIDefaults.ActiveValue activeValue1 = new UIDefaults.ActiveValue() {
            @Override
            public Object createValue(UIDefaults table) {
                System.out.println(table);
                return table;
            }
        };

        UIDefaults defaultValue = new UIDefaults();
        UIDefaults defaultValue1 = new UIDefaults();
        defaultValue.put("A", 1);
        defaultValue.put("B", 2);
        defaultValue.put("C", 3);

        activeValue.createValue(defaultValue);
        defaultValue1.putAll(defaultValue);
        activeValue1.createValue(defaultValue1);

        defaultValue1.putAll(defaultValue);
        Boolean k = activeValue.equals(activeValue1);
        System.out.println(k);

        Boolean k1 = activeValue.equals(activeValue);
        System.out.println(k1);

        example ex = new example();
        ex.createValue(defaultValue);

    }

}

class example implements UIDefaults.ActiveValue {
    @Override
    public Object createValue(UIDefaults table) {
        System.out.println(table);
        return table;
    }
}
