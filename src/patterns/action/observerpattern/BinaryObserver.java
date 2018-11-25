package patterns.action.observerpattern;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.printf("Binary String : %s", Integer.toBinaryString(subject.getState()));
        System.out.println();
    }
}
