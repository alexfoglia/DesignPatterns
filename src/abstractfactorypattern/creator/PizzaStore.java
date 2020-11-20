package abstractfactorypattern.creator;

import abstractfactorypattern.product.Pizza;

/**
 * Created by Alex on 3/6/2016.
 */
public abstract class PizzaStore {

    abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
