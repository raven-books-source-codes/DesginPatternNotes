package desginpattern.strategy.improve;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/16 10:05
 */
public class NoSwimBehaviour implements SwimBehaviour {
    @Override
    public void swim() {
        System.out.println("can't swim");
    }
}
