package com.webnono.decorator;

import com.webnono.decorator.Coffee.CoffeA;
import com.webnono.decorator.decorator.Chocolate;
import com.webnono.decorator.decorator.Milk;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2015/12/15.
 */
public class DrinkTest {

    @Test
    public void testDrink(){
        Drink order = new CoffeA();
        System.out.println(order.cost()+"  "+order.description);

        order = new Milk(order);
        System.out.println(order.cost()+" "+order.getDescription());
        order = new Milk(order);
        order = new Chocolate(order);
        System.out.println(order.cost()+" "+order.getDescription());
    }
}