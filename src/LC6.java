import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Micgogi
 * on 11/19/2019  1:27 AM
 *
 */
public class LC6 {
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        try {
                String s = br.readLine();

               // System.out.println(s.substring(0,1));
            if(s.length()==1||s.length()==0){
                System.out.println(s);
            }
            ArrayList<String> a = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                for (int j = i+1; j <s.length() ; j++) {
                   //System.out.println(s.substring(i,j+1));

                    if(checkPalindrome(s.substring(i,j+1))){
                        a.add(s.substring(i,j+1));
                    }else{
                        a.add(""+s.charAt(i));
                    }
                }
            }
            int max=0;
            int index=0;
            for (int i = 0; i <a.size() ; i++) {
                if(a.get(i).length()>max){
                    max=a.get(i).length();
                    index=i;
                }
            }

            System.out.println(a.get(index));
        }catch (Exception e){

        }
    }
    public static boolean checkPalindrome(String s){
        Stack<Character> stack = new Stack();
        boolean flag = false;
        for (int i = 0; i <s.length() ; i++) {
            stack.push(s.charAt(i));
        }

        for (int i = 0; i <s.length() ; i++) {
            if(stack.pop()==s.charAt(i)){
                flag = true;
            }else{
                flag= false;
                break;
            }
        }
        return flag;
    }

}
