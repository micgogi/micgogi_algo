package LCOctChallenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 10/10/2020  3:27 PM
 * Rahul Gogyani
 */
public class LC452 {
    public static void main(String args[]) {
        int a[][] = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(a));
    }
    static int findMinArrowShots(int a[][]){
        if(a.length==0)return 0;
        int min = a[0][1];
        int count = 0;

        Arrays.sort(a, (c,d)->c[0]-d[0]);
        for(int[] point : a){
            if(point[0]>min){
                count++;
                min = point[1];
            }else{
                min = Math.min(min,point[1]);
            }
        }
        return count +1;
    }
}

