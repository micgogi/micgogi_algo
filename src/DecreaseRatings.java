import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/12/2021  8:22 PM
 * Rahul Gogyani
 */
public class DecreaseRatings {
    public static void main(String args[]) {
        System.out.println(decreaseRatings(new int[]{4,3,5,4,3}));
    }
    public static int decreaseRatings(int[] ratings) {
//        Example - Ratings = [4,3,5,4,3]
//        Periods (in other words sub arrays in which ratings are decreasing):
//        One day periods = [4],[3],[5],[4],[3] (count of subarrays is 5)
//        Two day periods = [4,3],[5,4],[4,3] (count of subarrays is 3)
//        3 day periods = [5,4,3] (count of subarrays is 1)
        int n = ratings.length;
        int ans = 0;
        int j =0;
        for (int i = 0; i <n ; i++) {
            if (i > 0 && ratings[i] < ratings[i - 1]) {
                ans += i - j + 1;
            } else {
                j = i;
                ans++;
            }
        }
        return ans;
    }
}

