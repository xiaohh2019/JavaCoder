package leetcode.tool.time;

import java.util.Arrays;

/**
 * 希尔排序
 * @author 灵缘一梦
 */
public class ShellSort {

    public static void main(String[] args) {
        Integer[] arr = SortTestHelper.generateRandomArray(20, 0, 10);
        int n = arr.length;

        for (int add = n/2; add >= 1 ; add /= 2) {
            for (int i = add; i < n; i++) {
                int data = arr[i];
                int j = i - add;
                for ( ; j >=0 ; j-=add) {
                    if(arr[j] > data){
                        arr[j+add] = arr[j];

                    }else{
                        break;
                    }

                }
                arr[j+add] = data;
            }

        }

        System.out.println(Arrays.toString(arr));


    }


}
