package desginpattern.strategy.improve;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/16 10:04
 */
public class CanSwimBehaviour implements SwimBehaviour{
    @Override
    public void swim() {
        System.out.println("can swim");
    }
}
