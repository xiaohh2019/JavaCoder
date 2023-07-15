package leetcode.tool.time;

/**
 * @author 灵缘一梦
 */
public class FabTest {

    public static void main(String[] args) {

        //System.out.println(fab(45));
        System.out.println(tailfab(1,1,48));
    }

    public static int fab(int n){
        if(n <= 2){
            return 1;
        }
        return fab(n-1) +  fab(n-2);
    }

    public static int tailfab(int pre,int res,int n){
        if(n <= 2){
            return res;
        }
        return tailfab(res,pre + res,n-1);

    }
}
