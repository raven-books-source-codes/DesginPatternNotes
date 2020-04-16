package desginpattern.strategy.improve;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/16 10:02
 */
public class CanFlyBehaviour implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("can fly");
    }
}
