package factorymethodpattern.creator;

import factorymethodpattern.product.NYStyleCheesePizza;
import factorymethodpattern.product.Pizza;

/**
 * Created by Alex on 3/6/2016.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {

        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            //return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            //return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            //return new NYStylePepperoniPizza();
        }
        return null;
    }
}
