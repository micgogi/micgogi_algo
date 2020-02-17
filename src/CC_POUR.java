/*
 *@author Rahul Gogyani
 *
 * 11:21 AM 2/17/2020
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CC_POUR {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                int a = Integer.parseInt(br.readLine());
                int b = Integer.parseInt(br.readLine());
                int ta= Integer.parseInt(br.readLine());
                System.out.println(minSteps(a,b,ta));
            }
        }catch (Exception e){

        }


    }
    static int pour(int fromCap, int toCap, int d){
        int from = fromCap;
        int to = 0;
        int step =1;
        while(from!=d&&to!=d){
            int temp = Math.min(from,toCap-to);
            to+=temp;
            from-=temp;
            step++;
            if(from==d||to==d)break;

            if(from==0){
                from=fromCap;
                step++;
            }

            if(to==toCap){
                to=0;
                step++;
            }

        }
        return step;

    }

    static int minSteps(int m, int n, int d){
        if(m>n){
          m=m+n;
          n=m-n;
          m=m-n;

        }
        if(d>n){
            return -1;
        }
        if(d%gcd(m,n)!=0){
            return -1;
        }
        return Math.min(pour(n,m,d),pour(m,n,d));
    }
    static int gcd(int a, int  b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
