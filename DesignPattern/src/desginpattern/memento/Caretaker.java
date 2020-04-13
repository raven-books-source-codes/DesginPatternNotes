package desginpattern.memento;

import desginpattern.iterator.Menu;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/13 20:46
 */
public class Caretaker {
    private Map<String,Memento> mementoMap = new HashMap<>();

    public void addMemento(String key, Memento memento){
        mementoMap.put(key,memento);
    }

    public Memento getMemento(String key){
        return mementoMap.get(key);
    }

}
