package decoratorpattern.component;

/**
 * Created by Alex on 2/29/2016.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return 0.89;
    }
}
