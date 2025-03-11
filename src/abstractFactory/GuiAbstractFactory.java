package abstractFactory;

public class GuiAbstractFactory {

    public static GuiFactory getGuiFactory(String type) {

        if (type == null) return null;

        String lowerCase = type.toLowerCase();

        if (lowerCase.startsWith("windows")) {
            return new WindowsFactory();
        }else if (lowerCase.startsWith("mac")) {
            return new MacOSFactory();
        } else{
            return null;
        }

    }
}
