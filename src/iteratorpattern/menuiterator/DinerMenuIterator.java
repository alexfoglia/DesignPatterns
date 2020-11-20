package iteratorpattern.menuiterator;

import iteratorpattern.menu.MenuItem;

import java.util.Iterator;

/**
 * Created by Alex on 4/23/2016.
 */
public class DinerMenuIterator implements Iterator {

    private MenuItem[] list;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = list[position];
        position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you have done at least one next()");
        } else {
            if (list[position] != null) {
               // for (int i = position - 1; i < (list.length - 1); i++) {
               //     list[i] = list[i + 1];
                    System.arraycopy(list, position - 1, list, 0, list.length - 1);
               // }
            }
            list[list.length - 1] = null;
        }
    }
}
