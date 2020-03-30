package desginpattern.factory.simplefactory.order;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/28 9:37
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza order = new OrderPizza();
        order.orderPizza("greek");
    }
}
