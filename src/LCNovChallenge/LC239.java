package LCNovChallenge;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Micgogi
 * on 11/28/2020  2:43 PM
 * Rahul Gogyani
 */
public class LC239 {
    public static void main(String args[]) {
        int a[] = {65, 78, 75, 73, 84, 65};
        System.out.println(Arrays.toString(maxSlidingWindow(a, 2)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        if (nums.length == 0) {
            ans = new int[0];
            return ans;
        }
        int j = 0;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1) deque.poll();
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) deque.pollLast();
            deque.offer(i);
            if (i >= k - 1) {
                ans[j++] = nums[deque.peek()];
            }
        }
        return ans;
    }
}

