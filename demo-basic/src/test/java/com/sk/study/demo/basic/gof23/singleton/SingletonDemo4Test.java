package com.sk.study.demo.basic.gof23.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sk
 * create on  2021/2/17:18:54
 */
@Slf4j
public class SingletonDemo4Test {

    @Test
    public void getInstance() {
        SingletonDemo4 s1 = SingletonDemo4.getInstance();
        SingletonDemo4 s2 = SingletonDemo4.getInstance();
        log.info(s1.toString());
        log.info(s2.toString());
    }
}