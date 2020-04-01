package desginpattern.bridge;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/1 10:39
 */
public class Xiaomi implements Brand {
    @Override
    public void open() {
        System.out.println("xiaomi open");
    }

    @Override
    public void close() {
        System.out.println("xiaomi close");
    }
}
