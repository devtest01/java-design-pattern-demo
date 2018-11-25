package patterns.build.prototypepattern;

public class Rectangle extends Shape {
    public Rectangle() {
        this.type = this.getClass().getSimpleName();
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
