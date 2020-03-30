package desginpattern.singleton.type2;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/27 9:47
 */
public class SingleTonTest2 {
    public static void main(String[] args) {
        SingleTon instance1 = SingleTon.getInstance();
        SingleTon instance2 = SingleTon.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
    
}
class SingleTon{
    // 2. 静态常量实例
    private static final SingleTon instance;
    static{
        instance = new SingleTon();
    }


    // 1. 构造器私有化
    private SingleTon(){

    }

    // 3.公有静态方法返回
    public static SingleTon getInstance(){
        return instance;
    }
}
