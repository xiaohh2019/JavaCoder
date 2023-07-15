package leetcode.tool.time;

/**
 * @author 灵缘一梦
 * 约瑟夫问题：
 * 有 N 个人围成一圈，每个人都有一个编号，编号由入圈的顺序决定，
 * 第一个入圈的人编号为 1，最后一个为 N，从第 k (1<=k<=N)个人开始报数，数到 m (1<=m<=N)的人将出圈，
 * 然后下一个人继续从 1 开始报数，直至所有人全部出圈，求依次出圈的编号。
 */
public class JosePhuCycle {

    public static void main(String[] args) {
        lastRemaining(5, 3);
    }

    public static void lastRemaining(int n, int m) {
        int value=1;
        for(int i=1;i<=n;i++)
        {
            value=(value+m)%i;
            System.out.print(value+1 + "  ");
        }
        System.out.println();
    }
}
