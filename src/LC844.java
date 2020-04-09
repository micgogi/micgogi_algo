import java.util.Stack;

/**
 * @author Micgogi
 * on 4/9/2020  2:08 PM
 * Rahul Gogyani
 */
public class LC844 {
    public static void main(String[] args) {
        String s= "ab#c";
        String t = "ad#c";
        Stack<Character> stacks = new Stack<>();
        Stack<Character> stackt = new Stack<>();
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='#') {
                if(!stacks.isEmpty()) {
                    stacks.pop();
                }
            }
            if(s.charAt(i)!='#') {
                stacks.push(s.charAt(i));
            }
        }
        for (int i = 0; i <t.length() ; i++) {
            if(t.charAt(i)=='#') {
                if(!stackt.isEmpty()) {
                    stackt.pop();
                }
            }
            if(t.charAt(i)!='#') {
                stackt.push(t.charAt(i));
            }
        }

        System.out.println(stacks.equals(stackt));


        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()){
            if(c!='#'){
                sb.append(c);
            }else{
                if(sb.length()>0)sb.deleteCharAt(sb.length()-1);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (char c: t.toCharArray()){
            if(c!='#'){
                sb2.append(c);
            }else{
                if(sb2.length()>0)sb2.deleteCharAt(sb2.length()-1);
            }
        }

        System.out.println(sb.toString().equals(sb2.toString()));
        }
     }

