package patterns.others.frontcontrollerpattern;

public class Dispatcher {
    private HomeView homeView;
    private StudentView studentView;

    public Dispatcher() {
        homeView = new HomeView();
        studentView = new StudentView();
    }

    public void dispatch(String request) {
        if ("student".equalsIgnoreCase(request)) {
            studentView.show();
        } else if ("home".equalsIgnoreCase(request)) {
            homeView.show();
        } else {
            System.out.println("Invalid request : " + request);
        }
    }
}
