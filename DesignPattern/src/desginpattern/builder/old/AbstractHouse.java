package desginpattern.builder.old;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/30 9:05
 */
public abstract class AbstractHouse {
    protected abstract void buildBasics();
    protected abstract void buildWall();
    protected abstract void roofed();

    public void build(){
        buildBasics();
        buildWall();
        roofed();
    }
}
