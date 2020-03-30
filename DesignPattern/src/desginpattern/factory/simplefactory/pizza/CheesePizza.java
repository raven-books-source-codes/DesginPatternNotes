package desginpattern.factory.simplefactory.pizza;

import desginpattern.factory.facotrymethod.pizza.Pizza;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/28 9:24
 */
public class CheesePizza extends Pizza {
    public CheesePizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println(CheesePizza.class.getSimpleName()+"prepared");
    }
}
