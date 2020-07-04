package com.sk.study.demo.basic.gof23.factory.test;

import com.sk.study.demo.basic.gof23.factory.api.Car;
import com.sk.study.demo.basic.gof23.factory.factory.impl.CarBYDFactoryMethodImpl;
import com.sk.study.demo.basic.gof23.factory.factory.impl.CarQQFactoryMethodImpl;
import org.junit.Test;

/**
 * @author sk
 * create on  2020/7/4:22:07
 */
public class Test03FactoryMethd {
    @Test
    public void test03FactoryMethd() {
        Car c1 = new CarQQFactoryMethodImpl().createCar();
        Car c2 = new CarBYDFactoryMethodImpl().createCar();

        c1.run();
        c2.run();
    }
}
