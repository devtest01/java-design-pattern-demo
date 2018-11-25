package patterns.build.astractfactorypattern;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blud::fill() method.");
    }
}
