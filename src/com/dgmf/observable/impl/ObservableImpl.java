package com.dgmf.observable.impl;

import com.dgmf.observable.Observable;
import com.dgmf.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int state = 10;

    private List<Observer> observers = new ArrayList<>();

    // To Add an Observer
    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    // To Remove an Observer
    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    // To Notify Observers
    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(this);
        }
    }

    public void setState(int state) {
        this.state = state;

        this.notifyObservers();
    }

    public int getState() {
        return state;
    }
}
