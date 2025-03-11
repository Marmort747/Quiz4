package factoryMethod;

public class Main {
    public static void main(String[] args) {

        Shape shape = ShapeFactory.createShape("Circle");
        System.out.println(shape.getClass().getName());

        Shape shapeRec = ShapeFactory.createShape("Rectangle");
        System.out.println(shapeRec.getClass().getName());

    }
}
