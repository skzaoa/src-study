package com.sk.study.demo.basic.gof23.builder.api;

/**
 * @author sk
 * create on  2021/2/19:23:47
 */
public class Engine {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
