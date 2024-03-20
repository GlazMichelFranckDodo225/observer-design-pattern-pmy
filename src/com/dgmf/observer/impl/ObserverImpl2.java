package com.dgmf.observer.impl;

import com.dgmf.observable.Observable;
import com.dgmf.observable.impl.ObservableImpl;
import com.dgmf.observer.Observer;

public class ObserverImpl2 implements Observer {
    private int counter;
    @Override
    public void update(Observable observable) {
        // Pop
        int state = ((ObservableImpl) observable).getState();

        if(((state % 2) == 0)) ++counter;

        System.out.println("========= ObserverImpl2 =========");
        System.out.println("New Update: State = " + state);
        System.out.println("Calculation Result = " +
                (((state % 2) == 0) ? "Even" : "Odd"));
        System.out.println("The counter is at : " + counter);
        System.out.println("========= ObserverImpl1 =========");
    }
}
