package com.sk.study.demo.basic.study.bubblesort;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Comparator;

/**
 * @author sk
 * create on  2020/7/4:17:36
 */
public interface BubbleSort {

    public <T extends Comparable<T>> void sort(T[] arr);

    public <T> void sort(T[] arr, Comparator<T> comparable);
}

@Slf4j
class BubbleSortImpl implements BubbleSort{

    @Override
    public <T extends Comparable<T>> void sort(T[] arr) {
        boolean swapped = true;
        for (int i=0, len=arr.length; i<len && swapped; i++) {
            swapped = false;
            for (int j = 0; j<len-1-i; j++) {
                log.info(String.valueOf(arr[j]) +"  "+ String.valueOf(arr[j+1]));
                if (0 > arr[j].compareTo(arr[j+1])) {
                    T tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swapped = true;
                }
            }
            log.info(String.valueOf(swapped));
        }
    }

    @Override
    public <T> void sort(T[] arr, Comparator<T> comparable) {
        boolean swapped = true;
        for (int i=0, len=arr.length; i<len && swapped; i++) {
            swapped = false;
            for (int j = 0; j<len-1; j++) {
                if (0 < (comparable.compare(arr[j], arr[j+1]))) {
                    T tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swapped = true;
                }
            }
        }
    }
}


class Student implements Comparable{

    private Integer id;
    private Integer score;

    public Student(Integer id, Integer score) {
        this.id = id;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.score-((Student)o).score;
    }
}