package leetcode.tool.time;

/**
 * 购物车动态规范
 *  背包最大5kg
 *  价格：  6   10     12
 *  重量：  1    2     4
 * @author 灵缘一梦
 */
public class CarDP {

    public static void main(String[] args) {
        int[] value = {6 ,10 ,12};
        int[] weight = {1 ,2 ,4};

        int w = 5; //背包重量
        int n = 3; //三个物品

        int[][] res = new int[n+1][w+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w ; j++) {
                if(weight[i-1] <= j){
                    res[i][j] = Math.max(
                            value[i-1] + res[i-1][j-weight[i-1]],
                            res[i-1][j]
                    );
                }else{
                    res[i][j] = res[i-1][j];	//不能装
                }
            }
        }
        System.out.println(res[n][w]);
    }
}
