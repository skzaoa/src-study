package com.sk.study.demo.basic.gof23.builder.impl;

import com.sk.study.demo.basic.gof23.builder.api.AirShipBuilder;
import com.sk.study.demo.basic.gof23.builder.api.Engine;
import com.sk.study.demo.basic.gof23.builder.api.EscapeTower;
import com.sk.study.demo.basic.gof23.builder.api.OrbitalModule;
import lombok.extern.slf4j.Slf4j;

/**
 * @author sk
 * create on  2021/2/19:23:59
 */
@Slf4j
public class MyAirShipBuilder implements AirShipBuilder {

    @Override
    public Engine builderEngine() {
        log.info("发动机");
        return new Engine("My发动机");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        log.info("轨道舱");
        return new OrbitalModule("My轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        log.info("逃逸塔");
        return new EscapeTower("My逃逸塔");
    }
}
