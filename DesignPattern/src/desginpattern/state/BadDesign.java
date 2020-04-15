package desginpattern.state;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/15 10:41
 */
public class BadDesign {
    private static final int NO_PRICE_STATE = 1;
    private static final int CAN_LOTTERY_STATE = 2;
    private static final int DISPATCH_REWARD_STATE = 3;
    private static final int GAME_END_STATE = 4;

    private int current_state = NO_PRICE_STATE;

    public void deductMoney(){
        // 判定当前是什么状态
        if(current_state == NO_PRICE_STATE){
            // do something
        }else if(current_state == DISPATCH_REWARD_STATE){
            // do something
        }else if(current_state == CAN_LOTTERY_STATE){
            // do something
        }else if(current_state == GAME_END_STATE){
            // do something
        }
    }

}
