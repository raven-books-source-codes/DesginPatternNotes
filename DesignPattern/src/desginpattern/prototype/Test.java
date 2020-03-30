package desginpattern.prototype;

import desginpattern.prototype.improve.serialize.DeepClone;
import desginpattern.prototype.improve.serialize.DeepCloneTarget;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/29 20:19
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Sheep sheep1 = new Sheep("a",1,"white");
//        Sheep sheep2 = new Sheep(sheep1.getName(),sheep1.getAge(),sheep1.getColor());
//        Sheep sheep3 = new Sheep(sheep1.getName(),sheep1.getAge(),sheep1.getColor());
//        Sheep sheep4 = new Sheep(sheep1.getName(),sheep1.getAge(),sheep1.getColor());
//        Sheep sheep5 = new Sheep(sheep1.getName(),sheep1.getAge(),sheep1.getColor());
//        Sheep sheep6 = new Sheep(sheep1.getName(),sheep1.getAge(),sheep1.getColor());
//        Sheep sheep7 = new Sheep(sheep1.getName(),sheep1.getAge(),sheep1.getColor());
//        Sheep sheep8 = new Sheep(sheep1.getName(),sheep1.getAge(),sheep1.getColor());
//
//        Sheep sheep9 =  sheep1.clone();
//
//        System.out.println(sheep1.hashCode());
//        System.out.println(sheep9.hashCode());

        DeepCloneTarget dt = new DeepCloneTarget("1");
        DeepClone dc = new DeepClone("123",dt);
        DeepClone dcCopy = dc.deepClone();
        System.out.println(dc == dcCopy);
        System.out.println(dc.getDeepCloneTarget() == dc.getDeepCloneTarget());
    }

}
