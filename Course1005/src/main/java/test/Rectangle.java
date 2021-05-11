package test;

public class Rectangle implements IShape{
    private int width;
    private int length;

    public Rectangle(){
        this.width = RandomGenerator.generateRandomNumber(10,50);
        this.length = RandomGenerator.generateRandomNumber(10,50);
    }

    @Override
    public double getPerimeter() {
        return 2 * (width+length);
    }
}
