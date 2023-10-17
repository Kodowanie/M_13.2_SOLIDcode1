package shapeSolid;

public class Circle implements Shape2D {
    private final int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}




