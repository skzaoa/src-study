package com.sk.study.demo.basic.gof23.factory.test;

import com.sk.study.demo.basic.gof23.factory.api.Engine;
import com.sk.study.demo.basic.gof23.factory.factory.api.CarAbstractFactory;
import com.sk.study.demo.basic.gof23.factory.factory.impl.CarHIghAbstractFactoryImpl;
import org.junit.Test;

/**
 * @author sk
 * create on  2020/7/4:22:07
 */
public class Test04AbstractFactory {
    @Test
    public void test04AbstractFactory() {
        CarAbstractFactory factory = new CarHIghAbstractFactoryImpl();
        Engine e = factory.createEngine();
        e.start();
        e.run();

    }
}
