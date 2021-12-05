import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/5/2021  9:38 AM
 * Rahul Gogyani
 */
public class LC973Test {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new LC973Test().kClosest(new int[][]{{3,3},{5,-1},{-2,4}},2)));
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[2],b[2]));
        for (int[] point:points){
            int x = point[0];
            int y = point[1];
            int d = x*x+y*y;
            pq.add(new int[]{x,y,d});
        }
        int[][] ans = new int[k][2];
        int i=0;
        while (!pq.isEmpty() &&k--!=0){
            int[] point = pq.poll();
            ans[i++] = new int[]{point[0],point[1]};
        }
        return ans;
    }
}

