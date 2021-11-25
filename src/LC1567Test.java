import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/25/2021  6:58 PM
 * Rahul Gogyani
 */
public class LC1567Test {
    public static void main(String args[]) {

    }

    public int getmaxLen(int[] arr){
        int countNeg=0;
        int zIndex =-1;
        int firstNeg=-1;
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<0){
                countNeg++;
                if(firstNeg==-1)firstNeg=i;
            }
            if(arr[i]==0){
                firstNeg=-1;
                zIndex=i;
                countNeg=0;
            }else{
                if(countNeg%2==0)max=Math.max(max,i-zIndex);
                else max = Math.max(max,i-firstNeg);
            }

        }
        return max;
    }
}

