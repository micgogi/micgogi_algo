package LCJuneChallenge;/*
 *@author Rahul Gogyani
 *
 * 11:45 AM 2/20/2020
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class LC96 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n =Integer.parseInt(br.readLine());
            BigInteger ans=fact(2*n).divide(fact(n+1).multiply(fact(n)));

            System.out.println(  ans.intValue());
            System.out.println(calc(n));

        } catch (Exception e) {

        }
    }
    //Using Formula 
    public static BigInteger fact(int n){
        BigInteger bigInteger = new BigInteger("1");
        for(int i=2;i<=n;i++){
            bigInteger= bigInteger.multiply(BigInteger.valueOf(i));
        }

        return bigInteger;


    }
    //Using DP catalan no
    public static int calc(int n){
        int T[] = new int[n+1];
        T[0]=1;
        T[1]=1;

        for (int i = 2; i <=n ; i++) {
            for (int j = 0; j <i ; j++) {
                T[i]+=T[j]*T[i-j-1];
            }
        }
        return T[n];
    }
}
