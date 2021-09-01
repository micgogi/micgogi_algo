import java.util.Stack;

/**
 * @author Micgogi
 * on 10/23/2020  1:16 PM
 * Rahul Gogyani
 */
public class LC456 {
    public static void main(String args[]) {
        int a[] = {65, 78, 75, 73, 84, 65};
        System.out.println(find132pattern(a));
    }

    public static boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n == 0) return false;
        Stack<Integer> stack = new Stack<>();
        int[] minVal = new int[n];
        minVal[0] = nums[0];
        for (int i = 1; i < n; i++) {
            minVal[i] = Math.min(minVal[i - 1], nums[i]);
        }
        for (int j = n - 1; j > 0; j--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[j]) {
                if (nums[stack.peek()] > minVal[j - 1]) {
                    return true;
                }
                stack.pop();
            }
            stack.push(j);
        }
        return false;
    }
}

