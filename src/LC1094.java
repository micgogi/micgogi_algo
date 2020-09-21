import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Micgogi
 * on 9/21/2020  12:48 PM
 * Rahul Gogyani
 */
public class LC1094 {
    public static void main(String args[]) {
        int[][] trips = {{2,1,5},{3,3,7}};
        int capacity = 5;
        int time[] = new int[1001];
        for (int[] trip: trips){
            time[trip[1]] += trip[0];
            time[trip[2]] -= trip[0];
        }
        int used = 0;
        for (int i = 0; i < time.length ; i++) {
            used += time[i];
            if(used > capacity){
                System.out.println(false);
                return;
            }
        }
    }

}

