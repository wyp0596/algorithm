package com.ajavac.sort.impl;

import com.ajavac.sort.Sort;

import java.util.List;

/**
 * 冒泡排序
 * Created by wyp0596 on 22/03/2017.
 */
public class BubbleSort implements Sort {

    @Override
    public <T extends Comparable<T>> List<T> sortByAsc(List<T> origin, int begin, int end) {
        for (int i = begin; i < end; i++) {
            for (int j = i + 1; j < end + 1; j++) {
                T temp = origin.get(i);
                T next = origin.get(j);
                if (temp.compareTo(next) > 0) {
                    origin.set(i, next);
                    origin.set(j, temp);
                }
            }
        }
        return origin;
    }

    @Override
    public <T extends Comparable<T>> List<T> sortByDesc(List<T> origin, int begin, int end) {
        for (int i = begin; i < end; i++) {
            for (int j = i + 1; j < end + 1; j++) {
                T temp = origin.get(i);
                T next = origin.get(j);
                if (temp.compareTo(next) < 0) {
                    origin.set(i, next);
                    origin.set(j, temp);
                }
            }
        }
        return origin;
    }
}