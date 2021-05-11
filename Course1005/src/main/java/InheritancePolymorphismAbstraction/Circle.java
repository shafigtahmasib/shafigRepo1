package InheritancePolymorphismAbstraction;

public class Circle extends Shape{

    public Circle() {

        System.out.println();
    }

    @Override
    public void draw() {
        super.draw();
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        //Shape sh = new Circle();
        //sh.draw();

    }
}

class Outer extends Shape{
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner p = out.new Inner();
    }
}
