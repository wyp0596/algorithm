package com.ajavac.sort;

import com.ajavac.util.SwapUtils;

/**
 * 选择排序
 * 1. 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 * 2. 然后，再从剩余未排序元素中继续寻找最小（大）元素，
 * 3. 然后放到已排序序列的末尾。
 * 4. 以此类推，直到所有元素均排序完毕。
 * <p>
 * 数据结构	数组
 * 最坏时间复杂度	О(n²)
 * 最优时间复杂度	О(n²)
 * 平均时间复杂度	О(n²)
 * 空间复杂度	    总共О(n),需要辅助空间 O(1)
 * <p>
 * Created by wyp0596 at 2017-08-22
 */
public class SelectionSort {

    public static int[] sort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            int min = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[min] > arrays[j]) {
                    min = j;
                }
            }
            SwapUtils.swap(arrays, min, i);
        }
        return arrays;
    }

}
