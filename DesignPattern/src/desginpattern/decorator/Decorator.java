package desginpattern.decorator;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/2 9:52
 */
public abstract class Decorator extends Drink{
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    public Drink getDrink() {
        return drink;
    }

    @Override
    public String getDes() {
        return super.getDes() +" && "+ drink.getDes();
    }
}
