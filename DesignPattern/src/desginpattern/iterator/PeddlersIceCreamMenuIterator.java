package desginpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/10 10:15
 */
public class PeddlersIceCreamMenuIterator implements Iterator<MenuItem> {

    private List<MenuItem> items;
    private int idx = 0;

    public PeddlersIceCreamMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(idx >= items.size()){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public MenuItem next() {
        return items.get(idx++);
    }
}
