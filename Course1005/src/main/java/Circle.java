public class Circle implements IShape{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
