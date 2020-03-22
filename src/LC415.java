/*
 *@author Rahul Gogyani

 *
 * 2:09 PM 3/18/2020
 */

import java.util.Stack;

public class LC415 {
    public static void main(String[] args) {
        String s1 ="8265728576";
        String s2 = "657875738465";
      Stack<Integer> stack1 = new Stack<>();
      Stack<Integer> stack2 = new Stack<>();
        for (int i = 0; i <s1.length() ; i++) {
            stack1.push(Integer.parseInt(""+s1.charAt(i)));
        }
        for (int i = 0; i <s2.length() ; i++) {
            stack2.push(Integer.parseInt(""+s2.charAt(i)));
        }
        int carry=0;
        StringBuilder sb = new StringBuilder();
        while(!stack1.isEmpty()||!stack2.isEmpty()){
            int firstnum =0;
            int secondnum =0;
          if(!stack1.isEmpty()){
              firstnum = stack1.pop();
          }
          if(!stack2.isEmpty()){
              secondnum = stack2.pop();
          }

          int sum = firstnum+secondnum+carry;
          if(sum>9)carry=1;
          else carry=0;

          sb.append(""+sum%10);
          if(stack1.isEmpty()&&stack2.isEmpty()&&carry!=0){
              sb.append(carry);
          }

        }
        System.out.println(sb.reverse().toString());

    }
}
