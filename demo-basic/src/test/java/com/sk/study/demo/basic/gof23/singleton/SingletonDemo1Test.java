package com.sk.study.demo.basic.gof23.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sk
 * create on  2021/2/17:16:56
 */
@Slf4j
public class SingletonDemo1Test {

    @Test
    public void getInstance() {
        SingletonDemo1 s1 = SingletonDemo1.getInstance();
        SingletonDemo1 s2 = SingletonDemo1.getInstance();
        log.info(s1.toString());
        log.info(s2.toString());
   }
}