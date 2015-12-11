package com.webnono.watcher.subject;

import com.webnono.watcher.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/12/11.
 */
public class WeatherData implements Subject {
    private int temprature;
    private List<Observer> observers = new ArrayList<Observer>();
    public void dataChange(){
        notifyObserver();
    }

    public int getTemprature() {
        return temprature;
    }

    public void setTemprature(int temprature){
        this.temprature = temprature;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer obeserver:observers){
            obeserver.update(getTemprature());
        }
    }
}
