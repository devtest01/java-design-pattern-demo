package patterns.action.templatepattern;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println(this.getClass().getSimpleName() + " game initialized ! Start playing...");
    }

    @Override
    void startPlay() {
        System.out.println(this.getClass().getSimpleName() + " game started ! Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println(this.getClass().getSimpleName() + " game finished!");
    }
}
