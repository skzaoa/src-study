package com.sk.study.demo.basic.gof23.factory.impl;

import com.sk.study.demo.basic.gof23.factory.api.Seat;
import lombok.extern.slf4j.Slf4j;

/**
 * @author sk
 * create on  2020/7/4:22:52
 */
@Slf4j
public class SeatLowImpl implements Seat {
    @Override
    public void massage() {
        log.info("low Seat no massage");
    }
}
