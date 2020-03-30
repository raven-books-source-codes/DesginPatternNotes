package desginpattern.builder.old.improve;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/30 9:53
 */
public class CommonHouseBuilder  extends HouseBuilder{
    @Override
    public void buildBasic() {
        house.name = "common";
    }

    @Override
    public void buildWall() {
        house.height = 20;
    }

    @Override
    public void roofed() {

    }
}
