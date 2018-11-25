package patterns.build.builderpattern;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
