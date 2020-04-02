package desginpattern.decorator;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/2 9:55
 */
public class Decaf extends Drink {
    public Decaf() {
        setDes("Decaf Coffee");
    }

    @Override
    public double cost() {
        return 2;
    }
}
