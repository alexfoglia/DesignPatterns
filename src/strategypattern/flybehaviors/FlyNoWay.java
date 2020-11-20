package strategypattern.flybehaviors;

/**
 * Created by Alex on 1/24/2016.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
