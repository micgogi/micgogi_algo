package LCAprilChallenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 3/31/2020  11:09 AM
 * Rahul Gogyani
 */
public class LC202 {
    public static void main(String[] args) {
        try {
            boolean flag = false;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            while(n!=1){
                int sum=0;
                String s = ""+n;
                for (int i = 0; i <s.length() ; i++) {
                    sum+=Math.pow(Integer.parseInt(""+s.charAt(i)),2);
                }
                System.out.println(n);
                n=sum;
                if(n==1) System.out.println("yooo");
                if(n==4) System.out.println("Hakuna matata");

            }
        }catch (Exception e){

        }
    }
}
