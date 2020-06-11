import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Micgogi
 * on 6/11/2020  9:54 AM
 * Rahul Gogyani
 */
public class LC120Pract {
    public static void main(String[] args) {
        //        [
//     [2],
//    [3,4],
//   [6,5,7],
//  [4,1,8,3]
//]
        int a[][] ={{2,0,0,0},{3,4,0,0},{6,5,7,0},{4,1,8,3}};
        int dp[][] = new int[a.length][a.length];
        int b[] = a[a.length-1];
        for (int i = 0; i <b.length ; i++) {
            dp[a.length-1][i]=b[i];
        }
        for (int i = a.length-2; i >=0 ; i--) {
            int last[] = a[i];
            for (int j = 0; j <=i; j++) {
                int current = last[j];
                dp[i][j]=current+Math.min(dp[i+1][j],dp[i+1][j+1]);
            }
        }

        System.out.println(Arrays.deepToString(dp));
        System.out.println(dp[0][0]);
    }
}
