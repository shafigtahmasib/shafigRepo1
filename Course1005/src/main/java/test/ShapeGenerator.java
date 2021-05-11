package test;

import java.util.Iterator;

public class ShapeGenerator implements Iterable<IShape>, Generator<IShape>{
    int size;
    public ShapeGenerator(int size){
        this.size=size;
    }
    @Override
    public Iterator<IShape> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<IShape>{

        @Override
        public boolean hasNext() {
            return size>0;
        }

        @Override
        public IShape next() {
            size--;
            return generator();
        }
    }

    @Override
    public IShape generator() {
        return RandomShapeGenerator.generateRandomShape();
    }
}
