package desginpattern.decorator;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/2 9:57
 */
public class Mocha extends Decorator {

    public Mocha(Drink drink) {
        super(drink);
        setDes("Mocha");
    }

    @Override
    public double cost() {
        return 3.0+getDrink().cost();
    }
}
