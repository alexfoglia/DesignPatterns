package iteratorpattern.waitress;

import iteratorpattern.menu.Menu;
import iteratorpattern.menu.MenuItem;

import java.util.Iterator;

/**
 * Created by Alex on 4/23/2016.
 */
public class Waitress {

    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("Menu\n----\nBreakfast");
        printMenuItems(pancakeIterator);

        System.out.println("\n\nLunch");
        printMenuItems(dinerIterator);
    }

    private void printMenuItems(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
