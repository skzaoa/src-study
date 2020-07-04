package com.sk.study.demo.basic.gof23.factory.factory;

import com.sk.study.demo.basic.gof23.factory.api.Car;
import com.sk.study.demo.basic.gof23.factory.impl.CarBYDImpl;
import com.sk.study.demo.basic.gof23.factory.impl.CarQQImpl;

/**
 * @author sk
 * create on  2020/7/4:22:03
 */
public class CarSimpleFactory {
    public static Car createCar(String type) {
        if ("QQ".equals(type)) {
            return new CarQQImpl();
        } else if ("BYD".equals(type)) {
            return new CarBYDImpl();
        } else {
            return null;
        }
    }

    public static Car createCarQQ() {
        return new CarQQImpl();
    }
    public static Car createCarBYD() {
        return new CarQQImpl();
    }
}
