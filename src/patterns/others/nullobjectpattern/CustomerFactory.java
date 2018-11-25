package patterns.others.nullobjectpattern;

public class CustomerFactory {
    public static final String names[] = {"Bob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        if (name != null && name.trim().length() != 0) {
            for (int i = 0; i < names.length; i++) {
                if (name.equalsIgnoreCase(names[i])) {
                    return new RealCustomer(name);
                }
            }
        }
        return new NullCustomer();
    }
}
