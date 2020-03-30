package lishi_repalce;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/26 10:41
 */
public class Demo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11,3));

        B b = new B();
        // 因为B类不再继承A类，因此调用者，不会再func1是求减法
        // 调用完成的功能就会很明确
        System.out.println("11-3="+b.func1(11,3));// 这里本意是求出11-3
    }
}

// 创建一个更加基础的基类
class Base{
    // 将更加基础的方法和成员写到base类。
}

class A extends Base{
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}

class B extends Base{
    // 使用组合关系
    private A a = new A();
    public int func1(int num1, int num2) {
        return num1+num2;
    }

    public int func2(int a, int b){
        return func1(a,b) + 9;
    }

    public int func3(int a, int b){
        return this.a.func1(a,b);
    }
}
