package factoryMethod;

public class ShapeFactory {

    public static Shape createShape(String type) {
        if ("Circle".equalsIgnoreCase(type)) {
            return new Circle();
        }
        if ("Rectangle".equalsIgnoreCase(type)) {
            return new Rectangle();
        }
        return null;
    }
}
