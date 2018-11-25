package patterns.others.frontcontrollerpattern;

import java.util.Arrays;
import java.util.List;

public class FrontController {
    private Dispatcher dispatcher;
    private List<String> pages = Arrays.asList("home","student");

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(String request) {
        if (pages.contains(request)) {
            System.out.println(" User is authenticated successfully.");
        } else {
            System.out.println(" User is authenticated failure.");
        }

        return pages.contains(request);
    }

    private void trackRequest(String request) {
        System.out.println("Page Requested : " + request);
    }

    public void dispatchRequest(String request) {
        // 记录每一个请求
        trackRequest(request);
        // 对用户进行验证
        if (isAuthenticUser(request)) {
            dispatcher.dispatch(request);
        }
    }
}
