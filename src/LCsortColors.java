import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 10/27/2021  5:13 PM
 * Rahul Gogyani
 */
public class LCsortColors {
    public static void main(String args[]) {
        int[] a = new int[]{0,0,1,1,0,2,1,2,0};
        sortColors(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sortColors(int a[]){
        int[] ans = new int[3];
        for (int i = 0; i <a.length; i++) {
            ans[a[i]]++;
        }
        int index =0;
        for (int i = 0; i <ans.length ; i++) {
            while(ans[i]!=0){
                a[index++] = i;
                ans[i]--;
            }
        }
    }

}

