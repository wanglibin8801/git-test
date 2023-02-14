package org.example.algorithm;

import org.example.util.SortUtils;

import java.util.Arrays;

/**
 * 冒泡排序：
 * 1、依次比较数组中相邻两个元素大小，若 a[i] > a[i+1],则交换两个元素，两两都比较
 * 一遍称为一轮冒泡，结果是让最大的元素放置最后；
 * 2、重复上步骤，直到整个数组有序。
 * <p>
 * 优化方式：每轮冒泡时，最后一次交换索引可以作为下一轮冒泡的比较次数，如果这个值为零，
 * 表示整个数组有序，直接退出外层循环即可；
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {5, 9, 7, 4, 1, 3, 2, 8};
        bubble(array);
    }

    /**
     * 优化方式：每轮冒泡时，最后一次交换索引可以作为下一轮冒泡的比较次数，如果这个值为零，
     * 表示整个数组有序，直接退出外层循环即可；
     *
     * @param array
     */
    public static void optimizeBubble(int[] array) {
        int n = array.length - 1;
        while (true) {
            // last 表示最后一次交换索引位置
            int last = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > array[i + 1]) {
                    SortUtils.swap(array, i, i + 1);
                    last = i;
                }
            }
            n = last;
            if (n == 0) {
                break;
            }
        }
    }

    public static void bubble(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            boolean swapped = Boolean.FALSE;
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    SortUtils.swap(array, i, i + 1);
                    swapped = Boolean.TRUE;
                }
            }
            System.out.println("第" + j + "轮冒泡" + Arrays.toString(array));
            if (!swapped) {
                break;
            }
        }
    }

}
