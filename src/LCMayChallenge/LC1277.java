package LCMayChallenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 5/21/2020  1:53 PM
 * Rahul Gogyani
 */
public class LC1277{
    public static void main(String[] args) {
        int a[][] = {{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        int count[][] = new int[a.length+1][a[0].length+1];
        int t=0;
        for (int i = 1; i <count.length ; i++) {
            for (int j = 1; j <count[i].length ; j++) {
                if(a[i-1][j-1]!=0){
                    count[i][j]=Math.min(Math.min(count[i-1][j],count[i][j-1]),count[i-1][j-1])+1;
                    t+=count[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(count));
        System.out.println(t);
    }
}
