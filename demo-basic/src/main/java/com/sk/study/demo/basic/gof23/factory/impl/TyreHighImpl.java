package com.sk.study.demo.basic.gof23.factory.impl;

import com.sk.study.demo.basic.gof23.factory.api.Tyre;
import lombok.extern.slf4j.Slf4j;

/**
 * @author sk
 * create on  2020/7/4:22:55
 */
@Slf4j
public class TyreHighImpl implements Tyre {
    @Override
    public void revolve() {
        log.info("high Tyre");
    }
}
