import java.util.ArrayList;
import java.util.Arrays;

public class RandomShapeGenerator {
    IShape[] array;
    double Generator() {
        int shapeGenerator = (int) (Math.random() * (3 - 1) + 1);
        if (shapeGenerator == 1) {
            Triangle tr = new Triangle(Math.random() * (50 - 10) + 10, Math.random() * (50 - 10) + 10, Math.random() * (50 - 10) + 10);
            return tr.getPerimeter();
        }
        if (shapeGenerator == 2) {
            Rectangle rect = new Rectangle(Math.random() * (50 - 10) + 10, Math.random() * (50 - 10) + 10);
            return rect.getPerimeter();
        }
        if (shapeGenerator == 3) {
            Circle c = new Circle(Math.random() * (50 - 10) + 10);
            return c.getPerimeter();
        }

return 0;
    }


    ArrayList<IShape> randomShapeGenerator(int a){
        int n = 0;
        ArrayList<IShape> array = new ArrayList<IShape>();
        double ans = 0;
        while(n<a){
            //array.add(Generator());
            n++;
        }
        return array;
    }
}
