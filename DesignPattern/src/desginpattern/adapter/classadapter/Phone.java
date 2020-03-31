package desginpattern.adapter.classadapter;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/31 16:33
 */
public class Phone {
    public void charge(IVoltage5V adapter){
        int voltage = adapter.output5V();
        if(voltage == 5){
            System.out.println("5v charging~");
        }else{
            System.out.println("not 5v, can't charging~");
        }
    }
}
