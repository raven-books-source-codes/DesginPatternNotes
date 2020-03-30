package desginpattern.builder.old.improve;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/30 9:54
 */
public class HighHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        house.name="high";
    }

    @Override
    public void buildWall() {
        house.height = 200;
    }

    @Override
    public void roofed() {

    }
}
