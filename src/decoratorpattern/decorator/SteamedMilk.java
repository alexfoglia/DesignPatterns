package decoratorpattern.decorator;

import decoratorpattern.component.Beverage;

/**
 * Created by Alex on 2/29/2016.
 */
public class SteamedMilk extends CondimentDecorator {

    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    public double cost() {
        return beverage.cost() + 0.10;
    }
}
