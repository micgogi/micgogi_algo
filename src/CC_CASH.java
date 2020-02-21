/*
 *@author Rahul Gogyani
 *
 * 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CC_CASH {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t= Integer.parseInt(br.readLine());
            while(t--!=0){
                String s = br.readLine();
                String s1[]=s.split(" ");

                int N =Integer.parseInt(s1[0]);
                int K = Integer.parseInt(s1[1]);
                int a[] = new int[N];
                String s2 = br.readLine();
                String s3[] = s2.split(" ");
                for (int i = 0; i <s3.length ; i++) {
                    a[i]=Integer.parseInt(s3[i]);
                }
                int div =0;
                for (int i = 0; i <N ; i++) {
                     div+= a[i];

                }
                System.out.println(div%K);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
