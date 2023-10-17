package shapeSolid;

import java.util.List;

public class ShapesPrinter {

    private final IAreaCalculator areaCalculator;
    private final IVolumeCalculator volumeCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator, IVolumeCalculator volumeCalculator) {
        this.areaCalculator = areaCalculator;
        this.volumeCalculator = volumeCalculator;
    }
    public String json2D(List<Shape2D> shapes2Dimention){
        return "{shapesSum 2D: %s}".formatted(areaCalculator.sumArea(shapes2Dimention));
    }
    public String csv2D(List<Shape2D> shapes2Dimention){
        return "shapesSum 2D,%s".formatted(areaCalculator.sumArea(shapes2Dimention));
    }

    public String json3D(List<Shape3D> shapes3Dimention){
        return "{shapesSum 2D: %s}".formatted(volumeCalculator.sumVolume(shapes3Dimention));
    }
    public String csv3D(List<Shape3D> shapes3Dimention){
        return "shapesSum 2D,%s".formatted(volumeCalculator.sumVolume(shapes3Dimention));
    }
}
