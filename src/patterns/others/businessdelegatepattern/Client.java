package patterns.others.businessdelegatepattern;

public class Client {
    BusinessDelegate businessDelegateService;

    public Client(BusinessDelegate businessDelegateService) {
        this.businessDelegateService = businessDelegateService;
    }

    public void doTask() {
        businessDelegateService.doTask();
    }
}
