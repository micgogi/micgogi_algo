import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Micgogi
 * on 5/30/2020  2:50 PM
 * Rahul Gogyani
 */
public class LC973 {
    public static void main(String[] args) {
        int a[][] = {{1,3},{-2,2}};
        int k =1;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((c,d)->c[0]-d[0]);
        for (int i = 0; i <a.length ; i++) {
            int e[]  = {a[i][0]*a[i][0]+a[i][1]*a[i][1],a[i][0],a[i][1]};
            pq.add(e);
        }
        int res[][] = new int[k][2];
        int i=0;
        while(k!=0){
            int t[] = pq.poll();
            res[i][0]=t[1];
            res[i][1]=t[2];
            i++;
            k--;
        }
        System.out.println(Arrays.deepToString(res));
    }
}
