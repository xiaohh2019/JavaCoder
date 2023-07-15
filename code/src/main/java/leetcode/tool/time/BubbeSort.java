package leetcode.tool.time;

import java.util.Arrays;

/**
 * @author 灵缘一梦
 */
public class BubbeSort {

    public static void main(String[] args) {
        int a[] = {6,5,4,3,2,1};
        int n = a.length;

        for (int i = 0; i < n-1; i++) {
            boolean flag = false;
            for (int j = 0; j < n-1-i; j++) {
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) {
                break;
            }

        }
        System.out.println(Arrays.toString(a));


    }
}
