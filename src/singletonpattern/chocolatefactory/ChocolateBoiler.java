package singletonpattern.chocolatefactory;

/**
 * Created by Alex on 3/23/2016.
 */
public class ChocolateBoiler {
    private static volatile ChocolateBoiler INSTANCE;
    private boolean empty;
    private boolean boiled;

    /*
     Other two methods of creating a singleton class:

     1) Eager instantiation:

      private static volatile ChocolateBoiler INSTANCE = new ChocolateBoiler();

      Note: JVM makes sure that only one thread will create a single instance of this object. This approach is good
      but not optimal of creation of this instance is not really used heavily or if creation of the instance takes a lot
      of resource but used only once or so.

      2) Synchronize getInstance() method:

      public static synchronized ChocolateBoiler getInstance() {
        ...
      }

      Note: Each thread will take turns to run this method. This approach works fine but synchronization is expensive.
      It would not be effective to use this in case lots of threads would be calling this method. We only need to
      instantiate the class once. The third method called "double locking" is implemented in this class and is best to
      use; however it is not thread-safe in Java 2, version 5.

      Final notes:
        If using two class loaders, we could end up with two instances of the same singleton class resulting in unexpected
        behavior. If this is the case, it is good to specify the classloader yourself.
     */

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (INSTANCE == null) {
            synchronized (ChocolateBoiler.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ChocolateBoiler();
                    System.out.println("Creating singleton instance of ChocolateBoiler. Hashcode: " + INSTANCE.hashCode());
                } else {
                    System.out.println("Instance of ChocolateBoiler already created (inside synchronized code). Hashcode: "
                            + INSTANCE.hashCode());
                }
            }
        } else {
            System.out.println("Instance of ChocolateBoiler already created (outside synchronized code). Hashcode: "
                    + INSTANCE.hashCode());
        }
        return INSTANCE;
    }

    public void fill() {
        if (isEmpty()) {
            // Fills boiler with milk and chocolate
            empty = false;
            boiled = false;
            System.out.println("Filling the boiler with milk and chocolate");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // Drain the boiled milk and chocolate
            empty = true;
            System.out.println("Draining the boiled milk and chocolate");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // Bring contents to a boil
            boiled = true;
            System.out.println("Boiling the milk and chocolate");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
