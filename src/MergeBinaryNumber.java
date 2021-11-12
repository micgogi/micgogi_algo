import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/12/2021  7:11 PM
 * Rahul Gogyani
 */
public class MergeBinaryNumber {
    public static void main(String args[]) {
        System.out.println(concatenatedBinary(3));
    }
    public static long concatenatedBinary(long n){
        int mod = 1_000_000_007;
        long ans = 0;
        for (int i = 1; i <=n ; i++) {
            int bitlen =Integer.toBinaryString(i).length();
            ans = ((ans<<(bitlen))%mod+i)%mod;
        }
        return ans;
    }
}

