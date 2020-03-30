package desginpattern.builder.old.improve;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/30 9:56
 */
public class Client {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new CommonHouseBuilder();
        Director director = new Director(houseBuilder);
        House house1 = director.buildHouse();
        System.out.println(house1);
        House house2 = director.buildHouse();
        System.out.println(house2);
    }
}
