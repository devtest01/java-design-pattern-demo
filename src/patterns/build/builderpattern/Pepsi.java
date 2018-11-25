package patterns.build.builderpattern;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
