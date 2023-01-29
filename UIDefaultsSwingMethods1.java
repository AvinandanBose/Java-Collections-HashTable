import javax.swing.UIDefaults;

public class UIDefaultsSwingMethods1 extends UIDefaults {
    public static void main(String[] args) {
        UIDefaultsSwingMethods1 ex = new UIDefaultsSwingMethods1();
        ex.put("Button.font", 1);
        System.out.println(ex.get("Button.font"));
        ex.addPropertyChangeListener(e -> {
            System.out.println(e.getSource());
            System.out.println(e.getPropertyName());
            System.out.println(e.getOldValue());
            System.out.println(e.getNewValue());
        });

        // firePropertyChange(String propertyName, Object oldValue, Object newValue)-33
        ex.firePropertyChange("Button.font", 1, 2);

        // getUIError(String msg)-34
       ex.getUIError("Error");
    }
}
