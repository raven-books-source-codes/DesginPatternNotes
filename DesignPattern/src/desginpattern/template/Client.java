package desginpattern.template;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/7 9:14
 */
public class Client {
    public static void main(String[] args) {
        SoyaMilk redBeanMilk = new RedBeanMilk();
        redBeanMilk.make();

        SoyaMilk peanutMilk = new PeanutMilk();
        peanutMilk.make();

        SoyaMilk pureSoya = new PureSoya();
        pureSoya.make();
    }
}
