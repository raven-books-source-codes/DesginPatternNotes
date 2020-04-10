package desginpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/10 10:05
 */
public class OnlineMenu {
    private KlinesIceCreamMenu klinesIceCreamMenu;
    private PeddlersIceCreamMenu peddlersIceCreamMenu;

    public OnlineMenu(KlinesIceCreamMenu klinesIceCreamMenu, PeddlersIceCreamMenu peddlersIceCreamMenu) {
        this.klinesIceCreamMenu = klinesIceCreamMenu;
        this.peddlersIceCreamMenu = peddlersIceCreamMenu;
    }

    public void printAllMenus(){
        printMenu(klinesIceCreamMenu.createIterator());
        printMenu(peddlersIceCreamMenu.createIterator());
    }

    private void printMenu(Iterator<MenuItem> iterator){
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
