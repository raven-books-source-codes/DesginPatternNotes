package desginpattern.state;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/15 9:56
 * 抽奖游戏平台
 */
public class Game {

    // 奖品数量
    private int count;
    // 积分
    private int money;
    // 当前状态
    private State state;

    private State noPriceDrawState = new NoPriceDrawState(this);
    private State canLotteryState = new CanLotteryState(this);
    private State dispatchRewardState = new DispatchRewardState(this);
    private State gameEndRewardState = new GameEndState(this);


    public void setState(State state){
        this.state = state;
    }

    /**
     * 扣钱，进入可以抽奖的状态
     */
    public void deductMoney(){
        this.state.deductMoney();
    }

    /**
     * 抽奖活动
     */
    public void lottery(){
        if(this.state.lottery()){// 中奖与否？
            this.state.getReward();
        }
    }

    public State getNoPriceDrawState() {
        return noPriceDrawState;
    }

    public State getCanLotteryState() {
        return canLotteryState;
    }

    public State getDispatchRewardState() {
        return dispatchRewardState;
    }

    public State getGameEndRewardState() {
        return gameEndRewardState;
    }

    public Game(int count, int money) {
        this.count = count;
        this.money = money;
        this.state = this.noPriceDrawState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
