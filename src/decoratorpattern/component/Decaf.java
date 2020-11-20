package decoratorpattern.component;

/**
 * Created by Alex on 2/29/2016.
 */
public class Decaf extends Beverage{

    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}
