package patterns.others.businessdelegatepattern;

public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS service.");
    }
}
