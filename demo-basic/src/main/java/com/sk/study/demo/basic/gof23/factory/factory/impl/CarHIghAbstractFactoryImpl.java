package com.sk.study.demo.basic.gof23.factory.factory.impl;

import com.sk.study.demo.basic.gof23.factory.api.Engine;
import com.sk.study.demo.basic.gof23.factory.api.Seat;
import com.sk.study.demo.basic.gof23.factory.api.Tyre;
import com.sk.study.demo.basic.gof23.factory.factory.api.CarAbstractFactory;
import com.sk.study.demo.basic.gof23.factory.impl.EngineHighImpl;
import com.sk.study.demo.basic.gof23.factory.impl.SeatHighImpl;
import com.sk.study.demo.basic.gof23.factory.impl.TyreHighImpl;
import lombok.extern.slf4j.Slf4j;

/**
 * @author sk
 * create on  2020/7/4:23:01
 */
@Slf4j
public class CarHIghAbstractFactoryImpl implements CarAbstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineHighImpl();
    }

    @Override
    public Seat createSeat() {
        return new SeatHighImpl();
    }

    @Override
    public Tyre createTyre() {
        return new TyreHighImpl();
    }
}
