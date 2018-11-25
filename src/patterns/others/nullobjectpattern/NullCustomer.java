package patterns.others.nullobjectpattern;

public class NullCustomer extends AbstractCustomer {


    @Override
    boolean isNil() {
        return true;
    }

    @Override
    String getName() {
        return "Not available in customer database.";
    }
}
