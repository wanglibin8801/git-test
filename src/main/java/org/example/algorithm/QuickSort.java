package org.example.algorithm;

/**
 * 排序算法-参考地址：https://blog.csdn.net/u011714378/article/details/118669996
 *
 * 快速排序思想：
 *   1、每一轮排序选择一个基准点（pivot）进行分区
 *      a、让小于基准点的元素进入一个分区，大于基准点的元素进入另一个分区
 *      b、当分区完成时，基准点元素的位置就是其最终位置
 *  2、在子分区重复以上过程，直至子分区元素个数少于等于1，这体现的是分而治之的思想（divide-and-comquer）
 * <p>
 *
 * 快速排序-实现方式：
 *   1、单边循环排序（lomuto洛穆托分区方案）
 *      a、选择最右元素作为基准点元素
 *      b、j指针负责找到比基准点小的元素，一旦找到则与i进行交换
 *      c、i指针维护小于基准点元素的边界，也是每次交换的目标索引
 *      d、最后基准点与i交换，i即为分区位置。
 *  2、双边循环快排（并不完全等价于hoare霍尔分区方案）
 *      a、选择最左元素作为基准点元素；
 *      b、j指针负责从右向左找比基准点小的元素，i指针负责从左向右找比基准点大的元素，一旦找到二者交换，直至i,j交换
 *      c、最后基准点与i（此时i与j相等）交换，i即分区位置。
 *
 *  快速排序-特点：
 *      1、平均时间复杂度
 *      2、数据量较大时，优势非常明细
 *      3、属于不稳定排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {5, 3, 7, 2, 9, 8, 1, 4};
        quickSort(array, 0, array.length - 1);
    }

    /**
     * 单边快速排序
     *
     * @param array
     */
    public static void quickSort(int[] array, int low, int high) {
        // 结束递归
        if (low >= high) {
            return;
        }
        // 基准点索引值
        int partition = monolateralaPartition(array, low, high);
        // 左边分区的范围确认
        quickSort(array, low, partition - 1);
        // 右边分区的范围确认
        quickSort(array, partition + 1, high);

    }


    /**
     * @param array
     * @param low
     * @param high
     * @return 基准点元素所在的正确索引，用它可以确定下一轮分区的边界
     */
    public static int monolateralaPartition(int[] array, int low, int high) {
        // 基准点元素
        int pv = array[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (array[j] < pv) {
                if (i != j) {
                    swap(array, i, j);
                }
                i++;
            }
        }
        if (i != high) {
            swap(array, high, i);
        }
        return i;
    }


    /**
     * 双边循环快排几个要点:
     *    1、基准点在左边，并且要先j查找，后i查找
     *    2、while(i < j && array[j] > pv) j--;
     *    3、while(i < j && array[i] <= pv) i++;
     *
     * @param array
     * @param low
     * @param high
     * @return
     */
    public static int bilateralPartition(int[] array, int low, int high) {
        int pv = array[low];
        int i = low;
        int j = high;
        while (i < j){
            // j 从右向左,找小的
            while (i < j && array[j] > pv){
                j--;
            }
            // i 从左到右,找大的
            while (i < j && array[i] <= pv){
                i++;
            }
            swap(array, i, j);
        }
        swap(array, low, j);
        return j;

    }

    /**
     * 交换位置
     *
     * @param array    数组
     * @param target
     * @param original
     */
    private static void swap(int[] array, int target, int original) {
        int temp = array[target];
        array[target] = array[original];
        array[original] = temp;
    }
}
