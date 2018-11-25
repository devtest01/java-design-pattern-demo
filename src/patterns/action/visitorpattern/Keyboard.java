package patterns.action.visitorpattern;

public class Keyboard implements ComputerPart {
    @Override
    public void accpet(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
