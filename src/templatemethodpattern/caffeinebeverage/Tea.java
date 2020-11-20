package templatemethodpattern.caffeinebeverage;

/**
 * Created by Alex on 4/16/2016.
 */
public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }
}
