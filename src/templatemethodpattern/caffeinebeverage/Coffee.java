package templatemethodpattern.caffeinebeverage;

/**
 * Created by Alex on 4/16/2016.
 */
public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
