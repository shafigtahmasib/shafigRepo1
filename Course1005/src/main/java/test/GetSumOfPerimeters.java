package test;

import java.util.ArrayList;

public class GetSumOfPerimeters {

    public static void main(String[] args) {
        ArrayList<IShape> shapeArray = getShapeArray(100);
        System.out.println(getSumOfPerimeters(shapeArray));
        //System.out.println(getShapeArray(100));
        for(IShape s: new ShapeGenerator(2)){
            System.out.println(s);
        }
    }

    public static ArrayList<IShape> getShapeArray(int n){
        ArrayList<IShape> shapeArray = new ArrayList<IShape>();
        while(n>0){
            shapeArray.add(RandomShapeGenerator.generateRandomShape());
            n--;
        }
        return shapeArray;
    }

    public static double getSumOfPerimeters(ArrayList<IShape> shapeArray){
        double sumOfPerimeters = 0;

        int circleCount = 0;
        int triangleCount = 0;
        int rectangleCount = 0;


        for(IShape shape: shapeArray){
            sumOfPerimeters+=shape.getPerimeter();
            if(shape instanceof Circle)
                circleCount++;
            else if(shape instanceof Triangle)
                triangleCount++;
            else if (shape instanceof Rectangle)
                rectangleCount++;
        }

        System.out.println("Circle count: "+circleCount);
        System.out.println("Triangle count: "+triangleCount);
        System.out.println("Rectangle count: "+rectangleCount);

        return sumOfPerimeters;
    }
}
