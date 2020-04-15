package desginpattern.state;

import java.util.Random;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/15 9:59
 */
public class CanLotteryState implements State{

    private Game game;

    public CanLotteryState(Game game) {
        this.game = game;
    }

    @Override
    public void deductMoney() {
        System.out.println("已支付");
    }

    @Override
    public boolean lottery() {
        // 进行抽奖
        Random random = new Random();
        int n = random.nextInt(10);
        if(n == 0){
            System.out.println("恭喜你中奖,请领取你的奖品");
            this.game.setState(this.game.getDispatchRewardState());
            return true;
        }else{
            System.out.println("不好意思，暂未中奖");
            this.game.setState(this.game.getNoPriceDrawState());
            return false;
        }
    }

    @Override
    public void getReward() {
        System.out.println("请先进行抽奖");
    }
}
