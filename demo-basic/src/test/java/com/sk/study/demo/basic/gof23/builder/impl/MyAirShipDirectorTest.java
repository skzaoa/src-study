package com.sk.study.demo.basic.gof23.builder.impl;

import com.sk.study.demo.basic.gof23.builder.api.AirShip;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sk
 * create on  2021/2/20:0:14
 */
public class MyAirShipDirectorTest {

    @Test
    public void directorAirShip() {
        MyAirShipDirector myAirShipDirector = new MyAirShipDirector(new MyAirShipBuilder());

        AirShip airShip = myAirShipDirector.directorAirShip();
    }
}