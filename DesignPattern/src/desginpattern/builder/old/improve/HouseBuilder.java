package desginpattern.builder.old.improve;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/30 9:52
 */
public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBasic();
    public abstract  void  buildWall();
    public abstract void roofed();
    public House getHouse(){
        return this.house;
    }
}
