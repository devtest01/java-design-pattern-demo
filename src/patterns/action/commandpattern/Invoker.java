package patterns.action.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker：命令的请求者，是命令模式中最重要的角色。这个角色用来对各个命令进行控制。
 */
public class Invoker {
    private List<Command> commandList = new ArrayList<>();
    private Command command;

    // 设置单条命令
    public void setCommand(Command command) {
        this.command = command;
    }

    // 执行单条命令
    public void invokeSingleCommand() {
        System.out.println("Start execute single command.");
        this.command.execute();
    }

    // 添加命令
    public void addCommand(Command command) {
        this.commandList.add(command);
    }

    // 执行多条命令
    public void invokeMultipleCommands() {

        System.out.println("Start execute multiple commands.");

        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }


}
