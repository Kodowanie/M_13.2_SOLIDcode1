package shapeSolid;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        IVolumeCalculator volumeCalculator = new VolumeCalculator();
        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator,volumeCalculator);
        Circle circle =  new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(5);
        Rectangle rectangle = new Rectangle(5,10);
        List<Shape2D> shape2Dimention = List.of(
                circle,square,cube,rectangle);
        List<Shape3D> shape3Dimention = List.of(
               cube);


        System.out.println("json2D: " + shapesPrinter.json2D(shape2Dimention));
        System.out.println("csv2D: " + shapesPrinter.csv2D(shape2Dimention));

        System.out.println("json3D: " + shapesPrinter.json3D(shape3Dimention));
        System.out.println("csv3D: " + shapesPrinter.csv3D(shape3Dimention));
    }
}