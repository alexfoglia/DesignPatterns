package strategypattern.quackbehaviors;

/**
 * Created by Alex on 1/24/2016.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
