import java.util.Scanner;
import java.util.Stack;

/**
 * @author Micgogi
 * on 12/6/2019  12:46 AM
 *
 */
public class LC9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPalindrome(12345));

    }

        public static boolean isPalindrome(int x) {
            boolean flag =false;
            String s = ""+x;
            Stack<Character> stack = new Stack();
            for(int i=0;i<s.length();i++){
                stack.push(s.charAt(i));
            }
            for (int i = 0; i <s.length() ; i++) {
                if(s.charAt(i)==stack.pop()){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }
            if (flag)return  true;
            else return false;

        }
    }

