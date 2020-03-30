package desginpattern.singleton.type6;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/27 10:26
 */
public class SingleTonTest6 {
}
class SingleTon{
    // volatile关键字很重要
    private static volatile SingleTon instance;

    private SingleTon(){

    }

    public static SingleTon getInstance(){
        if(instance == null){
            synchronized (SingleTon.class){
                if(instance == null){   // double check
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }
}