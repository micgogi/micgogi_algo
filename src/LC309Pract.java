import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/17/2020  11:03 AM
 * Rahul Gogyani
 */
public class LC309Pract {
    public static void main(String args[]) {
        int a[] = {1,2,3,0,2};
        System.out.println(maxprofixt(a));
        System.out.println(maxprofit1(a));

    }
    //using state machine space comp O(n)
    public static int maxprofixt(int[] prices){
        int s0[] = new int[prices.length];
        int s1[] = new int[prices.length];
        int s2[] = new int[prices.length];
        s0[0] = 0;
        s1[0] = -prices[0];
        s2[0] = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            s0[i] = Math.max(s0[i-1],s2[i-1]);
            s1[i] = Math.max(s0[i-1]-prices[i],s1[i-1]);
            s2[i] = s1[i-1]+prices[i];
        }
        return Math.max(s0[prices.length-1],s2[prices.length-1]);
    }
    //using state machine space comp O(1)
    public static int maxprofit1(int[] prices){
        int s0 = 0;
        int s1 = -prices[0];
        int s2 = Integer.MIN_VALUE;
        for (int i = 0; i <prices.length ; i++) {
            int lastS2 = s2;
            s2 = s1+prices[i];
            s1 = Math.max(s0-prices[i],s1);
            s0 = Math.max(lastS2,s0);
        }
        return Math.max(s0,s2);
    }
}

