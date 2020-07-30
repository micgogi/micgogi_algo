import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/30/2020  12:08 PM
 * Rahul Gogyani
 */
public class LC1497 {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9};
        System.out.println(canArrange(a,5));

    }

    public static boolean canArrange(int[] arr, int k) {
        int freq[] = new int[k];
        for (int num : arr) {
            num %= k;
            if(num<0)num+=k;
            freq[num]++;
        }
        if(freq[0]%2!=0)return false;
        for (int i = 1; i <= k/2; i++) {
            if(freq[i]!=freq[k-i]){
                return false;
            }
        }
        return true;
    }

}

