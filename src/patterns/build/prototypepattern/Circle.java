package patterns.build.prototypepattern;

public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

    public Circle() {
        this.type = this.getClass().getSimpleName();
    }
}
