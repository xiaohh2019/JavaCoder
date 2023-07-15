package leetcode.base;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 灵缘一梦
 *
 * 冒泡排序
 */
public class BubbleSort {


    public static void main(String[] args) {
        int[] arr = new int[]{3,6,1,7,3,2,8,7};
        bubbleSort(arr);
        bubbleSort2(arr);
    }

    private static void bubbleSort(int[] arr) {
        long l = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println(System.currentTimeMillis()-l);
    }
    private static void bubbleSort2(int[] arr) {
        long l = System.currentTimeMillis();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {        // 相邻元素两两对比
                    int temp = arr[j+1];        // 元素交换
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("arr2 = " + Arrays.toString(arr));
        System.out.println(System.currentTimeMillis()-l);
    }


}
