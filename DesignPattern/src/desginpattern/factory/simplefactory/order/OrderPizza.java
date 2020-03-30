package desginpattern.factory.simplefactory.order;

import desginpattern.factory.simplefactory.SimpleFactory;
import desginpattern.factory.facotrymethod.pizza.Pizza;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/28 9:35
 */
public class OrderPizza {
    public Pizza orderPizza(String pizzaName){
        return SimpleFactory.createPizza(pizzaName);
    }
}
