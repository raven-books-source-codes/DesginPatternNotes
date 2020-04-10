package desginpattern.iterator;

import java.util.Iterator;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/10 10:02
 * 这家店墨守陈规，不添加新菜品，所以用数组存放
 */
public class KlinesIceCreamMenu implements Menu{
    static final int MAX_ITEM_NUM = 3;
    int numberOfItems = 0;
    private MenuItem[] menuItems;

    public KlinesIceCreamMenu(){
        menuItems = new MenuItem[MAX_ITEM_NUM];

        addItem("Chocolate", "The gold standard, creamy and chocolatey", 3.99);
        addItem("Vanilla", "Anything but boring", 3.99);
        addItem("Mint Chocolate Chip", "Minty, green and amazing", 4.99);
    }

    public void addItem(String name, String description, double price) {
        MenuItem menuItem = new MenuItem(name, description, price);
        if (numberOfItems >= MAX_ITEM_NUM) {
            System.err.println("Sorry we only allow 3 flavors at Kllines");
        } else {
            menuItems[numberOfItems] =  menuItem;
            numberOfItems += 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new KlinesIceCreamMenuIterator(menuItems);
    }
}
