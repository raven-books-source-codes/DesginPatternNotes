package desginpattern.strategy.improve;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/16 10:02
 */
public class NoFlyBehaviour implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
