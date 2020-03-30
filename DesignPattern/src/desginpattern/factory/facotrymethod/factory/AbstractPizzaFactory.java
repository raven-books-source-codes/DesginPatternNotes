package desginpattern.factory.facotrymethod.factory;

import desginpattern.factory.facotrymethod.pizza.Pizza;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/28 10:22
 */
public abstract  class AbstractPizzaFactory {

    public Pizza orderPizza(String name){
        Pizza pizza = createPizza(name);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract public Pizza createPizza(String name);
}
