package patterns.action.commandpattern;

/**
 * ConcreteCommand：Command接口的实现者，用来执行具体的命令，某些情况下可以直接用来充当Receiver
 */
public class CommandSell implements Command {
    private Receiver abcReceiver;

    public CommandSell(Receiver abcReceiver) {
        this.abcReceiver = abcReceiver;
    }

    @Override
    public void execute() {
        abcReceiver.sell();
    }
}
