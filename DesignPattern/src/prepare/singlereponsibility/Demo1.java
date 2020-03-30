package singlereponsibility;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/24 19:53
 */
public class Demo1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("car");
        vehicle.run("moto");
        vehicle.run("airplane");
    }
}

/**
 * 交通工具类
 * 方式1
 * 1. 方式1 的run方法中，违反了单一职责原则
 * 2. 解决方式：根据交通工具运行方法不同，分解成不同类即可
 */
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上跑");
    }
}
