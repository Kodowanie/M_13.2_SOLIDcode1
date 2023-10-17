package shapeSolid;

public class Rectangle implements Shape2D {

    private final int length;
    private final int width;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double area() {
        return length *width;
    }
}
