package patterns.action.visitorpattern;

public class Mouse implements ComputerPart {
    @Override
    public void accpet(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
