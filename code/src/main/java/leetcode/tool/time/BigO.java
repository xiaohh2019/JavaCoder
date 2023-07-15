package leetcode.tool.time;

/**
 * @author 灵缘一梦
 */
public class BigO {
    public static void main(String[] args) {
        int a = 1; // 1次 O(1)
        for (int i = 0;i < 3; i++){   //这里会运行几次？ 4次，在第四次的时候结束
            a = a + 1;  //这里会运行几次？O(1)
        }

        int n = Integer.MAX_VALUE;  // n表示未知
        int i = 1;
        for (int j = 0; j< n; j++){
            while(i <= n){
                i = i*2;  //O(nlogn)
            }
        }
        while(i <= n){
            i = i*2;   //O(logn)
        }

        for (i =0; i< n; i++){
            a = a + 1;   //O(n)
        }

        for (i =0; i< n; i++){
            for (int j =0; j< n; j++){
                a = a + 1;   //O(n^2)  冒泡排序
            }
        }




    }
}
