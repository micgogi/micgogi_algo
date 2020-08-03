package LCAugustChallenge;/*
 *@author Rahul Gogyani

 *
 * 2:58 PM 3/10/2020
 */

import java.util.Stack;

public class LC125 {

    public static void main(String[] args) {
       String s =".,";
        Stack<Character> stack = new Stack<>();

        for (char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)) {
                stack.push(c);
            }
        }
        boolean flag = true;
        for (char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)) {
            if(stack.pop().toString().equalsIgnoreCase(""+c)){
                flag = true;
            }else{
                flag = false;
                break;
            }}

        }
        System.out.println(flag);

    }
}
