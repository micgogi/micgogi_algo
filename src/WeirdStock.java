import java.io.BufferedReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/25/2021  6:05 PM
 * Rahul Gogyani
 */
public class WeirdStock {
    public static void main(String[] args) {
        System.out.println(new WeirdStock().ws(3, 4));
    }
    public int ws(int n, int m){
        int res =0;
        while (n<m){
            if(m%2==1)m=m+1;
            else m=m/2;
            res++;
        }
        return res+(n-m);
    }
}

