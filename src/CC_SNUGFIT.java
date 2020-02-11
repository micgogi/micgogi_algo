/*
 *@author Rahul Gogyani
 *
 * 10:07 AM 2/10/2020
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CC_SNUG_FIT {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                int N = Integer.parseInt(br.readLine());
                long A[] = new long[N];
                long B[] = new long[N];
                String s1 = br.readLine();
                String s11[] = s1.split(" ");
                String s2 = br.readLine();
                String s22[] = s2.split(" ");

                for (int i = 0; i <N ; i++) {
                    A[i]=Long.parseLong(s11[i]);
                }
                for (int i = 0; i <N ; i++) {
                    B[i]=Long.parseLong(s22[i]);
                }

                Arrays.sort(A);
                Arrays.sort(B);
                long min=0;
                for (int i = 0; i <A.length ; i++) {
                    if(A[i]>B[i]){
                        min+=B[i];
                    }else {
                        min+=A[i];
                    }
                }
                System.out.println(min);
            }
        }catch (Exception e){

        }
    }
}
