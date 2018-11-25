package patterns.others.interceptingfilterpattern;

public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request : " + request);
    }
}
