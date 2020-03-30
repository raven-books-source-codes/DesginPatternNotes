package desginpattern.singleton.serialize;

import java.io.*;
import java.util.Arrays;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/27 10:54
 * 序列化测试
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingleTonEnum sdb1 = SingleTonEnum.INSTANCE;
        // 对象序列化流
        ByteArrayOutputStream bout = new ByteArrayOutputStream(1024);
        ObjectOutputStream objOut = new ObjectOutputStream(bout);
        objOut.writeObject(sdb1);
        // 对象序列化读入
        ObjectInputStream objInput = new ObjectInputStream(
                new ByteArrayInputStream(bout.toByteArray()));
        SingleTonEnum sdb2 = (SingleTonEnum) objInput.readObject();
        System.out.println(sdb1 == sdb2);

        objInput.close();
        objOut.close();
        bout.close();
    }
}

class SingleTonDoubleCheck implements Serializable {
    private volatile static SingleTonDoubleCheck instance;

    private SingleTonDoubleCheck(){

    }

    public static SingleTonDoubleCheck getInstance(){
        if(instance == null){
            synchronized (SingleTonDoubleCheck.class){
                if (instance == null){
                    instance = new SingleTonDoubleCheck();
                }
            }
        }
        return instance;
    }

}

class SingleTonInnerClass implements Serializable{
    private SingleTonInnerClass(){

    }

    private static class SingleTonInstance{
        private static final SingleTonInnerClass INSTANCE = new SingleTonInnerClass();
    }

    public static  SingleTonInnerClass getInstance(){
        return SingleTonInstance.INSTANCE;
    }

}

enum SingleTonEnum{
    INSTANCE;
}