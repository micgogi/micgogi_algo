import java.util.ArrayList;
import java.util.List;

/**
 * @author Micgogi
 * on 3/14/2020  5:46 PM
 * Rahul Gogyani
 */
public class LC120 {
    public static void main(String[] args) {
//        [
//     [2],
//    [3,4],
//   [6,5,7],
//  [4,1,8,3]
//]
        List<List<Integer>> list = new ArrayList<>();
       int dp[][] = new int[list.size()][list.size()];
       List<Integer> last = list.get(list.size()-1);
        for (int i = 0; i <last.size() ; i++) {
            dp[list.size()-1][i]=last.get(i);
        }
        for (int i = list.size()-2; i >=0 ; i--) {
            List<Integer> row = list.get(i);
            for (int j = 0; j < row.size(); j++) {

                int current = row.get(j);
               dp[i][j] = current+Math.max( dp[i+1][j],dp[i+1][j+1]);

            }
        }
        System.out.println(dp[0][0]);
        }
    }

