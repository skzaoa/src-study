package com.sk.study.demo.basic.gof23.factory.impl;

import com.sk.study.demo.basic.gof23.factory.api.Car;
import lombok.extern.slf4j.Slf4j;

/**
 * @author sk
 * create on  2020/7/4:21:47
 */
@Slf4j
public class CarBYDImpl implements Car {
    @Override
    public void run() {
        log.info("Byd在跑");
    }
}
