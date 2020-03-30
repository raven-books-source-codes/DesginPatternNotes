package desginpattern.factory.abstractfactory.factory;

import desginpattern.factory.facotrymethod.pizza.LdPepperPizza;
import desginpattern.factory.facotrymethod.pizza.LdSweatPizza;
import desginpattern.factory.facotrymethod.pizza.Pizza;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/28 10:26
 */
public class LDPizzaFactory implements AbstractPizzaFactory {
    @Override
    public Pizza createPizza(String name) {
        if("pepper".equals(name)){
            return new LdPepperPizza(name);
        }else if("sweat".equals(name)){
            return new LdSweatPizza(name);
        }
        return null;
    }
}
