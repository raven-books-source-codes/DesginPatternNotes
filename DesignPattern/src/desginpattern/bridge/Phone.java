package desginpattern.bridge;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/1 10:38
 */
public abstract class Phone {
    protected Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open(){
        this.brand.open();
    }

    public void close(){
        this.brand.close();
    }
}
