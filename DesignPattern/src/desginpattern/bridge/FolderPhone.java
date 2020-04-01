package desginpattern.bridge;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/1 10:44
 */
public class FolderPhone extends Phone {
    public FolderPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.println("folder phone");
        super.open();
    }

    @Override
    public void close() {
        System.out.println("folder phone");
        super.close();
    }
}
