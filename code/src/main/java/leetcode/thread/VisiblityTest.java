package leetcode.thread;

/**
 *
 * 可见性问题测试
 * @author 灵缘一梦
 */
public class VisiblityTest {

    private boolean flag = true;
//    private volatile boolean flag = true;
//    private int count = 0;

    private Integer count = 0;

    private void refresh(){
        flag = false;
        System.out.println(Thread.currentThread().getName() + "修改flag:"+ flag );
    }

    private void load(){

        System.out.println(Thread.currentThread().getName() + "开始执行...." );
        while (flag){
            count ++;
        }
        System.out.println(Thread.currentThread().getName() + "跳出循环:"+count  );
    }


    public static void main(String[] args) throws InterruptedException {

        VisiblityTest test = new VisiblityTest();

        Thread ThreadA = new Thread(()-> test.load(),"TreadA");
        ThreadA.start();

        Thread.sleep(1000);

        Thread ThreadB = new Thread(()-> test.refresh(),"TreadB");
        ThreadB.start();

//        for(;;){
//            System.out.println("-----");
//        }

    }
}
