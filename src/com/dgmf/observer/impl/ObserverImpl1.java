package com.dgmf.observer.impl;

import com.dgmf.observable.Observable;
import com.dgmf.observable.impl.ObservableImpl;
import com.dgmf.observer.Observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        // Pop
        int state = ((ObservableImpl) observable).getState();

        double result = Math.pow(state, 2) + 9;

        System.out.println("========= ObserverImpl1 =========");
        System.out.println("New Update: State = " + state);
        System.out.println("Calculation Result = " + result);
        System.out.println("========= ObserverImpl1 =========");
    }
}
