package desginpattern.strategy.improve;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/16 9:53
 */
public class WildDuck extends Duck {
    public WildDuck(FlyBehaviour flyBehaviour, SwimBehaviour swimBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, swimBehaviour, quackBehaviour);
    }

    @Override
    public void display() {

    }
}
