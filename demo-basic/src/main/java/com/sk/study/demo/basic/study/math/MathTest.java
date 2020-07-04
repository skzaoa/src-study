package com.sk.study.demo.basic.study.math;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author sk
 * create on  2020/7/3:23:02
 */
@Slf4j
public class MathTest {
    @Test
    public void round() {
        /*实际上是+0.5向下取整
        *
        *
        * */
        log.info(String.valueOf(Math.round(-1.6)));
    }
}
