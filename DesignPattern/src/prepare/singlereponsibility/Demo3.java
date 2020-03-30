package singlereponsibility;
/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/24 19:59
 */
public class Demo3 {
    public static void main(String[] args) {

    }
}

// 方式3的分析
// 1. 这种修改方法没有对原来的类做大的修改，只是增加了方法
// 2. 这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责

class Vehicle2{
    public void run(String vehicle){

    }
    public void runOnAir(String vehicle){

    }
    public void runInWater(String vehicle){

    }
}