package desginpattern.singleton.type4;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/27 10:14
 */
public class SingleTonTest {
    public static void main(String[] args) {
        SingleTon instance1 =SingleTon.getInstance();
        SingleTon instance2 =SingleTon.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class SingleTon{
    private static SingleTon instance;

    private SingleTon(){

    }

    // 提供一个静态的共有方法，当使用该方法时，才去创建instance
    // 加入同步代码,解决线程安全
    public static synchronized SingleTon getInstance(){
        if(instance == null){

            instance = new SingleTon();
        }
        return instance;
    }
}
