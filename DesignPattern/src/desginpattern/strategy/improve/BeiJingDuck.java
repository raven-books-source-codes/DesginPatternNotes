package desginpattern.strategy.improve;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/16 9:54
 */
public class BeiJingDuck extends Duck {
    public BeiJingDuck(FlyBehaviour flyBehaviour, SwimBehaviour swimBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, swimBehaviour, quackBehaviour);
    }

    @Override
    public void display() {

    }
}
