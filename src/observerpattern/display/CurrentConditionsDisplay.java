package observerpattern.display;

import com.sun.istack.internal.NotNull;;
import observerpattern.observer.Observer;
import observerpattern.subject.Subject;

/**
 * Created by Alex on 2/14/2016.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(@NonNull final float temperature, @NonNull final float humidity, @NonNull final float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
