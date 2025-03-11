package abstractFactory;

public class WindowsFactory implements GuiFactory {


    public Gui createGui(String type) {
        if ("WindowsButton".equalsIgnoreCase(type)) {
            return new WindowsButton();
        }

        if ("WindowsCheckbox".equalsIgnoreCase(type)) {
            return new WindowsCheckbox();
        }

        return null;
    }
}
