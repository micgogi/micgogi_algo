package LCOctChallenge;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Micgogi
 * on 10/21/2020  3:36 PM
 * Rahul Gogyani
 */
public class LC735 {
    public static void main(String args[]) {
        int a[] = {5,10,-5};
        System.out.println(Arrays.toString(asteroidCollision(a)));
    }

    public static int[] asteroidCollision(int[] asteroids){
        Stack<Integer> stack = new Stack<>();
        for (int ast : asteroids){
            if(ast>0){
                stack.push(ast);
            }else{
                while (!stack.isEmpty() && stack.peek() >0 && stack.peek() < Math.abs(ast)){
                    stack.pop();
                }
                if( stack.isEmpty() || stack.peek()<0){
                    stack.push(ast);
                }else if(ast+stack.peek()==0){
                    stack.pop();
                }
            }
        }
        int res[] = new int[stack.size()];
        for (int i = res.length-1;i>=0;i--){
            res[i] = stack.pop();
        }
        return res;
    }

}

