package com.sk.study.demo.basic.gof23.singleton;

/**
 * 懒汉式单例
 * @author sk
 * create on  2020/7/4:19:19
 */
public class SingletonDemo2 {
    /**
     * 类初始化时不加载这个对象
     */
    private static SingletonDemo2 instance;

    private SingletonDemo2() {
    }

    /**
     * @return instance
     */
    public static synchronized SingletonDemo2 getInstance(){
        if (instance == null) {
            instance =  new SingletonDemo2();
        }
        return instance;
    }
}
