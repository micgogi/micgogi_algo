import java.util.Stack;

/**
 * @author Micgogi
 * on 11/19/2020  8:15 PM
 * Rahul Gogyani
 */
public class LC394 {
    public static void main(String[] args) {
        String s = "2[a]1[k]1[i]1[n]";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder cur = new StringBuilder();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + ch - '0';
            } else if (ch == '[') {
                numStack.push(count);
                stringStack.push(cur);
                cur = new StringBuilder();
                count = 0;
            } else if (ch == ']') {
                StringBuilder temp = cur;
                cur = stringStack.pop();
                for (count = numStack.pop(); count > 0; count--) {
                    cur.append(temp);
                }
            } else {
                cur.append(ch);
            }
        }
        return cur.toString();
    }
}

