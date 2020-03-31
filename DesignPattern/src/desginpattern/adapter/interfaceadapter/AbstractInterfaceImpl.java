package desginpattern.adapter.interfaceadapter;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/31 17:04
 */
public class AbstractInterfaceImpl implements Interface{
    @Override
    public void method1() {
        System.out.println("method1 default");
    }

    @Override
    public void method2() {
        System.out.println("method2 default");
    }

    @Override
    public void method3() {
        System.out.println("method3 default");
    }
}
