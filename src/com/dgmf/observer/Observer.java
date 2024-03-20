package com.dgmf.observer;

import com.dgmf.observable.Observable;

public interface Observer {
    void update(Observable observable);
}
