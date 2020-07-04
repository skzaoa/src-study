package com.sk.study.demo.basic.gof23.factory.factory.api;

import com.sk.study.demo.basic.gof23.factory.api.Engine;
import com.sk.study.demo.basic.gof23.factory.api.Seat;
import com.sk.study.demo.basic.gof23.factory.api.Tyre;

/**
 * @author sk
 * create on  2020/7/4:22:58
 */
public interface CarAbstractFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}
