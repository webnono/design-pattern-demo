package com.webnono.watcher.subject;

import com.webnono.watcher.observer.BATConditions;
import com.webnono.watcher.observer.CurrentConditions;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2015/12/11.
 */
public class WeatherDataTest {

    @Test
    public void testWheatherChange(){
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        BATConditions batConditions = new BATConditions();
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(batConditions);
        weatherData.setTemprature(99);
        weatherData.dataChange();
        weatherData.removeObserver(currentConditions);//测试移除其中一个
        weatherData.setTemprature(33);
        weatherData.dataChange();

    }
}