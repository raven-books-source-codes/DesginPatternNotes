package desginpattern.factory.simplefactory.pizza;

import desginpattern.factory.facotrymethod.pizza.Pizza;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/28 9:26
 */
public class GreekPizza extends Pizza {

    public GreekPizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println(this.getClass().getSimpleName()+"prepared");
    }
}
