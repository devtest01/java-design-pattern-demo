package patterns.action.observerpattern;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.printf("Octal String : %s", Integer.toOctalString(subject.getState()));
        System.out.println();
    }
}
