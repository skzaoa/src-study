package com.sk.study.demo.basic.gof23.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 枚举单例
 * @author sk
 * create on  2020/7/4:19:19
 */
@Slf4j
public enum  SingletonDemo5 {
    /**
     * 类初始化时立即加载这个对象
     */
    INSTENCE;

    public void singletonDemoOperation() {
        log.info("11");
    }
}
