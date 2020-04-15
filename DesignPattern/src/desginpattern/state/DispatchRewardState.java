package desginpattern.state;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/15 9:59
 */
public class DispatchRewardState implements State{
    private Game game;

    public DispatchRewardState(Game game) {
        this.game=game;
    }

    @Override
    public void deductMoney() {
        System.out.println("已支付");
    }

    @Override
    public boolean lottery() {
        System.out.println("已抽奖");
        return false;
    }

    @Override
    public void getReward() {
        System.out.println("领取成功");
        this.game.setCount(this.game.getCount() - 1);
        this.game.setState(this.game.getNoPriceDrawState());
    }
}
