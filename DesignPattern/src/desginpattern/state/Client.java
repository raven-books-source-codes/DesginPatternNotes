package desginpattern.state;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/15 10:10
 */
public class Client {
    public static void main(String[] args) {
        Game game = new Game(3,1000);
        for(int i = 0;i<20;i++){
            System.out.println("---------第"+i+"次抽奖--------");
            // 投币
            game.deductMoney();
            // 抽奖
            game.lottery();
        }
    }
}
