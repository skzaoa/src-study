package com.sk.study.demo.basic.gof23.factory.factory.impl;

import com.sk.study.demo.basic.gof23.factory.api.Engine;
import com.sk.study.demo.basic.gof23.factory.api.Seat;
import com.sk.study.demo.basic.gof23.factory.api.Tyre;
import com.sk.study.demo.basic.gof23.factory.factory.api.CarAbstractFactory;
import com.sk.study.demo.basic.gof23.factory.impl.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @author sk
 * create on  2020/7/4:23:01
 */
@Slf4j
public class CarLowAbstractFactoryImpl implements CarAbstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineLowImpl();
    }

    @Override
    public Seat createSeat() {
        return new SeatLowImpl();
    }

    @Override
    public Tyre createTyre() {
        return new TyreLowImpl();
    }
}
