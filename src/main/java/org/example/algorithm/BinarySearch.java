package org.example.algorithm;

/**
 * 二分查找：
 * 1、前提：有已排序数组A
 * 2、定义左边界L、右边界R、确定搜索范围、循环执行二分查找（3、4两步）
 * 3、获取中间索引 M = (L + R) >>>1;
 * 4、中间索引的值 A[M] 与待搜索的值 T 进行比较
 * ①、 A[M] == T 表示找到，返回中间索引
 * ②、 A[M] > T,中间值右侧的其它元素都大于 T，无需比较，中间索引左边去找， M-1 设置为右边界，重新查找；
 * ③、 A[m] < T, 中间值左侧的其它元素都小于 T，无需比较，中间索引右边去找，M+1 设置为左边界，重新查找；
 * 5、当 L > R 时，表示没有找到，应结束循环；
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arrays = {1, 5, 8, 11, 19, 22, 31, 35, 40, 45, 48, 49, 50};
        int target = 49;
        int idx = binarySearch(arrays, target);
        System.out.println(idx);
    }


    public static int binarySearch(int[] array, int target) {
        if (array.length < 1) {
            return -1;
        }
        int l = 0, r = array.length - 1, m;
        while (l <= r) {
            // 采用移位来解决 l + r 溢出问题
            m = (l + r) >>> 1;
            if (array[m] == target) {
                return m;
            } else if (array[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
