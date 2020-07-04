package com.sk.study.demo.basic.gof23.factory.test;

import com.sk.study.demo.basic.gof23.factory.api.Car;
import com.sk.study.demo.basic.gof23.factory.impl.CarBYDImpl;
import com.sk.study.demo.basic.gof23.factory.impl.CarQQImpl;
import org.junit.Test;

/**
 * @author sk
 * create on  2020/7/4:22:03
 */
public class Test01NoFactory {

    @Test
    public void test01NoFactory() {
        Car c1 = new CarQQImpl();
        Car c2 = new CarBYDImpl();

        c1.run();
        c2.run();
    }
}
