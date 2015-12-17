package com.webnono.template;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2015/12/17.
 */
public class CoffeeTest {

    @Test
    public void testCoffee(){
        DrinkTemplate coffee = new Coffee();
        coffee.doWithDrink();
        DrinkTemplate tea = new Tea();
        tea.doWithDrink();
    }
}