package abstractFactory;

public class MacOSFactory implements GuiFactory {


    public Gui createGui(String type) {
        if ("MacOSButton".equalsIgnoreCase(type)) {
            return new MacOSButton();
        }

        if ("MacOSCheckbox".equalsIgnoreCase(type)) {
            return new MacOSCheckbox();
        }

        return null;
    }

}
