import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/5/2021  10:08 AM
 * Rahul Gogyani
 */
public class LC907 {
    public static void main(String[] args) {
        System.out.println(new LC907().sumSubarrayMins(new int[]{3,1,2,4}));
    }


    public int sumSubarrayMins(int[] a) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int n = a.length;
        int[] nextSmaller = new int[n];
        int[] previousSmaller = new int[n];
        for (int i = 0; i < n; i++) {
            nextSmaller[i] = n - i - 1;
            previousSmaller[i] = i;
        }
        for (int i = 0; i < n; i++) {
            while (!stack1.isEmpty() && a[stack1.peek()] > a[i]) {
                nextSmaller[stack1.peek()] = i - stack1.peek() - 1;
                stack1.pop();
            }
            stack1.push(i);
        }
        for (int i = n-1; i >=0 ; i--) {
            while (!stack2.isEmpty() && a[stack2.peek()] >= a[i]) {
                previousSmaller[stack2.peek()] = stack2.peek() - i - 1;
                stack2.pop();
            }
            stack2.push(i);
        }
        long ans = 0;
        int mod = (int) 1e9+7;
        for (int i = 0; i < n; ++i)
            ans = (ans + (long)a[i] *  (previousSmaller[i]+1) *  (nextSmaller[i]+1)) % mod;
        return (int)ans;
    }

}

