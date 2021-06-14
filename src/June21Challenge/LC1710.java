package June21Challenge;

import java.io.BufferedReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 6/14/2021  7:21 PM
 * Rahul Gogyani
 */
public class LC1710 {
    public static void main(String args[]) {
        System.out.println(maximumUnits(new int[][]{{1,3},{5,5},{2,5},{4,2},{4,1},{3,1},{2,2},{1,3},{2,5},{3,2}}
        ,35));
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for (int[] box:boxTypes){
            pq.add(box);
        }
        int ans =0;
        while (truckSize!=0){
            if(!pq.isEmpty()){
                int[] p = pq.poll();
                if(p[0]<truckSize) {
                    ans += p[0] * p[1];
                    truckSize -= p[0];
                }else{
                    ans+=truckSize*p[1];
                    truckSize=0;
                }
            }else{
                break;
            }
        }
        return ans;
    }

}

