package adapterpattern.target;

/**
 * Created by Alex on 4/2/2016.
 */
public class MallardDuck implements Duck {

    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I am flying");
    }
}
