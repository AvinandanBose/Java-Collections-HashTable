import javax.swing.UIDefaults;

public class UIDefaultsClassLazyValue {
    public static void main(String[] args) {
        // UIDefaults.LazyValue

        UIDefaults.LazyValue lazyValue = new UIDefaults.LazyValue() {
            @Override
            public Object createValue(UIDefaults table) {
                System.out.println(table);
                return table;
            }
        };

        UIDefaults.LazyValue lazyValue1 = new UIDefaults.LazyValue() {
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

        lazyValue.createValue(defaultValue);
        defaultValue1.putAll(defaultValue);
        lazyValue1.createValue(defaultValue1);

        defaultValue1.putAll(defaultValue);
        Boolean k = lazyValue.equals(lazyValue1);
        System.out.println(k);

        Boolean k1 = lazyValue.equals(lazyValue);
        System.out.println(k1);

        example1 ex = new example1();
        ex.createValue(defaultValue);


    }

}

class example1 implements UIDefaults.LazyValue {
    @Override
    public Object createValue(UIDefaults table) {
        System.out.println(table);
        return table;
    }
}