package com.sk.study.demo.basic.gof23.singleton;

/**
 * 静态内部类单例
 * @author sk
 * create on  2020/7/4:19:19
 */
public class SingletonDemo4 {
    /**
     * 类初始化时立即加载这个对象
     */
    private static class SingletonDemo4ClassInstence {
        private  static final SingletonDemo4 INSTENCE = new SingletonDemo4();
    }
    private SingletonDemo4() {
    }

    public static SingletonDemo4 getInstance(){
        return SingletonDemo4ClassInstence.INSTENCE;
    }
}
