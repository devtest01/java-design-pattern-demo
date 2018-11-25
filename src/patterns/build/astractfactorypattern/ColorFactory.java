package patterns.build.astractfactorypattern;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if ("red".equalsIgnoreCase(color)) {
            return new Red();
        } else if ("green".equalsIgnoreCase(color)) {
            return new Green();
        } else if ("blue".equalsIgnoreCase(color)) {
            return new Blue();
        }

        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }
}
