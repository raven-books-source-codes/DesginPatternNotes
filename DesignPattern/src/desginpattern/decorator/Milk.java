package desginpattern.decorator;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/2 9:58
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("Milk");
    }

    @Override
    public double cost() {
        return 2.0+getDrink().cost();
    }
}
