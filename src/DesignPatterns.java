import adapterpattern.adaptee.WildTurkey;
import adapterpattern.adapter.TurkeyAdapter;
import decoratorpattern.component.Beverage;
import decoratorpattern.component.DarkRoast;
import decoratorpattern.component.Espresso;
import decoratorpattern.component.HouseBlend;
import decoratorpattern.decorator.Mocha;
import decoratorpattern.decorator.Soy;
import decoratorpattern.decorator.Whip;
import facadepattern.facade.HomeTheaterFacade;
import facadepattern.hometheater.Amplifier;
import facadepattern.hometheater.CdPlayer;
import facadepattern.hometheater.DvdPlayer;
import facadepattern.hometheater.PopcornPopper;
import facadepattern.hometheater.Projector;
import facadepattern.hometheater.Screen;
import facadepattern.hometheater.TheaterLights;
import facadepattern.hometheater.Tuner;
import factorymethodpattern.creator.ChicagoPizzaStore;
import factorymethodpattern.creator.NYPizzaStore;
import factorymethodpattern.creator.PizzaStore;
import factorymethodpattern.product.Pizza;
import iteratorpattern.menu.DinerMenu;
import iteratorpattern.menu.PancakeHouseMenu;
import iteratorpattern.waitress.Waitress;
import observerpattern.display.CurrentConditionsDisplay;
import observerpattern.display.ForecastDisplay;
import observerpattern.display.HeatIndexDisplay;
import observerpattern.display.StatisticsDisplay;
import observerpattern.javabuiltinsupport.CurrentConditionsDisplayJavaBuiltIn;
import observerpattern.javabuiltinsupport.WeatherDataJavaBuiltIn;
import observerpattern.subject.WeatherData;

import singletonpattern.chocolatefactory.ChocolateBoiler;
import strategypattern.ducks.Duck;
import strategypattern.flybehaviors.FlyRocketPowered;
import strategypattern.ducks.MallardDuck;
import strategypattern.ducks.ModelDuck;
import templatemethodpattern.caffeinebeverage.CaffeineBeverage;
import templatemethodpattern.caffeinebeverage.Coffee;
import templatemethodpattern.caffeinebeverage.MateWithHookMethod;
import templatemethodpattern.caffeinebeverage.Tea;

public class DesignPatterns {

    public static void main(String[] args) {

        boolean strategyPattern = false;
        boolean observerPattern = false;
        boolean decoratorPattern = true;
        boolean factoryMethodPattern = false;
        boolean abstractFactoryPattern = false;
        boolean singletonPattern = false;
        boolean adapterPattern = false;
        boolean facadePattern = false;
        boolean templateMethodPattern = false;
        boolean iteratorPattern = false;

        //------------------------------------------STRATEGY PATTERN--------------------------------------------------//
        /*
            This pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy
            pattern let's the algorithm vary independently from the clients that use it.
         */
        if (strategyPattern) {
            Duck mallard = new MallardDuck();
            mallard.display();
            mallard.performQuack();
            mallard.performFly();
            System.out.println("---x---");
            Duck model = new ModelDuck();
            model.setFlyBehavior(new FlyRocketPowered());
            model.display();
            model.performFly();
        }

        //------------------------------------------------------------------------------------------------------------//

        //------------------------------------------OBSERVER PATTERN--------------------------------------------------//
        /*
            This pattern defines a one-to-many dependency between objects so that when one object changes state, all of
            its dependents are notified and updated automatically.
            This is one of the most heavily used patterns in the JDK, and it is incredibly useful.
         */
        if (observerPattern) {
            // This is not the Java built-in support for observer pattern
            System.out.println("---My own version---");
            WeatherData weatherData = new WeatherData();

            CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
            StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
            ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
            HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

            weatherData.setMeasurements(80, 65, 30.4f);
            System.out.println("---x---");
            weatherData.setMeasurements(82, 70, 29.2f);
            System.out.println("---x---");
            weatherData.setMeasurements(78, 90, 29.2f);

            /*
                This is the Java built-in support for observer pattern
                Java built-in version violates the OO design principle of programming to an interface, not implementations.
                Observable is a java class and not an interface. It limits usefulness and reuse.
                Also, it violates the principle of favoring composition over inheritance. We have to subclass Observable
                in order to use setChanged() method or even create an instance of this class and composite with our own
                objects.
             */
            System.out.println("---Java built-in version---");
            WeatherDataJavaBuiltIn weatherDataJavaBuiltIn = new WeatherDataJavaBuiltIn();

            CurrentConditionsDisplayJavaBuiltIn currentConditionsDisplayJavaBuiltIn =
                    new CurrentConditionsDisplayJavaBuiltIn(weatherDataJavaBuiltIn);
            weatherDataJavaBuiltIn.setMeasurements(80, 65, 30.4f);
        }

        //------------------------------------------------------------------------------------------------------------//

        //------------------------------------------DECORATOR PATTERN-------------------------------------------------//
        /*
            This pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible
            alternative to subclassing for extending functionality.
         */
        if (decoratorPattern) {
            Beverage beverage = new Espresso();
            System.out.println(beverage.getDescription() + ": $" + beverage.cost());

            Beverage beverage2 = new DarkRoast();
            beverage2 = new Mocha(beverage2);
            beverage2 = new Mocha(beverage2);
            beverage2 = new Whip(beverage2);
            System.out.println(beverage2.getDescription() + ": $" + beverage2.cost());

            Beverage beverage3 = new HouseBlend();
            beverage3 = new Soy(beverage3);
            beverage3 = new Mocha(beverage3);
            beverage3 = new Whip(beverage3);
            System.out.println(beverage3.getDescription() + ": $" + beverage3.cost());
        }

        //------------------------------------------------------------------------------------------------------------//

        //------------------------------------------FACTORY METHOD PATTERN--------------------------------------------//
        /*
            This pattern defines an interface for creating an object, but lets subclasses decide which class to
            instantiate. Factory Method lets a class defer instantiation to subclasses.
         */
        if (factoryMethodPattern) {
            PizzaStore nyStore = new NYPizzaStore();
            PizzaStore chicagoStore = new ChicagoPizzaStore();

            Pizza pizza = nyStore.orderPizza("cheese");
            System.out.println("Alex ordered a " + pizza.getName() + "\n");

            pizza = chicagoStore.orderPizza("cheese");
            System.out.println("Brittain ordered a " + pizza.getName() + "\n");
        }

        //------------------------------------------------------------------------------------------------------------//

        //------------------------------------------ABSTRACT FACTORY PATTERN------------------------------------------//
        /*
            This pattern provides an interface for creating families of related or dependent objects without specifying
            their concrete classes.
         */
        if (abstractFactoryPattern) {
            abstractfactorypattern.creator.PizzaStore nyStore = new abstractfactorypattern.creator.NYPizzaStore();

            abstractfactorypattern.product.Pizza pizza = nyStore.orderPizza("cheese");
            System.out.println("Alex ordered a " + pizza.getName() + "\n");

            pizza = nyStore.orderPizza("clam");
            System.out.println("Alex ordered a " + pizza.getName() + "\n");
        }

        //------------------------------------------------------------------------------------------------------------//

        //----------------------------------------------SINGLETON PATTERN---------------------------------------------//
        /*
            This pattern ensures a class has only one instance, and provides a global point of access to it.
         */
        if (singletonPattern) {
            ChocolateBoiler chocolateBoilerOne = ChocolateBoiler.getInstance();

            chocolateBoilerOne.fill();
            chocolateBoilerOne.boil();
            chocolateBoilerOne.drain();

            System.out.println();

            ChocolateBoiler chocolateBoilerTwo = ChocolateBoiler.getInstance();

            chocolateBoilerTwo.fill();
            chocolateBoilerTwo.boil();
            chocolateBoilerTwo.drain();
        }

        //------------------------------------------------------------------------------------------------------------//

        //-----------------------------------------------ADAPTER PATTERN----------------------------------------------//
        /*
            This pattern converts the interface of a class into another interface the client expects. Adapter lets
            classes work together that couldn't otherwise because of incompatibles interfaces.
         */
        if (adapterPattern) {
            adapterpattern.target.MallardDuck duck = new adapterpattern.target.MallardDuck();

            WildTurkey turkey = new WildTurkey();
            adapterpattern.target.Duck turkeyAdapter = new TurkeyAdapter(turkey);

            System.out.println("The turkey says...");
            turkey.gobble();
            turkey.fly();

            System.out.println("\nThe Duck says...");
            testDuck(duck);

            System.out.println("\nThe TurkeyAdapter says...");
            testDuck(turkeyAdapter);
        }

        //------------------------------------------------------------------------------------------------------------//

        //------------------------------------------------FACADE PATTERN----------------------------------------------//
        /*
            This pattern provides a unified interface to a set of interfaces in a subsystem. Facade defines a
            higher-level interface that makes the subsystem easier to use.
         */
        if (facadePattern) {
            Amplifier amp = new Amplifier("Top-O-Line Amplifier");
            Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
            DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
            CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
            Projector projector = new Projector("Top-O-Line Projector", dvd);
            TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
            Screen screen = new Screen("Theater Screen");
            PopcornPopper popper = new PopcornPopper("Popcorn Popper");

            HomeTheaterFacade homeTheater =
                    new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);

            homeTheater.watchMovie("Raiders of the Lost Ark");
            homeTheater.endMovie();
        }

        //------------------------------------------------------------------------------------------------------------//

        //------------------------------------------TEMPLATE METHOD PATTERN-------------------------------------------//
        /*
            This pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template
            Method lets subclasses redefine certain steps of an algorithm without changing the algorithms structure.
            In the Java API, there are many examples of this patter: Comparable interface that allows us to define a
            method -compareTo()- that compares two objects and returns whether one is less than, greater than, or equal
            to the other. The method sort() from static class Arrays, uses this as the basis of its comparison of
            objects in an array.
         */
        if (templateMethodPattern) {
            System.out.println("Preparing tea:");
            Tea myTea = new Tea();
            myTea.prepareRecipe();

            System.out.println("\nPreparing coffee:");
            Coffee myCoffee = new Coffee();
            myCoffee.prepareRecipe();

            System.out.println("\nPreparing mate with hook method:\n");
            MateWithHookMethod myMate = new MateWithHookMethod();
            myMate.prepareRecipe();
        }

        //------------------------------------------------------------------------------------------------------------//

        //-----------------------------------------------ITERATOR PATTERN---------------------------------------------//
        /*
            This pattern provides a way to access the elements of an aggregate (a.k.a collection) object sequentially
            without exposing its underlying representation.
         */
        if (iteratorPattern) {
            PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
            DinerMenu dinerMenu = new DinerMenu();
            Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

            waitress.printMenu();
        }

        //------------------------------------------------------------------------------------------------------------//
    }

    private static void testDuck(adapterpattern.target.Duck duck) {
        duck.quack();
        duck.fly();
    }
}
