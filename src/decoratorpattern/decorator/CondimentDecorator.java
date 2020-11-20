package decoratorpattern.decorator;

import decoratorpattern.component.Beverage;

/**
 * Created by Alex on 2/29/2016.
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
