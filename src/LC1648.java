import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/6/2021  4:07 PM
 * Rahul Gogyani
 */
public class LC1648 {
    public static void main(String[] args) {
        System.out.println(new LC1648().maxProfit(new int[]{2, 5}, 4));
    }

    public int maxProfit(int[] inventory, int orders) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        Arrays.sort(inventory);
        long ans = 0;
        int n = inventory.length;
        int mod = 1_000_000_007;
        for (int i = n - 1; i >= 0; i--) {
            long diff = inventory[i] - (i > 0 ? inventory[i - 1] : 0);
            long x = Math.min((long) orders, (n - i) * diff);
            long r = inventory[i];
            long l = r - x / (n - i);
            ans += (r * (r + 1) / 2 - l * (l + 1) / 2) * (n - i);
            ans %= mod;
            ans += l * (x % (n - i));
            ans %= mod;
            orders -= x;

        }


        return (int) ans;
    }
}

