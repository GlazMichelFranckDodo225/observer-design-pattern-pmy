package com.dgmf.observable;

import com.dgmf.observer.Observer;

public interface Observable {
    // To Add an Observer
    void subscribe(Observer observer);
    // To Remove an Observer
    void unsubscribe(Observer observer);
    // To Notify Observers
    void notifyObservers();
}
