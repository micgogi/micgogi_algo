import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 10/28/2021  6:30 PM
 * Rahul Gogyani
 */
public class LCFibDP1 {
    public static void main(String args[]) {
        System.out.println(fib(5));
    }

    public static int fib(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        int fib[]= new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2;i<=n;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        return fib[n];
    }

}

