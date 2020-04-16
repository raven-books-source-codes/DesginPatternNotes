package desginpattern.strategy.improve;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/16 10:09
 */
public class Client {
    /**
     * 扩展性强，保持了ocp原则
     * @param args
     */
    public static void main(String[] args) {
        // 定义一个不会飞，但嘎嘎叫，会游泳的野鸭
        FlyBehaviour flyBehaviour = new NoFlyBehaviour();
        QuackBehaviour quackBehaviour = new GagaQuarkBehaviour();
        SwimBehaviour swimBehaviour = new CanSwimBehaviour();
        Duck duck = new WildDuck(flyBehaviour,swimBehaviour,quackBehaviour);
        duck.fly();
        duck.swim();
        duck.quark();

        // 定义一个会飞，不会叫，会游泳的玩具鸭子
        FlyBehaviour flyBehaviour1 = new CanFlyBehaviour();
        QuackBehaviour quackBehaviour1 = new NoQuarkBehaviour();
        SwimBehaviour swimBehaviour1 = new CanSwimBehaviour();
        Duck duck1 = new ToyDuck(flyBehaviour1,swimBehaviour1,quackBehaviour1);
        duck1.fly();
        duck1.swim();
        duck1.quark();
        // 运行时改变行为
        duck1.setFlyBehaviour(new NoFlyBehaviour());
        duck1.fly();

    }
}
