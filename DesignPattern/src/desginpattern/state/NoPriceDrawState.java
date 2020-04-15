package desginpattern.state;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/15 9:56
 * 不能抽奖状态
 */
public class NoPriceDrawState implements State{

    private Game game;

    public NoPriceDrawState(Game game) {
        this.game = game;
    }

    @Override
    public void deductMoney() {
        if(game.getMoney() >= 50){
            if(game.getCount() >0){
                // 可以进行抽奖
                System.out.println("您已成功支付");
                this.game.setMoney(this.game.getMoney()-50);
                this.game.setState(this.game.getCanLotteryState());
            }else{
                System.out.println("抽奖活动已结束");
                this.game.setState(this.game.getGameEndRewardState());
            }
        }else{
            System.out.println("金额不足，无法抽奖");
        }
    }

    @Override
    public boolean lottery() {
        System.out.println("请先充值");
        return false;
    }

    @Override
    public void getReward() {
        System.out.println("请先充值");
    }
}
