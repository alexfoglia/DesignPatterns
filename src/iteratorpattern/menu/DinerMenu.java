package iteratorpattern.menu;

import iteratorpattern.menuiterator.DinerMenuIterator;

import java.util.Iterator;

/**
 * Created by Alex on 4/23/2016.
 */
public class DinerMenu implements Menu {

    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "Fake bacon with lettuce and tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce and tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day with potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog with saurkraut, relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! You cannot add the item to the menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
