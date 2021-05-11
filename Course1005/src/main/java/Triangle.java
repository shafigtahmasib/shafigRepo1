public class Triangle implements  IShape {
    double a;
    double b;
    double c;
    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
