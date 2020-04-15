package desginpattern.state;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/15 9:51
 */
public interface State {
    /**
     * 扣钱，进入可以抽奖的状态
     */
    void deductMoney();

    /**
     * 抽奖活动
     * @return true 中奖
     *          false 未中奖
     */
    boolean lottery();

    /**
     * 领奖
     */
    void getReward();
}
