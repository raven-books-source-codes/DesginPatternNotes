package desginpattern.factory.facotrymethod.factory;

import desginpattern.factory.facotrymethod.pizza.*;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/28 10:26
 */
public class LDPizzaFactory extends AbstractPizzaFactory {
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
