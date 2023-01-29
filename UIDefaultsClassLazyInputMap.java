import java.util.Map.Entry;
import javax.swing.UIDefaults;
import javax.swing.UIDefaults.LazyInputMap;

public class UIDefaultsClassLazyInputMap {
    public static void main(String[] args) {

        // UIDefaults.LazyInputMap
        Object[] flat = new Object[100];
        UIDefaults.LazyInputMap lm = new UIDefaults.LazyInputMap(flat);
        UIDefaults.LazyInputMap lm0 = new UIDefaults.LazyInputMap(new Object[] {});
        UIDefaults.LazyInputMap lm1 = new UIDefaults.LazyInputMap(new Object[] {
            "A" , 1,
            "B" , 2,
            "C" , 3,
            "D" , lm,
            "E" , new Object[] {
                "A" , 1,
                "B" , 2,
                "C" , 3,
            }
            
        });
        
        UIDefaults defaultValue = new UIDefaults();
        defaultValue.put("A", 1);
        defaultValue.put("B", 2);
        defaultValue.put("C", 3);
        defaultValue.put("D",lm);
        defaultValue.put("E", new Object[] {
            "A" , 1,
            "B" , 2,
            "C" , 3,

        });
        lm1.createValue(defaultValue);
        lm0.createValue(defaultValue);
        System.out.println(defaultValue);

        UIDefaultsClassLazyInputMap ui = new UIDefaultsClassLazyInputMap();
        System.out.println(ui.getUiMap());
    }

        public LazyInputMap getUiMap() {
        UIDefaults defaultValue = new UIDefaults();

        defaultValue.put("A", 1);
        defaultValue.put("B", 2);
        defaultValue.put("C", 3);
      
        
        Object[] flat = new Object[100];
        int index = 0;
        for (Entry<Object, Object> entry : defaultValue.entrySet()) {
            
            flat[index++] = entry.getKey();
            flat[index++] = entry.getValue();
            
            System.out.println("flat[" + index + "]" + "=" + entry.getKey() + " "+ entry.getValue());
        }
        return new LazyInputMap(flat);
    }
}
    

      