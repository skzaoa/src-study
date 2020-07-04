package com.sk.study.demo.basic.gof23.factory.impl;

import com.sk.study.demo.basic.gof23.factory.api.Engine;
import lombok.extern.slf4j.Slf4j;

/**
 * @author sk
 * create on  2020/7/4:22:47
 */
@Slf4j
public class EngineLowImpl implements Engine {
    @Override
    public void run() {
        log.info("low engine run");
    }

    @Override
    public void start() {
        log.info("low engine start");
    }
}
