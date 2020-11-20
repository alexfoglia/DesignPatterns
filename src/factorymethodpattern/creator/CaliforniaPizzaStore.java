package factorymethodpattern.creator;

import factorymethodpattern.product.Pizza;

/**
 * Created by Alex on 3/6/2016.
 */
public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {

        if (item.equals("cheese")) {
            //return new CaliforniaStyleCheesePizza();
        } else if (item.equals("veggie")) {
            //return new CaliforniaSyleVeggiePizza();
        } else if (item.equals("clam")) {
            //return new CaliforniaStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            //return new CaliforniaStylePepperoniPizza();
        }
        return null;
    }
}
