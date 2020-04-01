package desginpattern.bridge;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/1 10:39
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("vivo open");
    }

    @Override
    public void close() {
        System.out.println("vivo close");
    }
}
