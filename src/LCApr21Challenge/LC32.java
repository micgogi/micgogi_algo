package LCApr21Challenge;

/**
 * @author Micgogi
 * on 4/3/2021  12:33 PM
 * Rahul Gogyani
 */
public class LC32 {
    public static void main(String args[]) {
        System.out.println("()()");
    }

    public static int longestValidParentheses(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') left++;
            else if (c == ')') right++;
            if (left == right) {
                max = Math.max(max, 2 * right);
            } else if (right >= left) {
                left = 0;
                right = 0;
            }
        }
        left = 0;
        right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') left++;
            else if (s.charAt(i) == ')') right++;
            if (left == right) {
                max = Math.max(max, 2 * left);
            } else if (left >= right) {
                left = 0;
                right = 0;
            }
        }
        return max;
    }
}

