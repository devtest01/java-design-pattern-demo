package patterns.others.interceptingfilterpattern;

public class Target {
    void execute(String request) {
        System.out.println("Executing request : " + request);
    }
}
