package desginpattern.globaltest;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/31 16:56
 */
public class Test implements ITest{
    public static void main(String[] args) {
        ITest test = new Test();
        test.output();
    }
}
