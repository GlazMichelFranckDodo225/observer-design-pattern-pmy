package com.dgmf.observable;

import com.dgmf.observer.Observer;

public interface Observable {
    // To Add Observer
    void subscribe(Observer observer);
    // To Remove Observer
    void unsubscribe(Observer observer);
    // To Notify Observers
    void notifyObservers();
}
