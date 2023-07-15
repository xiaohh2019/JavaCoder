package leetcode.trains;

import java.util.*;

/**
 * @author 灵缘一梦
 *
 * 贪心算法，田忌赛马
 *
 */
public class HorseRacing {

    public static void main(String[] args) {
        int[] A = new int[]{9,7,5,3,1};
        int[] B = new int[]{2,4,6,8,10};

        System.out.println(Arrays.toString(horseRace(A,B)));
    }

    private static int[] horseRace(int[] A, int[] B) {
        int[]  sortB = B.clone();
        Arrays.sort(sortB);
        Arrays.sort(A);
        // 存放 B
        Map<Integer, Deque<Integer>> bMap = new HashMap<>();
        for (int b : B){
            bMap.put(b,new LinkedList<>());
        }
        // 存放垃圾
        Deque<Integer> aq = new  LinkedList<>();

        int j = 0;
        for (int a : A){
            if(a > sortB[j]){
                bMap.get(sortB[j++]).add(a);
                //j++;
            }else{
                aq.add(a);
            }
        }
        // 存放 A 的最终结果
        int[] ans = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            if(bMap.get(B[i]).size() > 0){
                ans[i] = bMap.get(B[i]).removeLast();
            }else{
                ans[i] = aq.removeLast();
            }
        }
        return ans;
    }


}
