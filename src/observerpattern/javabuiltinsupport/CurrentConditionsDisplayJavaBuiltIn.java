package observerpattern.javabuiltinsupport;

import com.sun.istack.internal.NotNull;
import observerpattern.display.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Alex on 2/14/2016.
 */
public class CurrentConditionsDisplayJavaBuiltIn implements Observer, DisplayElement {

    private Observable weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplayJavaBuiltIn(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(@NotNull final Observable observable, @NonNull final Object arg) {
        if (observable instanceof WeatherDataJavaBuiltIn) {
            WeatherDataJavaBuiltIn weatherDataJavaBuiltIn = (WeatherDataJavaBuiltIn) observable;
            this.temperature = weatherDataJavaBuiltIn.getTemperature();
            this.humidity = weatherDataJavaBuiltIn.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
