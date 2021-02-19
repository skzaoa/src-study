package com.sk.study.demo.basic.gof23.builder.api;

/**
 * @author sk
 * create on  2021/2/19:23:41
 */
public class AirShip {
    //轨道舱
    private OrbitalModule orbitalModule;
    //发动机
    private Engine engine;
    //逃逸塔
    private EscapeTower escapeTower;

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}
