package patterns.action.observerpattern;

public class HaxaObserver extends Observer {
    public HaxaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.printf("Hexa String : %s", Integer.toHexString(subject.getState()).toUpperCase());
        System.out.println();
    }
}
