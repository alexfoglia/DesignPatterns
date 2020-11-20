package observerpattern.javabuiltinsupport;

import com.sun.istack.internal.NotNull;;

import java.util.Observable;

/**
 * Created by Alex on 2/14/2016.
 */
public class WeatherDataJavaBuiltIn extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataJavaBuiltIn() {}

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void measurementChanged() {
        setChanged();
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
