package segreation;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/25 9:08
 */
public class Demo1 {
}


interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1{

    @Override
    public void operation1() {

    }

    @Override
    public void operation2() {

    }

    @Override
    public void operation3() {

    }

    @Override
    public void operation4() {

    }

    @Override
    public void operation5() {
    }
}

class D implements Interface1{

    @Override
    public void operation1() {

    }

    @Override
    public void operation2() {

    }

    @Override
    public void operation3() {

    }

    @Override
    public void operation4() {

    }

    @Override
    public void operation5() {

    }
}

// A类通过接口Interface1依赖B类，但是只会用到1,2,3方法
class A{
    public void depend1(Interface1 iter){
        iter.operation1();
    }
    public void depend2(Interface1 iter){
        iter.operation2();
    }
    public void depend3(Interface1 iter){
        iter.operation3();
    }
}

class C{
    public void depend1(Interface1 iter){
        iter.operation1();
    }
    public void depend4(Interface1 iter){
        iter.operation4();
    }
    public void depend5(Interface1 iter){
        iter.operation5();
    }
}