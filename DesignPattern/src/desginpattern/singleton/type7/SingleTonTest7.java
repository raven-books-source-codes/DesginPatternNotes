package desginpattern.singleton.type7;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/27 10:34
 */
public class SingleTonTest7 {
    public static void main(String[] args) {
        SingleTon i1 = SingleTon.getInstance();
        SingleTon i2 = SingleTon.getInstance();
        System.out.println(i1 == i2);
    }
}

class SingleTon{
    private SingleTon(){}

    // 静态内部类
    private static class SingleTonInstance{
         private final static SingleTon INSTANCE = new SingleTon();
         private  int i = 10;
    }

    public static SingleTon getInstance(){
        return SingleTonInstance.INSTANCE;
    }
}