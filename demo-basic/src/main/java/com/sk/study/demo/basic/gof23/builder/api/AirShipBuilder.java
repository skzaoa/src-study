package com.sk.study.demo.basic.gof23.builder.api;

/**
 * @author sk
 * create on  2021/2/19:23:52
 */
public interface AirShipBuilder {
    Engine builderEngine();
    OrbitalModule builderOrbitalModule();
    EscapeTower builderEscapeTower();
}
