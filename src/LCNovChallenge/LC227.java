package LCNovChallenge;

import java.util.Stack;

/**
 * @author Micgogi
 * on 11/24/2020  5:30 PM
 * Rahul Gogyani
 */
public class LC227 {
    public static void main(String args[]) {
        String eq = "65*95";
        System.out.println(calculate(eq));

    }

    public static int calculate(String s) {
        if (s == null || s.length() == 0) return 0;
        int len = s.length();
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char op = '+';
        for (int i = 0; i < len; i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                currentNumber = (currentNumber * 10) + (currentChar - '0');
            }
            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == len - 1) {
                if (op == '-') {
                    stack.push(-currentNumber);
                } else if (op == '+') {
                    stack.push(currentNumber);
                } else if (op == '*') {
                    stack.push(stack.pop() * currentNumber);
                } else if (op == '/') {
                    stack.push(stack.pop() / currentNumber);
                }
                op = currentChar;
                currentNumber = 0;
            }
        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }

}

