package desginpattern.singleton.type8;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/27 10:49
 */
public class SingleTon8 {
    public static void main(String[] args) {
        SingleTon instance1 = SingleTon.INSTANCE;
        SingleTon instance2 = SingleTon.INSTANCE;
        System.out.println(instance1 == instance2);
    }
}

enum SingleTon{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok");
    }
}
