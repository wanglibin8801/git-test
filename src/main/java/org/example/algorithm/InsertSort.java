package org.example.algorithm;

import java.util.Arrays;

/**
 * 插入排序：
 * 将末排序的元素一个一个地插入到有序集合中，插入时把所有有序集合从后向前扫一遍，找到合适位置插入。
 * <p>
 * 参考地址：https://blog.csdn.net/hcz666/article/details/126488359
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] array = {9, 3, 7, 2, 5, 8, 1, 4};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertSort(int[] array) {
        // i 代表待插入元素的索引
        for (int i = 1; i < array.length; i++) {
            // 代表插入的元素值
            int temp = array[i];
            // J 代表已排序区域的元素索引
            int j = i - 1;
            while (j >= 0) {
                if (temp < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    // 退出循环，减少比较次数
                    break;
                }
                j--;
            }
            array[j +1] = temp;
        }
    }

    private static void insert(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            int temp = array[i];
            int j = i -1;
            while (j>=0) {
                if (temp < array[j]) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
                j--;
            }
        }
    }
}
