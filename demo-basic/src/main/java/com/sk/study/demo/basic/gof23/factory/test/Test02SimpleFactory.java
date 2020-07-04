package com.sk.study.demo.basic.gof23.factory.test;

import com.sk.study.demo.basic.gof23.factory.api.Car;
import com.sk.study.demo.basic.gof23.factory.factory.CarSimpleFactory;
import org.junit.Test;

/**
 * @author sk
 * create on  2020/7/4:22:07
 */
public class Test02SimpleFactory {
    @Test
    public void test02SimpleFactory() {
        Car c1 = CarSimpleFactory.createCar("QQ");
        Car c2 = CarSimpleFactory.createCar("BYD");

        if (c1 != null) {
            c1.run();
        }
        if (c2 != null) {
            c2.run();
        }
    }
}
