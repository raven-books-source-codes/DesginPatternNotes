package desginpattern.flyweight;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/5 10:26
 * IntegerTest源码中使用了FlyWeight模式
 */
public class IntegerTest {
    public static void main(String[] args) {
        /* integer 在-128 - 127 之间做了缓存*/
        Integer x = Integer.valueOf(129);
        Integer y = new Integer(123);
        Integer z = Integer.valueOf(129);
        Integer w = new Integer(123);

        System.out.println(x == y);
        System.out.println(x == z);
        System.out.println(x == w);
        System.out.println(y == z);
        System.out.println(y == w);
        System.out.println(z == w);
    }

}
