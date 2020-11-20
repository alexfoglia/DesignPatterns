package decoratorpattern.component;

/**
 * Created by Alex on 2/29/2016.
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
