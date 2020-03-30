package desginpattern.factory.simplefactory;

import desginpattern.factory.simplefactory.pizza.CheesePizza;
import desginpattern.factory.simplefactory.pizza.GreekPizza;
import desginpattern.factory.facotrymethod.pizza.Pizza;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/28 9:59
 */
public class SimpleFactory {
    public static Pizza createPizza(String name){
        Pizza pizza = null;
        if(name.equals("greek")){
            pizza = new GreekPizza(name);
        }else if(name.equals("cheese")){
            pizza = new CheesePizza(name);
        }
        return pizza;
    }
}
