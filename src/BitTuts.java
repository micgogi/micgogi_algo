import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/3/2020  1:15 PM
 * Rahul Gogyani
 */
public class BitTuts {
    public static void main(String args[]) {
        System.out.println(countNoOfSetbits(5));
        System.out.println(countNoOfSetbits1(5));

    }
    //O(no of bits)
    public static int countNoOfSetbits(int n){
        int count =0;
        while (n>0){
            count+=(n&1);
            n=n>>1;
        }
        return count;

    }
    //O(no of set bits)
    public static int countNoOfSetbits1(int n){
        int count =0;
        while (n>0){
            count++;
            n=n&(n-1);
        }
        return count;

    }

}

