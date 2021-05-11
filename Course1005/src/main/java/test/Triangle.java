package test;

public class Triangle implements IShape{
    private int a;
    private int b;
    private int c;

    public Triangle(){
        this.a = RandomGenerator.generateRandomNumber(10,50);
        this.b = RandomGenerator.generateRandomNumber(10,50);
        this.c = RandomGenerator.generateRandomNumber(10,50);
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
