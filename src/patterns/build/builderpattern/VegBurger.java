package patterns.build.builderpattern;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
