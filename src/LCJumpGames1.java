import java.io.BufferedReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 10/27/2021  6:16 PM
 * Rahul Gogyani
 */
public class LCJumpGames1 {
    public static void main(String args[]) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
    }

    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int reach =0; i <n && i<=reach; i++) {
            reach = Math.max(i+nums[i],reach);
        }
        return  i==n;
    }
}

