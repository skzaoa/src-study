package com.sk.study.demo.basic.gof23.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 枚举单例
 * @author sk
 * create on  2021/2/17:18:58
 */
@Slf4j
public class SingletonDemo5Test {

    @Test
    public void getInstance() {


        log.info(SingletonDemo5.INSTENCE.toString());
        log.info(SingletonDemo5.INSTENCE.toString());
    }
}