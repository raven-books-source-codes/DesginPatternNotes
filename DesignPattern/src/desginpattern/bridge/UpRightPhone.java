package desginpattern.bridge;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/1 10:45
 */
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.println("upright phone");
        super.open();
    }

    @Override
    public void close() {
        System.out.println("upright phone");
        super.close();
    }
}
