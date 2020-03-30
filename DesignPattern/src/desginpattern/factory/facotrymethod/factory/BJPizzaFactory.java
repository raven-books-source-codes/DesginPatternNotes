package desginpattern.factory.facotrymethod.factory;

import desginpattern.factory.facotrymethod.pizza.BJPepperPizza;
import desginpattern.factory.facotrymethod.pizza.BJSweatPizza;
import desginpattern.factory.facotrymethod.pizza.Pizza;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/28 10:23
 */
public class BJPizzaFactory extends AbstractPizzaFactory {
    @Override
    public Pizza createPizza(String name) {
        if("pepper".equals(name)){
            return new BJPepperPizza(name);
        }else if("sweat".equals(name)){
            return new BJSweatPizza(name);
        }
        return null;
    }
}
