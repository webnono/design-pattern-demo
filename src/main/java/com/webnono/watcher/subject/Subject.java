package com.webnono.watcher.subject;

import com.webnono.watcher.observer.Observer;

/**
 * Created by Administrator on 2015/12/11.
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
