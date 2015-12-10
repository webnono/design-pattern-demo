package com.webnono.strategy.Model;

import com.webnono.strategy.behavior.FlyBehavior;
import com.webnono.strategy.behavior.impl.FlyDownBehavior;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2015/12/10.
 */
public class StoneDuckTest {

    @Test
    public void testFly(){
        Duck stoneDuck =  new StoneDuck();
        stoneDuck.fly();
        stoneDuck.display();
        stoneDuck.setFlyBehavior(new FlyDownBehavior());
        stoneDuck.fly();
        stoneDuck.display();
    }
}