package leetcode.tool.time;

import org.springframework.util.NumberUtils;

import java.util.Stack;

/**
 * @author 灵缘一梦
 */
public class Calculator {


    public static void main(String[] args) {
        Stack in = new Stack();
        Stack out = new Stack();

        in.push(0);
        in.push(1);
        System.out.println(in.pop());
        System.out.println(in.pop());

//        String str = "9+6-7*2";
//        char[] chars = str.toCharArray();
//        for (char c : chars) {
//            if(Character.isDigit(c)){
//                in.push(c);
//            }else{
//
//                if("*".equals(String.valueOf(out.pop()))){
//                    in.push((Integer)in.pop() * (Integer.valueOf(c)));
//                    break;
//                }
//                if("/".equals(String.valueOf(out.pop()))){
//                    in.push((Integer)in.pop() / (Integer.valueOf(c)));
//
//                    break;
//                }
//                out.push(c);
//            }
//        }
//        System.out.println(in.pop());

    }

}
