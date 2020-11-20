package observerpattern.observer;

import com.sun.istack.internal.NotNull;;

/**
 * Created by Alex on 2/14/2016.
 */
public interface Observer {

    void update(@NonNull final float temp, @NonNull final float humidity, @NonNull final float pressure);
}
