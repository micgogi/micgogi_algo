package June21Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 6/28/2021  5:47 PM
 * Rahul Gogyani
 */
public class LC1047 {
    public static void main(String args[]) {
        System.out.println(removeDuplicates("AABBCCD"));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty()){
                if(stack.peek()==c){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }else{
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()){
            sb.append(""+stack.peek());
            stack.pop();
        }
        return sb.reverse().toString();
    }
}

