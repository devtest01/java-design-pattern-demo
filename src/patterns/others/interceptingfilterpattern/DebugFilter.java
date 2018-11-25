package patterns.others.interceptingfilterpattern;

public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("[DEBUG] request log : " + request);
    }
}
