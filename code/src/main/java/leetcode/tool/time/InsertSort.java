package leetcode.tool.time;

/**
 * @author 灵缘一梦
 */
public class InsertSort {
    public static void main(String[] args) {
        int a[] = {1,2,7,4,8,9,7,4,2,1,4,2,0,4};
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int data = a[i];
            int j;
            for ( j= i-1;j>=0;j-- ){
                if(a[j+1]>data){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = data;
        }
    }
}
