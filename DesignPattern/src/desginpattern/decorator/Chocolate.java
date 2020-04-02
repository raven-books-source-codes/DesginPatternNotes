package desginpattern.decorator;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/2 10:01
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
    }

    @Override
    public double cost() {
        return 2+getDrink().cost();
    }
}
