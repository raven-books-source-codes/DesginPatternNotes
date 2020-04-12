package desginpattern.mediator;

import javax.crypto.Mac;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/12 12:46
 */
public class Client {
    public static void main(String[] args) {
        // 中介
        Mediator mediator = new HouseMediator();
        // 所有家电
        Alarm alarm = new Alarm(mediator);
        TV tv = new TV(mediator);
        Curtains curtains = new Curtains(mediator);
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator);

        // 顺序 闹钟 -> 咖啡 -> 窗帘 -> TV
        alarm.sendMessage(MachineName.COFFEE_MACHINE,true);
        coffeeMachine.sendMessage(MachineName.Curtains,true);
        curtains.sendMessage(MachineName.TV,true);
    }
}
