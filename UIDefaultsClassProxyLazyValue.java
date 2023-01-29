import javax.swing.UIDefaults;
public class UIDefaultsClassProxyLazyValue {

    public static void main(String[] args) {
        // UIDefaults.ProxyLazyValue
        UIDefaults.ProxyLazyValue proxyLazyValue = new UIDefaults.ProxyLazyValue("String1");
         
        UIDefaults.ProxyLazyValue proxyLazyValue1 = new UIDefaults.ProxyLazyValue("String1", new Object[] {
                "A", 1, "B", 2, "C", 3
        });
        UIDefaults.ProxyLazyValue proxyLazyValue2 = new UIDefaults.ProxyLazyValue("String1", 
                "String2");
        UIDefaults.ProxyLazyValue proxyLazyValue3 = new UIDefaults.ProxyLazyValue("String1",
                "String2" , new Object[] {
                        "A", 1, "B", 2, "C", 3
                });
        UIDefaults defaultValue = new UIDefaults();
        UIDefaults defaultValue1 = new UIDefaults();
        defaultValue.put("A", 1);
        defaultValue.put("B", 2);
        defaultValue.put("C", 3);
        proxyLazyValue.createValue(defaultValue);
        defaultValue1.putAll(defaultValue);
        proxyLazyValue1.createValue(defaultValue1);
        proxyLazyValue2.createValue(defaultValue1);
        proxyLazyValue3.createValue(defaultValue1);
        defaultValue1.putAll(defaultValue);
        Boolean k = proxyLazyValue.equals(proxyLazyValue1);
        System.out.println(k);
        Boolean k1 = proxyLazyValue.equals(proxyLazyValue);
        System.out.println(k1);
        example ex = new example();
        ex.createValue(defaultValue);
    }
    
}
