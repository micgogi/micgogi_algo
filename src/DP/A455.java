package DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/13/2020  12:29 PM
 * Rahul Gogyani
 */
public class A455 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            long a[] = new long[100001];
            for (int i = 0; i <s.length ; i++) {
                int x= Integer.parseInt(s[i]);
                a[x]+=x;
            }
            for(int i=2;i<100001;i++)
            {
                a[i]=Math.max(a[i]+a[i-2],a[i-1]);
            }
            System.out.println(a[100000]);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
