package patterns.action.visitorpattern;

public class Monitor implements ComputerPart {
    @Override
    public void accpet(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
