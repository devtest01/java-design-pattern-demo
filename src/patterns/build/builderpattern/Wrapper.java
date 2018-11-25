package patterns.build.builderpattern;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return this.getClass().getSimpleName();
    }
}
