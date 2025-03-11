package abstractFactory;

public class Main {
    public static void main(String[] args) {

        GuiFactory getFactory = GuiAbstractFactory.getGuiFactory("windows");
        Gui guiWinButton = getFactory.createGui("WindowsButton");
        Gui guiWinCheckbox = getFactory.createGui("WindowsCheckbox");

        System.out.println(guiWinButton.getClass().getName());
        System.out.println(guiWinCheckbox.getClass().getName());

        GuiFactory getFactoryMac = GuiAbstractFactory.getGuiFactory("mac");
        Gui guiMacButton = getFactoryMac.createGui("MacOSButton");
        Gui guiMacCheckbox = getFactoryMac.createGui("MacOSCheckbox");

        System.out.println(guiMacButton.getClass().getName());
        System.out.println(guiMacCheckbox.getClass().getName());

    }
}
