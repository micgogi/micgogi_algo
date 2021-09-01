package LCApr21Challenge;

import java.util.Stack;

/**
 * @author Micgogi
 * on 4/17/2021  9:38 AM
 * Rahul Gogyani
 */
public class LC1209 {
    class Pair {
        char c;
        int count;

        public Pair(char c, int count) {
            this.c = c;
            this.count = count;
        }
    }

    public static void main(String args[]) {
        LC1209 lc1209 = new LC1209();
        System.out.println(lc1209.removeDuplicates("pbbcggttciiippooaais",2));
    }

    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Pair> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().c == c) {
                stack.peek().count++;
            } else {
                stack.push(new Pair(c, 1));
            }
            if (stack.peek().count == k) {
                stack.pop();
            }
        }
        for (Pair pair : stack) {
            for (int i = 0; i < pair.count; i++) {
                sb.append(pair.c);
            }
        }
        return sb.toString();
    }
}

