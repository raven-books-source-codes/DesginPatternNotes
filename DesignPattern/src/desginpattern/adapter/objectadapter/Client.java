package desginpattern.adapter.objectadapter;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/31 16:34
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter220VTo5V(new Voltage220V()));
    }
}
