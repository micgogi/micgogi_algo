/*
 *@author Rahul Gogyani
 *
 * 1:44 PM 2/13/2020
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LC541 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();

            StringBuilder sb = new StringBuilder();
            int k =Integer.parseInt(br.readLine());

            boolean found = true;
            for (int i = 0; i <s.length(); i+=k) {
                if(found&&(s.length()-i)>=k){
                    StringBuilder sb1 = new StringBuilder(s.substring(i,i+k));
                    sb.append(sb1.reverse());
                    found=false;
                }else if(!found&&(s.length()-i)>=k){

                    sb.append(s.substring(i,i+k));
                    found=true;
                }else if(s.length()-i<k){
                    if(found) {
                        StringBuilder sb2 = new StringBuilder(s.substring(i, s.length()));
                        sb.append(sb2.reverse());
                    }else{
                        sb.append(s.substring(i,s.length()));
                    }
                }
            }
            System.out.println(sb.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
