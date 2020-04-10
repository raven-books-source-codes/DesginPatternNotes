package desginpattern.iterator;

import java.util.Iterator;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/10 10:12
 */
public interface Menu {
    Iterator<MenuItem> createIterator();
}
