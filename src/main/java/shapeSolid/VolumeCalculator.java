package shapeSolid;

import java.util.List;

public class VolumeCalculator implements IVolumeCalculator {

    @Override
    public int sumVolume(List<Shape3D> shape3Dimention){
        int sum = 0;
        for (int i = 0; i < shape3Dimention.size() ; i++){
            Shape3D shape3D = shape3Dimention.get(i);
            sum += shape3Dimention.get(i).volume();
        }
        return sum;
    }
}
