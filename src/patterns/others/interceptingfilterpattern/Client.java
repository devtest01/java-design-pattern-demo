package patterns.others.interceptingfilterpattern;

public class Client {
    FilterManager filterManager;

    public Client(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public Client() {
    }

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
