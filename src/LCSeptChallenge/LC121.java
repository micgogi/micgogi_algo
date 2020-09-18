package LCSeptChallenge;

/**
 * @author Micgogi
 * on 7/29/2020  7:35 PM
 * Rahul Gogyani
 */
public class LC121 {
    public static void main(String args[]) {
        int[] prices = {7,1,5,3,6,4};
        //[-6,4,-2,3,-2];
        int cur =0;
        int max = 0;
        for (int i = 1; i <prices.length ; i++) {
            cur+=(prices[i] - prices[i - 1]);
            cur=Math.max(0, cur );
            max = Math.max(max,cur);
        }
        System.out.println(max);
    }


}

