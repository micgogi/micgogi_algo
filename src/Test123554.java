import java.util.Stack;

/**
 * @author Micgogi
 * on 9/23/2021  12:31 PM
 * Rahul Gogyani
 */
public class Test123554 {
    public static void main(String args[]) {
        System.out.println(wellFormed("{([])}]"));
    }

    public static boolean wellFormed(String s){

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){

            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else {
                if(s.charAt(i)=='}' && stack.peek()=='{')stack.pop();
                else if(s.charAt(i)==')' && stack.peek()=='(')stack.pop();
                else if(s.charAt(i)==']' && stack.peek()=='[')stack.pop();
            }
        }

        return stack.isEmpty() ? true:false;


    }

}

