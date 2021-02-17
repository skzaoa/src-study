package com.sk.study.demo.basic.gof23.singleton;

import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 懒汉式单例
 * @author sk
 * create on  2020/7/4:19:19
 */
public class SingletonDemo2Reflection implements Serializable {
    private static final long serialVersionUID = 1498183734790634825L;
    /**
     * 类初始化时不加载这个对象
     */
    private static SingletonDemo2Reflection instance;

    private SingletonDemo2Reflection() {
        /**
         * 避免反射条用私有构造器突破单例
         */
        if (instance != null) {

             throw new RuntimeException();
        }
    }

    /**
     * @return instance
     */
    public static synchronized SingletonDemo2Reflection getInstance(){
        if (instance == null) {
            instance =  new SingletonDemo2Reflection();
        }
        return instance;
    }

    /**
     * 反序列化时，如果定义了 readResolve() 则直接返回此方法的指定对象。不需再单独创建对象
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
