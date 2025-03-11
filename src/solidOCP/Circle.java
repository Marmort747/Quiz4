package solidOCP;

public class Circle implements Shape {
    private int radius;
    public final float PI = 3.14f;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println(PI * radius * radius);
    }
}
