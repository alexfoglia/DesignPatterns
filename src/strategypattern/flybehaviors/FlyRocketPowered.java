package strategypattern.flybehaviors;

/**
 * Created by Alex on 1/24/2016.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
