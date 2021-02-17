package com.sk.study.demo.basic.gof23.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sk
 * create on  2021/2/17:18:45
 */
@Slf4j
public class SingletonDemo3Test {

    @Test
    public void getInstance() {
        SingletonDemo3 s1 = SingletonDemo3.getInstance();
        SingletonDemo3 s2 = SingletonDemo3.getInstance();
        log.info(s1.toString());
        log.info(s2.toString());
    }
}