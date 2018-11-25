package patterns.structure.bridgepattern;

public class Cirlce extends Shape {

    private int x, y, radius;

    protected Cirlce(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
