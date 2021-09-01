import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Micgogi
 * on 2/15/2021  4:30 PM
 * Rahul Gogyani
 */
public class LC1337 {
    public static void main(String args[]) {
        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        System.out.println(Arrays.toString(kWeakestRows(mat,3)));

    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] count = new int[mat.length];
        int c =0;
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[i].length ; j++) {
                if(mat[i][j]==1){
                    c++;
                }
            }
            count[i] =c;
            c=0;
            
        }
       // System.out.println(Arrays.toString(count));
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int compByOne = o1[1]-o2[1];
                if(compByOne==0){
                    return o1[0]-o2[0];
                }else{
                  return   compByOne;
                }
            }
        });
        int[] ans = new int[k];
        for (int i = 0; i < count.length ; i++) {
            int[] temp = new int[2];
            temp[0] = i;
            temp[1] = count[i];
            pq.add(temp);
        }
        System.out.println(pq);
        for (int i = 0; i <k; i++) {
            ans[i] = pq.poll()[0];
        }
        return ans;
    }
}

