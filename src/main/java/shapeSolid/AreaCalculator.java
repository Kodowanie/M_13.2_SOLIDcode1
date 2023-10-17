package shapeSolid;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {

    @Override
    public int sumArea(List<Shape2D> shape2Dimention){
        int sum = 0;
        for (int i = 0; i < shape2Dimention.size() ; i++){
            Shape2D shape2D = shape2Dimention.get(i);
            sum += shape2Dimention.get(i).area();
        }
        return sum;
    }
}