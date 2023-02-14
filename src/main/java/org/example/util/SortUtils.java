package org.example.util;

public class SortUtils {

    /**
     * 交换位置
     *
     * @param array    数组
     * @param target
     * @param original
     */
    public static void swap(int[] array, int target, int original) {
        int temp = array[target];
        array[target] = array[original];
        array[original] = temp;
    }
}
