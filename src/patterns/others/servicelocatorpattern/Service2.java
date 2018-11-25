package patterns.others.servicelocatorpattern;

public class Service2 implements Service {
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void execute() {
        System.out.println("Executing " + this.getName());
    }
}
