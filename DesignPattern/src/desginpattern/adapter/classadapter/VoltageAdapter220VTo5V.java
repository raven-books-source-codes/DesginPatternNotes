package desginpattern.adapter.classadapter;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/31 16:33
 */
public class VoltageAdapter220VTo5V extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int srcV = output220V();
        int desV = srcV/44;
        return desV;
    }
}
