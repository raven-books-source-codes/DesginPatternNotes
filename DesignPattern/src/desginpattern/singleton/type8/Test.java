package desginpattern.singleton.type8;

import java.io.*;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/27 11:13
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A a = new A();
        ByteArrayOutputStream bout = new ByteArrayOutputStream(1024);
        try(ObjectOutputStream objOut = new ObjectOutputStream(bout)){
            objOut.writeObject(a);
        }
        ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
        A recA;
        try(ObjectInputStream objInput = new ObjectInputStream(bin)){
            recA = (A) objInput.readObject();
        }
        System.out.println(recA);


    }
}

class A implements Serializable{
     int a = 10;
    transient int b = 20;

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}