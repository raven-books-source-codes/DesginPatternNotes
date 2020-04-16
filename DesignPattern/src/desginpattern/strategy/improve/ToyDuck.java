package desginpattern.strategy.improve;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/16 9:54
 */
public class ToyDuck extends Duck {
    public ToyDuck(FlyBehaviour flyBehaviour, SwimBehaviour swimBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, swimBehaviour, quackBehaviour);
    }

    @Override
    public void display() {

    }
}
