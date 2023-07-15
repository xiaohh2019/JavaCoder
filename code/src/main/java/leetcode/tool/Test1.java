package leetcode.tool;

import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author 灵缘一梦
 */
public class Test1 {

    public static void main(String[] args) {

        Map map = new HashMap<Integer,String>(){
            {
                put(1,"aaa");
                put(2,"aaa");
                put(3,"aaa");
                put(4,"aaa");

                System.out.println("--------1");
            }
        };
        System.out.println(map);

        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Set set =  new HashSet<Integer>(){
            {
                add(6);
                add(5);
                add(1);
                add(2);
                add(3);
                add(4);
            }
        };
        System.out.println(set);

        Set<Integer> set1 = IntStream.range(1, 101).boxed().collect(Collectors.toSet());
        System.out.println(set1);

        Set<Integer> set2 = IntStream.range(1, 101).filter(e -> e%2==1).boxed().collect(Collectors.toSet());
        System.out.println(set2);


//        int a = 123_45_789;
//        System.out.println(a);
//        long b = (long) 0.1f;
//        System.out.println(b);

    }
}

//class GirlFriend{
//
//    String name = "芭比";
//    Integer age = 20;
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}