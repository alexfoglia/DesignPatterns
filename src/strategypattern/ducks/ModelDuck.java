package strategypattern.ducks;

import strategypattern.flybehaviors.FlyNoWay;
import strategypattern.quackbehaviors.Quack;

/**
 * Created by Alex on 1/24/2016.
 */
public class ModelDuck extends Duck {
    public ModelDuck () {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
