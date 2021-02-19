package com.sk.study.demo.basic.gof23.builder.impl;

import com.sk.study.demo.basic.gof23.builder.api.*;

/**
 * @author sk
 * create on  2021/2/20:0:04
 */
public class MyAirShipDirector implements AirShipDirector {
    private AirShipBuilder airShipBuilder;

    public MyAirShipDirector(AirShipBuilder airShipBuilder) {
        this.airShipBuilder = airShipBuilder;
    }

    @Override
    public AirShip directorAirShip() {
        Engine engine = airShipBuilder.builderEngine();
        EscapeTower escapeTower = airShipBuilder.builderEscapeTower();
        OrbitalModule orbitalModule = airShipBuilder.builderOrbitalModule();

        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModule(orbitalModule);
        return airShip;
    }
}
