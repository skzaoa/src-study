package com.sk.study.demo.basic.gof23.builder.api;

/**
 * @author sk
 * create on  2021/2/19:23:46
 */
public class OrbitalModule {
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
