import java.util.Stack;

/**
 * @author Micgogi
 * on 12/14/2019  7:13 PM
 * Micgogi
 */
public class LC20 {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)==')'){
                if(stack.isEmpty())return false;
                // System.out.println(s.charAt(i)!=stack.pop());
                if(!matching(stack.pop(),s.charAt(i))){
                    return false ;
                }
            }
        }


        if(stack.isEmpty())return true;
        else return false;


    }
    public static  boolean matching(char c1, char c2){
        if(c1=='('&&c2==')')return true;
        if(c1=='['&&c2==']')return true;
        if(c1=='{'&&c2=='}')return true;
        return false;
    }
}
