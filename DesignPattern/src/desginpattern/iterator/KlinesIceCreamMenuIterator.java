package desginpattern.iterator;

import java.util.Iterator;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/10 10:13
 */
public class KlinesIceCreamMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] items;
    private int idx = 0;

    public KlinesIceCreamMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(idx >= items.length || items[idx] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public MenuItem next() {
        return items[idx++];
    }
}
