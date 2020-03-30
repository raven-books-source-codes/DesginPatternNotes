package desginpattern.factory.abstractfactory.factory;

import desginpattern.factory.facotrymethod.pizza.Pizza;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/28 10:22
 */
public interface AbstractPizzaFactory {
     public Pizza createPizza(String name);
}
