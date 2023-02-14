package org.example.algorithm;

import org.example.util.SortUtils;

import java.util.Arrays;

/**
 * 选择排序：
 *      1、将数组分为两个子集，排序的和未排序的，每一轮从末排序的子集中选出最小的元素，放入排序子集
 *      2、重复以上步骤，直到整个数组有序
 * 优化方式：
 *      1、为了减少交换次数，每一轮可以先找到最小的索引，在每轮最后再交换元素
 *
 * 与冒泡排序比较：
 *      1、二者平均时间复杂度都是O(n^2)
 *      2、选择排序一般要快于冒泡，因为其交换次数少
 *      3、但如果集合有序度高，冒泡由于选择
 *      4、冒泡属于稳定排序算法，而选择属于不稳定排序
 *
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {5, 3, 7, 2, 1, 9, 8, 4};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // i 代表每轮选择最小元素要交换到的目标索引
            // 代表最小元素的索引
            int s = i;
            for (int j = s + 1; j < array.length; j++) {
                if (array[s] > array[j]) {
                    s = j;
                }
            }
            if (s != i) {
                SortUtils.swap(array, s, i);
            }
        }
    }
}
