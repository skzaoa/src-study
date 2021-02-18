package com.sk.study.demo.basic.gof23.singleton;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;

/**
 * @author sk
 * create on  2021/2/18:23:20
 */
@Slf4j
public class client {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i=0; i<threadNum; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0; i<1000000; i++) {
                        Object o = SingletonDemo1.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }

        //线程阻塞，直到计数器变为0，才会继续往下执行
        countDownLatch.await();
        long end = System.currentTimeMillis();
        log.info("总耗时："+ (end-start)+ "ms");
    }
}
