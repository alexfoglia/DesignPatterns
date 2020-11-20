package observerpattern.subject;

import observerpattern.observer.Observer;

/**
 * Created by Alex on 2/14/2016.
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
