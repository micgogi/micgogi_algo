import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/6/2021  7:41 PM
 * Rahul Gogyani
 */
public class LC239Test {
    public static void main(String args[]) {
        System.out.println(Arrays.toString(new LC239Test().maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }

    public int[] maxSlidingWindow(int[] arr, int k) {
        if (arr == null || k < 0) return new int[]{0};
        Deque<Integer> deque = new ArrayDeque<>();
        int n = arr.length;
        int ans[] = new int[n - k + 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1) deque.poll();
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (i >= k - 1) {
                ans[j++] = arr[deque.peek()];
            }

        }
        return ans;
    }


}

