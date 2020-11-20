package observerpattern.subject;

import com.sun.istack.internal.NotNull;;
import observerpattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 2/14/2016.
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData () {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    // To simulate setting the values for temperature, humidity, and pressure
    public void setMeasurements(@NonNull final float temperature, @NonNull final float humidity,
                                @NonNull final float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

}
