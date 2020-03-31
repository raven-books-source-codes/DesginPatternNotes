package desginpattern.globaltest;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/31 16:56
 */
public interface ITest {
    default int output(){
        System.out.println("itest output default method");
        return 0;
    }
}
