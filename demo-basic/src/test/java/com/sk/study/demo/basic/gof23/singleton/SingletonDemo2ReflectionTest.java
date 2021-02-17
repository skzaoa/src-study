package com.sk.study.demo.basic.gof23.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

/**
 * @author sk
 * create on  2021/2/17:23:12
 */
@Slf4j
public class SingletonDemo2ReflectionTest {

    @Test
    public void getInstance() throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonDemo2Reflection s1 = SingletonDemo2Reflection.getInstance();
        SingletonDemo2Reflection s2 = SingletonDemo2Reflection.getInstance();
        log.info(s1.toString());
        log.info(s2.toString());

        Class<SingletonDemo2Reflection> clazz = (Class<SingletonDemo2Reflection>)Class.forName("com.sk.study.demo.basic.gof23.singleton.SingletonDemo2Reflection");
        Constructor<SingletonDemo2Reflection> c = clazz.getDeclaredConstructor(null);

        c.setAccessible(true);
        SingletonDemo2Reflection s3 = c.newInstance();
        SingletonDemo2Reflection s4 = c.newInstance();
        log.info(s3.toString());
        log.info(s4.toString());
    }

    @Test
    public void serializableTest() {
        SingletonDemo2Reflection s1 = SingletonDemo2Reflection.getInstance();
        SingletonDemo2Reflection s2 = SingletonDemo2Reflection.getInstance();
        log.info(s1.toString());
        log.info(s2.toString());

        try {
            FileOutputStream fos = new FileOutputStream("D:/tmp/a.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("D:/tmp/a.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SingletonDemo2Reflection s3 = (SingletonDemo2Reflection)ois.readObject();
            log.info(s3.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}