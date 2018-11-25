package patterns.build.builderpattern;

public class Bottle implements Packing{
    @Override
    public String pack() {
        return this.getClass().getSimpleName();
    }
}
