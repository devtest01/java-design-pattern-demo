package patterns.build.prototypepattern;

public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }

    public Square() {
        this.type = this.getClass().getSimpleName();
    }
}
