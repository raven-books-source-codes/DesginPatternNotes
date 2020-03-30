package desginpattern.factory.abstractfactory;

import desginpattern.factory.abstractfactory.factory.AbstractPizzaFactory;
import desginpattern.factory.abstractfactory.factory.BJPizzaFactory;
import desginpattern.factory.facotrymethod.pizza.Pizza;

import java.util.Calendar;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/28 10:54
 */
public abstract class PizzaStore {
    public static void main(String[] args) {
        AbstractPizzaFactory factory = new BJPizzaFactory();
        Pizza pizza = factory.createPizza("sweat");
        pizza.prepare();
        System.out.println(pizza);
    }
}
