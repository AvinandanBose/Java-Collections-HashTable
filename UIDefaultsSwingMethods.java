import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.UIDefaults;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;

import java.awt.Insets;
import java.beans.PropertyChangeListener;
import java.util.Locale;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

//UIDefaults
public class UIDefaultsSwingMethods {

    private static Icon createImageIcon(Icon icon) {
        return icon.getIconWidth() >= icon.getIconHeight() ? icon : null;
    }
    public static void main(String[] args) {
        UIDefaults defaults = new UIDefaults();
        //put(Object key, Object value)-1
        defaults.put("Button.font", 1);

        // addResourceBundle(String bundleName)-2
        defaults.addResourceBundle("UIDefaultsSwingMethods");
        defaults.addResourceBundle("UIDefaultsSwingMethods.bundle");

       
        // get(Object key)-3
        Object key = defaults.get("Button.font");
        System.out.println(key);

        // get(Object key, Locale l)-4
        Locale locale = new Locale("en");
        Object key1 = defaults.get("Button.font", locale);
        System.out.println(key1);

        // getBoolean(Object key)-5
        Boolean value = defaults.getBoolean("Button.font");
        System.out.println(value);

        // getBoolean(Object key, Locale l)-6
        Boolean value1 = defaults.getBoolean("Button.font", locale);
        System.out.println(value1);

        // addPropertyChangeListener(PropertyChangeListener listener)-7

        defaults.addPropertyChangeListener(e -> {
            System.out.println(e.getSource());
            System.out.println(e.getPropertyName());
            System.out.println(e.getOldValue());
            System.out.println(e.getNewValue());
        });

    

        // getColor(Object key)-8
        Color color= Color.RED;
        defaults.put("Color" , color);
        Color a = defaults.getColor("Color");
        System.out.println(a);

        // getColor(Object key, Locale l)-9
        Color a1 = defaults.getColor("Color",locale);
        System.out.println(a1);

        

        //getDimension(Object key)-10
        Dimension dimension = new Dimension(1,1);
        defaults.put("Dimension", dimension);
        Dimension b = defaults.getDimension("Dimension");
        System.out.println(b);

        //getDimension(Object key, Locale l)-11
        Dimension b1 = defaults.getDimension("Dimension", locale);
        System.out.println(b1);


        //getFont(Object key)-12
        Font font = new Font("Arial", Font.BOLD, 12);
        defaults.put("Font", font);
        Font c = defaults.getFont("Font");
        System.out.println(c);

        //getFont(Object key, Locale l)-13
        Font c1 = defaults.getFont("Font", locale);
        System.out.println(c1);

        //getIcon(Object key)-14
    
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\User\\Desktop\\Java\\Java Swing\\UIDefaultsSwingMethods\\src\\main\\java\\UIDefaultsSwingMethods\\image.png");
        Icon icon = createImageIcon( imageIcon); 
        defaults.put("Icon", icon);
        Icon d = defaults.getIcon("Icon");
        System.out.println(d);

        //getIcon(Object key, Locale l)-15
        Icon d1 = defaults.getIcon("Icon", locale);
        System.out.println(d1);

        // getInsets(Object key)-16
        Insets insets = new Insets(1,1,1,1);
        defaults.put("Insets", insets);
        Insets e = defaults.getInsets("Insets");
        System.out.println(e);

        // getInsets(Object key, Locale l)-17
        Insets e1 = defaults.getInsets("Insets", locale);
        System.out.println(e1);

        // getInt(Object key)-18
        Integer integer = 1;
        defaults.put("Integer", integer);
        Integer f = defaults.getInt("Integer");
        System.out.println(f);

        // getInt(Object key, Locale l)-19
        Integer f1 = defaults.getInt("Integer", locale);
        System.out.println(f1);

        //getString(Object key)-20

        String string = "String";
        defaults.put("String", string);
        String g = defaults.getString("String");
        System.out.println(g);

        //getString(Object key, Locale l)-21
        String g1 = defaults.getString("String", locale);
        System.out.println(g1); 

        //getBorder(Object key)-22
        Border border = BorderFactory.createLineBorder(Color.black);
        defaults.put("Border" , border);
        Border a2 = defaults.getBorder("Border");
        System.out.println(a2);

        // getBorder(Object key, Locale l)-23
        Border a3 = defaults.getBorder("Border", locale);
        System.out.println(a3);

        // getDefaultLocale()-24
        Locale locale1 = defaults.getDefaultLocale();
        System.out.println(locale1);


        // getPropertyChangeListeners()-25
        PropertyChangeListener[] propertyChangeListeners = defaults.getPropertyChangeListeners();
        for (PropertyChangeListener propertyChangeListener : propertyChangeListeners) {
            System.out.println(propertyChangeListener);
        }


         //getUI(Object key)-26
        JComponent ex = new JComponent() {
        };
        Object h = defaults.getUI(ex);
        System.out.println(h);
        System.out.println(implementUI(ex));

        // getUIClass(String uiClassID)-27
        Object i = defaults.getUIClass(ex.getUIClassID());
        System.out.println(i);

        // getUIClass(String uiClassID, ClassLoader uiClassLoader)-28
        Object i1 = defaults.getUIClass(ex.getUIClassID(), ex.getClass().getClassLoader());
        System.out.println(i1);

        // putDefaults(Object[] keyValueList)-29
        Object[] keyValueList = new Object[] { "Button.font", 1001 };
        defaults.putDefaults(keyValueList);
        System.out.println(defaults.get("Button.font"));

        // removePropertyChangeListener(PropertyChangeListener listener)-30
        defaults.removePropertyChangeListener(e2 -> {
            System.out.println(e2.getSource());
            System.out.println(e2.getPropertyName());
            System.out.println(e2.getOldValue());
            System.out.println(e2.getNewValue());
        });

        // removeResourceBundle(String bundleName)-31
         defaults.removeResourceBundle("UIDefaultsSwingMethods");

         // setDefaultLocale(Locale l)-32
            defaults.setDefaultLocale(locale);
            System.out.println(defaults.getDefaultLocale()); 

    }

    public static ComponentUI implementUI(JComponent c) {
        UIDefaults defaults = new UIDefaults();
        ComponentUI uiObject = defaults.getUI(c);
        return uiObject;
    }
    
}
   

