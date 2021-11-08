import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/8/2021  7:07 PM
 * Rahul Gogyani
 */
public class LC121PracTest {
    public static void main(String args[]) {
        System.out.println(getMaxProfit(new int[]{7,1,5,3,6,4}));
    }

   public static int getMaxProfit(int[] prices){
        int minStockPrice = Integer.MAX_VALUE;
        int max = 0;
       for (int i = 0; i < prices.length ; i++) {
           minStockPrice = Math.min(minStockPrice,prices[i]);
           max = Math.max(max,prices[i]-minStockPrice);

       }
       return max;
   }
}

