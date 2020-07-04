package com.sk.study.demo.basic.study.bubblesort;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author sk
 * create on  2020/7/5:0:01
 */
@Slf4j
public class BubbleSortTest {

    @Test
    public void bubbleSortTest() {
        BubbleSort sort = new BubbleSortImpl();
        Student[] iArr = {new Student(1, 60)
                , new Student(2, 65)
                , new Student(3, 70)
                , new Student(4, 90)};
        sort.sort(iArr);

        for (Student s : iArr) {
            log.info(s.toString());
        }
    }

}
