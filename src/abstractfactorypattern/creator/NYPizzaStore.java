package abstractfactorypattern.creator;

import abstractfactorypattern.product.CheesePizza;
import abstractfactorypattern.product.ClamPizza;
import abstractfactorypattern.product.NYPizzaIngredientFactory;
import abstractfactorypattern.product.Pizza;
import abstractfactorypattern.product.PizzaIngredientFactory;

/**
 * Created by Alex on 3/6/2016.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            //return new VeggiePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (type.equals("pepperoni")) {
            //return new PepperoniPizza();
        }
        return pizza;
    }
}
