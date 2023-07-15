package leetcode.tool;

/**
 * @author 灵缘一梦
 */
public class Test2 {


    public static void main(String[] args) {

        String s = "hello";
        System.out.println(s.hashCode());

        System.out.println(hash(s));

        // 判断一个数是不是2的倍数
        System.out.println(is2Mod(2^99));

    }

    //1、JDK的hash计算
    public static int hash(Object key) {
        String capitity = "";
        int h = key.hashCode();
        // capitity 表示散列表的大小
        return (h^(h>>>16)) & (capitity.length() -1);

    }

    //2、判断一个数是不是2的倍数

    /**
     * 1.  ^ 异或运算符 : 由高至低，相同的为 0 ， 不同为1
     * 2.  & 与运算符：由高至低，同时为1 ，则为1 ，否则为 0
     * 3.  | 或运算符：由高至低，有一个为1 ，则为1 ，否则为 0
     * 4.  >> 右移动运算符： a >> n 即a对应的二进制数字 向右移动 n位 ， 左边补 0 （近似为 缩小 2*n倍）
     * 5.  << 左移运算符:  a << n 即a对应的二进制数字 向左移动 n位 ， 左边补 0 （近似为 放大 2*n倍）
     *
     */
    public static boolean is2Mod (int num) {
        return (num & (num - 1))==0;
    }

    //3. 判断






}
