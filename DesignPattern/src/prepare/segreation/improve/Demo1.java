package segreation.improve;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/25 10:49
 */
public class Demo1 {
}

interface Interface1{
    void operation1();
}

interface Interface2{
    void operation2();
    void operation3();
}

interface Interface3{
    void operation4();
    void operation5();
}

class B implements Interface1,Interface2{

    @Override
    public void operation1() {

    }

    @Override
    public void operation2() {

    }

    @Override
    public void operation3() {

    }
}

class D implements  Interface1,Interface3{

    @Override
    public void operation1() {

    }

    @Override
    public void operation4() {

    }

    @Override
    public void operation5() {

    }
}

class A{
    void operation1(Interface1 i){

    }

    void operation2(Interface2 i){

    }
    void operation3(Interface3 i){

    }
}

class C{
    void operation1(Interface1 i){

    }

    void operation4(Interface3 i){

    }
    void operation5(Interface3 i){

    }
}