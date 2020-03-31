package desginpattern.adapter.objectadapter;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/31 16:33
 */
public class VoltageAdapter220VTo5V  implements IVoltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter220VTo5V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public Voltage220V getVoltage220V() {
        return voltage220V;
    }

    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int srcV = this.voltage220V.output220V();
        int desV = srcV/44;
        return desV;
    }
}
