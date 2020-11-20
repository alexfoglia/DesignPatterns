package templatemethodpattern.caffeinebeverage;

/**
 * Created by Alex on 4/16/2016.
 */
public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * We defined a hooked method with a mostly empty implementation. This is a hook because the subclass can override
     * this method, but doesn't have to. Use hook methods when part of algorithm is optional.
     * @return boolean
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
