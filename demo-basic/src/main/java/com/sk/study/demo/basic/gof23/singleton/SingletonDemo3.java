package com.sk.study.demo.basic.gof23.singleton;

/**
 * 双重检测锁单例
 * @author sk
 * create on  2020/7/4:19:19
 */
public class SingletonDemo3 {
    /**
     * 类初始化时不加载这个对象
     */
    private static SingletonDemo3 instance;

    private SingletonDemo3() {
    }

    /**
     * @return instance
     */
    public static SingletonDemo3 getInstance(){
        if (instance == null) {
            SingletonDemo3 sc;
            synchronized (SingletonDemo3.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (SingletonDemo3.class) {
                        if (sc == null) {
                            sc = new SingletonDemo3();
                        }
                    }
                    instance =sc;
                }
            }
        }
        return instance;
    }
}
