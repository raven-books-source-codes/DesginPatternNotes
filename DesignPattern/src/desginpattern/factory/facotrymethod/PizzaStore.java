package desginpattern.factory.facotrymethod;

import desginpattern.factory.facotrymethod.factory.AbstractPizzaFactory;
import desginpattern.factory.facotrymethod.factory.BJPizzaFactory;
import desginpattern.factory.facotrymethod.factory.LDPizzaFactory;
import desginpattern.factory.facotrymethod.pizza.Pizza;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/28 10:27
 */
public class PizzaStore {
    public static void main(String[] args) {
        // BJ
        AbstractPizzaFactory bjPizzaFactory = new BJPizzaFactory();
        Pizza pizza = bjPizzaFactory.orderPizza("pepper");
        System.out.println(pizza);

        // LD
        AbstractPizzaFactory ldPizzaFactory = new LDPizzaFactory();
        Pizza pizza1 = ldPizzaFactory.orderPizza("pepper");
        System.out.println(pizza1);
    }
}
