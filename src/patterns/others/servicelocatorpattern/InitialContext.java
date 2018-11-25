package patterns.others.servicelocatorpattern;

import patterns.action.observerpattern.Observer;

public class InitialContext {
    public Object lookup(String jndiName) {
        if ("service1".equalsIgnoreCase(jndiName)) {
            System.out.println("Looking up and creating a new service1 object.");
            return new Service1();
        } else if ("service2".equalsIgnoreCase(jndiName)) {
            System.out.println("Looking up and creating a new service2 object.");
            return new Service2();
        } else {
            System.out.println("Object not found!");
            return null;
        }
    }
}
