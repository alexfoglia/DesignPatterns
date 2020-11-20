package strategypattern.ducks;

import strategypattern.flybehaviors.FlyWithWings;
import strategypattern.quackbehaviors.Quack;

/**
 * Created by Alex on 1/24/2016.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
