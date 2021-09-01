package June21Challenge;

/**
 * @author Micgogi
 * on 6/7/2021  1:56 PM
 * Rahul Gogyani
 */
public class LC746 {
    public static void main(String args[]) {
        System.out.println(minCostClimbingStairs(new int[]{1,2,3,2,2,1}));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] d = new int[cost.length+1];
        for(int i=2;i<d.length;i++){
            d[i] =Math.min(d[i-1]+cost[i-1],d[i-2]+cost[i-2]);
        }
        return d[d.length-1];
    }

}

