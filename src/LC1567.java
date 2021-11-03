import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/3/2021  12:27 PM
 * Rahul Gogyani
 */
public class LC1567 {
    public static void main(String args[]) {
        System.out.println(getMax(new int[]{1,2,3,5,-6,4,0,10}));
    }

   public  static int getMax(int[] nums){
        int countNeg=0,firstNeg=-1;
        int max = 0,zeroIndex=-1;

       for (int i = 0; i < nums.length ; i++) {
           if(nums[i]<0){
               countNeg++;
              if(firstNeg==-1)firstNeg=i;
           }

           if(nums[i]==0){
               countNeg =0;
               firstNeg=-1;
               zeroIndex = i;
           }else{
               if(countNeg%2==0) max = Math.max(max,i-zeroIndex);
               else max = Math.max(max,i-firstNeg);
           }

       }
       return max;


   }

}

