package decoratorpattern.component;

/**
 * Created by Alex on 2/29/2016.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso Coffee";
    }

    public double cost() {
        return 1.99;
    }
}
