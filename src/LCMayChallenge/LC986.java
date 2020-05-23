package LCMayChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Micgogi
 * on 5/14/2020  8:54 AM
 * Rahul Gogyani
 */
public class LC986 {
    public static void main(String[] args) {
        int A[][]={};
        int B[][] ={{7,13},{16,20}};
        System.out.println(Arrays.deepToString(intervalIntersection(A,B)));
    }

    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> list = new ArrayList<>();
        if(A.length==0&&B.length==0){
            return A;
        }
        if(A.length==0&&B.length!=0){
            return B;
        }
        if(B.length==0&&A.length!=0){
            return A;
        }
        int i=0,j=0;
      while (i<A.length&&j<B.length){
           if(A[i][1]<B[j][0]){
               i++;
           }else if(A[i][0]>B[j][1])
               j++;
           else{
               int first = Math.max(A[i][0],B[j][0]);
               int second = Math.min(A[i][1],B[j][1]);
               list.add(new int[]{first,second});
               if(A[i][1]<B[j][1]){
                   i++;
               }else{
                   j++;
               }
           }
       }
        return list.toArray(new int[list.size()][]);
    }
}
