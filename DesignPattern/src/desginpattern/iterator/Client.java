package desginpattern.iterator;

import java.util.List;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/10 10:16
 */
public class Client {
    public static void main(String[] args) {

        KlinesIceCreamMenu klinesIceCreamMenu = new KlinesIceCreamMenu();
        PeddlersIceCreamMenu peddlersIceCreamMenu = new PeddlersIceCreamMenu();

        OnlineMenu onlineMenu = new OnlineMenu(klinesIceCreamMenu,peddlersIceCreamMenu);
        onlineMenu.printAllMenus();;
    }
}
