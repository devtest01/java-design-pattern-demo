package patterns.action.visitorpattern;

public class Computer implements ComputerPart {

    ComputerPart[] computerParts;

    public Computer() {
        this.computerParts = new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor()};
    }

    @Override
    public void accpet(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < computerParts.length; i++) {
            computerParts[i].accpet(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
