package singlereponsibility;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/24 19:56
 */
public class Demo2 {
    public static void main(String[] args) {

    }
}

/**
 * 方案2分析
 * 1. 遵守单一原则
 * 2. 但是开销很大，需要修改客户端
 * 3. 改进：直接修改Vehicle 类，改动的代码会比较少=>
 */
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"公路运行");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"天上运行");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"水里运行");
    }
}