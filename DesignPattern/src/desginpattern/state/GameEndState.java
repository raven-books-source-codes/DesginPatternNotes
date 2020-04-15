package desginpattern.state;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/15 9:59
 */
public class GameEndState implements State{

    private Game game;

    public GameEndState(Game game) {
        this.game = game;
    }

    @Override
    public void deductMoney() {
        System.out.println("游戏已结束");
    }

    @Override
    public boolean lottery() {
        System.out.println("游戏已结束");
        return false;
    }

    @Override
    public void getReward() {
        System.out.println("游戏已结束");
    }
}
