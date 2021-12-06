import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/6/2021  6:11 PM
 * Rahul Gogyani
 */
public class LC42Test {
    public static void main(String[] args) {
        System.out.println(new LC42Test().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    public int trap(int[] height) {
        if (height.length == 0) return 0;
        int lmax = 0;
        int rmax = 0;
        int l = 0;
        int r = height.length - 1;
        int ans = 0;
        while (l < r) {
            if (height[l] > lmax) lmax = height[l];
            if (height[r] > rmax) rmax = height[r];
            if (lmax < rmax) {
                ans += Math.max(0, lmax - height[l]);
                l++;
            } else {
                ans += Math.max(0, rmax - height[r]);
                r--;
            }
        }
        return ans;
    }

}

