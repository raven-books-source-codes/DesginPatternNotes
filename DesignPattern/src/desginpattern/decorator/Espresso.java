package desginpattern.decorator;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/2 9:56
 */
public class Espresso extends Drink {
    public Espresso() {
        setDes("Espresso");
    }

    @Override
    public double cost() {
        return 3;
    }
}
