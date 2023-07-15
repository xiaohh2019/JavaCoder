package leetcode.tool.time;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 灵缘一梦
 */
public class QuickSort {

    public static void main(String[] args) {
        int a[] = {6,5,4,3,2,1};
        qSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
    }

    public static void qSort(int data[], int left, int right){
        int base = data[left];  // 注意不是data[0]

        int ll = left;
        int rr = right;

        while(ll < rr){
            while (ll < rr && data[rr] >= base){
                rr--;
            }
            if(ll < rr){
                int temp = data[rr];
                data[rr] = data[ll];
                data[ll] = temp;
                ll ++;
            }
            while(ll <rr && data[ll] <= base ){
                ll ++;
            }
            if(ll < rr){
                int temp = data[rr];
                data[rr] = data[ll];
                data[ll] = temp;
                rr --;
            }
        }
        if(left < ll ){
            qSort(data,left,ll-1);
        }
        if(ll < right ) {
            qSort(data, ll + 1, right);
        }


    }
}
