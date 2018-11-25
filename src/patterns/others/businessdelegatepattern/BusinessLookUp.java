package patterns.others.businessdelegatepattern;

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if ("ejb".equalsIgnoreCase(serviceType)) {
            return new EJBService();
        } else if ("jms".equalsIgnoreCase(serviceType)) {
            return new JMSService();
        }
        return null;
    }
}
