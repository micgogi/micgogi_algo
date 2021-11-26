/**
 * @author Micgogi
 * on 11/26/2021  6:41 PM
 * Rahul Gogyani
 */
public class LC121Test {
    public static void main(String[] args) {
        System.out.println(new LC121Test().maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public int maxProfit(int [] prices) {
        int minStockPrice = Integer.MAX_VALUE;
        int max =0;
        for (int i = 0; i<prices.length ; i++) {
            minStockPrice = Math.min(minStockPrice,prices[i]);
            max = Math.max(max,prices[i]-minStockPrice);
        }
        return max;
    }
}

