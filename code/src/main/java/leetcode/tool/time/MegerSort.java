package leetcode.tool.time;

import java.util.Arrays;

/**
 * 归并排序
 * @author 灵缘一梦
 */
public class MegerSort {

    public static void main(String[] args) {
        int[] data = {1,2,7,4,8,9,7,4,2,1,4,2,0,4};
        megerSort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));

    }

    private static void megerSort(int[] data, int left, int right) {
        if(left < right){
            int mid = (left + right) /2;
            megerSort(data,left,mid);
            megerSort(data,mid+1,right);
            //拆分完了接下来就是合并
            meger(data, left, mid, right);
        }

    }

    private static void meger(int[] data, int left, int mid, int right) {
        int[] temp = new int[data.length];
        int point1 = left;
        int point2 = mid +1;
        int loc = left;
        while (point1 <= mid && point2 <= right){
            if(data[point1] < data[point2]){
                temp[loc] = data[point1];
                point1 ++ ;
                loc ++ ;
            }else{
                temp[loc] = data[point2];
                point2 ++ ;
                loc ++ ;
            }
        }
        while(point1 <= mid){
            temp[loc++] = data[point1++];
        }
        while(point2 <= right){
            temp[loc++] = data[point2++];
        }
        for (int i = left; i <= right ; i++ ){
            data[i] = temp[i];
        }
    }


}
