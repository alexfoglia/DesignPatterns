package factorymethodpattern.creator;

import factorymethodpattern.product.ChicagoStyleCheesePizza;
import factorymethodpattern.product.Pizza;

/**
 * Created by Alex on 3/6/2016.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {

        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            //return new ChicagoSyleVeggiePizza();
        } else if (item.equals("clam")) {
            //return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            //return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
