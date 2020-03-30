package desginpattern.singleton.type5;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/27 10:21
 */
public class SingleTonTest5 {
    public static void main(String[] args) {
        
    }
}
class SingleTon{
    private static SingleTon instance;

    private SingleTon(){

    }

    // 提供一个静态的共有方法，当使用该方法时，才去创建instance
    // 没有解决线程安全问题
    public static SingleTon getInstance(){
        if(instance == null){
            synchronized (SingleTon.class){
                instance = new SingleTon();
            }
        }
        return instance;
    }
}
