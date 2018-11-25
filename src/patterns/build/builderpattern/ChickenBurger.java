package patterns.build.builderpattern;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
