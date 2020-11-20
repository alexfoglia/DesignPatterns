package iteratorpattern.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Alex on 4/23/2016.
 */
public class PancakeHouseMenu implements Menu {

    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancake with fried eggs and sausage", false, 2.99);
        addItem("Blueberries Pancakes", "Pancakes with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles with tour choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
