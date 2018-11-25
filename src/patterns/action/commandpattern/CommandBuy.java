package patterns.action.commandpattern;

/**
 * ConcreteCommand：Command接口的实现者，用来执行具体的命令，某些情况下可以直接用来充当Receiver
 */
public class CommandBuy implements Command {
    private Receiver abcReceiver;

    public CommandBuy(Receiver abcReceiver) {
        this.abcReceiver = abcReceiver;
    }

    @Override
    public void execute() {
        abcReceiver.buy();
    }
}
