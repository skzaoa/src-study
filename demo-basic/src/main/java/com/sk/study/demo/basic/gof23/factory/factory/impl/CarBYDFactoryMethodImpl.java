package com.sk.study.demo.basic.gof23.factory.factory.impl;

import com.sk.study.demo.basic.gof23.factory.api.Car;
import com.sk.study.demo.basic.gof23.factory.factory.api.CarFactoryMethod;
import com.sk.study.demo.basic.gof23.factory.impl.CarBYDImpl;

/**
 * @author sk
 * create on  2020/7/4:22:28
 */
public class CarBYDFactoryMethodImpl implements CarFactoryMethod {
    @Override
    public Car createCar() {
        return new CarBYDImpl();
    }
}
