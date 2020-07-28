package LCJulyChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/28/2020  3:28 PM
 * Rahul Gogyani
 */
public class LC517 {
    public static void main(String args[]) {
        int a[] = {1,0,5};
        System.out.println(findMoves(a));
    }

   public static int findMoves(int[] machines){
        int sum= Arrays.stream(machines).sum();
        if(sum%machines.length!=0)return -1;
        int target = sum/machines.length;
        int res=0;
        int psum=0;
       for (int i = 0; i <machines.length ; i++) {
           psum+=machines[i];
           res = Math.max(res,Math.abs(psum-(i+1)*target));
           res = Math.max(res,machines[i]-target);
       }
       return res;

   }
}

