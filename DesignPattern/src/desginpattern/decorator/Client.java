package desginpattern.decorator;

import java.io.FilterInputStream;
import java.io.InputStream;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/2 10:04
 */
public class Client {
    public static void main(String[] args) {
        Drink order = new Espresso();
        // add milk
        order = new Milk(order);
        // add chocolate twice
        order = new Chocolate(order);
        order = new Chocolate(order);
        // output the result
        System.out.println(order.getDes() + " " + order.cost());


    }
}
