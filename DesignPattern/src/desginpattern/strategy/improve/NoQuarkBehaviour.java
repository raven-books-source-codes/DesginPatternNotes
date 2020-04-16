package desginpattern.strategy.improve;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/16 10:04
 */
public class NoQuarkBehaviour implements QuackBehaviour{
    @Override
    public void quark() {
        System.out.println("can't quark");
    }
}
