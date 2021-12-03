import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/3/2021  8:59 PM
 * Rahul Gogyani
 */
public class LC1710 {
    public static void main(String args[]) {
        System.out.println(new LC1710().maximumUnits(new int[][]{{1,3},{2,2},{3,1}},4));
    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int maxvalue=0;
        for (int[] ele:boxTypes){
            if(truckSize>=ele[0]){
                maxvalue+=ele[0]*ele[1];
                truckSize-=ele[0];
            }else{
                maxvalue+=truckSize*ele[1];
                truckSize=0;
            }
        }
        return maxvalue;
    }
}

