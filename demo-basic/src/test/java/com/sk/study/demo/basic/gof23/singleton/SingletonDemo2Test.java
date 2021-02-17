package com.sk.study.demo.basic.gof23.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sk
 * create on  2021/2/17:17:22
 *
 */
@Slf4j
public class SingletonDemo2Test {

    @Test
    public void getInstance() {
        SingletonDemo2 s1 = SingletonDemo2.getInstance();
        SingletonDemo2 s2 = SingletonDemo2.getInstance();
        log.info(s1.toString());
        log.info(s2.toString());
    }
}