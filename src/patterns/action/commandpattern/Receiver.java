package patterns.action.commandpattern;

/**
 * Receiver：命令的实际执行者
 */

public class Receiver {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.printf("Receiver [ Name : %s, Quantity : %d ] bought.", name,quantity);
        System.out.println();
    }

    public void sell() {
        System.out.printf("Receiver [ Name : %s, Quantity : %d ] sold.", name,quantity);
        System.out.println();
    }
}
