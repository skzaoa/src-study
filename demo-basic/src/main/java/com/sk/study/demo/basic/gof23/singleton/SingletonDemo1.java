package com.sk.study.demo.basic.gof23.singleton;

/**
 * 饿汉式单例
 * @author sk
 * create on  2020/7/4:19:19
 */
public class SingletonDemo1 {
    /**
     * 类初始化时立即加载这个对象
     */
    private static SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1() {
    }

    public static SingletonDemo1 getInstance(){
        return instance;
    }
}
