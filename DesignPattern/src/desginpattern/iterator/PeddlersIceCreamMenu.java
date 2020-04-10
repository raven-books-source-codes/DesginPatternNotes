package desginpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/10 10:03
 * 这家店用于创新，经常添加新菜品，所以用List
 */
public class PeddlersIceCreamMenu implements Menu{
    private List<MenuItem> menuItems;

    public PeddlersIceCreamMenu() {
        menuItems = new ArrayList();

        addItem("Snickerdoodle", "Cinnamon Ice cream with delciious snickerdoodle cookies inside", 2.99);
        addItem("Vegan Chocolate", "So good for you and your restrictive dietary needs", 8.99);
    }

    public void addItem(String name, String description, double price) {
        MenuItem menuItem = new MenuItem(name, description, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new PeddlersIceCreamMenuIterator(menuItems);
    }
}
