package decoratorpattern.component;

/**
 * Created by Alex on 2/29/2016.
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return 0.99;
    }
}
