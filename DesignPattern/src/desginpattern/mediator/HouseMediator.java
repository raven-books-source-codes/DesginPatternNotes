package desginpattern.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/12 12:37
 *
 */
public class HouseMediator extends Mediator{

    private Map<String,Colleague> colleagueMap = new HashMap<>();

    @Override
    public void sendMessage(String toWhom, boolean open) {
        Colleague colleague;
        if((colleague = colleagueMap.get(toWhom)) != null){
            colleague.receiveMessage(open);
        }
    }

    @Override
    public void registerColleague(String name, Colleague colleague) {
        if(!colleagueMap.containsKey(name)){
            colleagueMap.put(name,colleague);
        }
    }

}
