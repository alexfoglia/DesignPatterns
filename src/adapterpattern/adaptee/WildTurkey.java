package adapterpattern.adaptee;

/**
 * Created by Alex on 4/2/2016.
 */
public class WildTurkey implements Turkey {

    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I am flying a short distance");
    }
}

