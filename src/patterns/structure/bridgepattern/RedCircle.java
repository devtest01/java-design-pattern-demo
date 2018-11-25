package patterns.structure.bridgepattern;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.printf("Drawing Circle[ Color: red, radius: %d, x: %d, y: %d]",radius,x,y);
        System.out.println();
    }
}
