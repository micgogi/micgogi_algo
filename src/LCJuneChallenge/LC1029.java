package LCJuneChallenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 6/3/2020  1:04 PM
 * Rahul Gogyani
 */
public class LC1029 {
    public static void main(String[] args) {
        int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
//[[259,770],[448,54],[926,667],[184,139],[840,118],[577,469]
//[[184, 139], [448, 54], [840, 118], [259, 770], [577, 469], [926, 667]]
//
        Arrays.sort(costs,(a,b)->Math.abs(b[0]-b[1])-Math.abs(a[0]-a[1]));
       int a=0; int b=0;
       int n = costs.length/2;
       int totalcost=0;
        for (int i = 0; i <costs.length; i++) {
            if(b>=n||(costs[i][0]<costs[i][1]&&a<n)){
                a++;
                totalcost+=costs[i][0];
            }else{
                b++;
                totalcost+=costs[i][1];
            }
        }
        System.out.println(totalcost);
        System.out.println(Arrays.deepToString(costs));
    }
}
