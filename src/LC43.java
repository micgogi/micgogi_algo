/*
 *@author Rahul Gogyani

 *
 * 2:48 PM 3/18/2020
 */

import java.util.Arrays;

public class LC43 {


    public static void main(String[] args) {
        String s1 = "657875738465";
        String s2 = "8265728576";
        int result[] = new int[s1.length()+s2.length()];
        int i =0;
        int j= 0;
        for (int k = s1.length()-1; k>=0 ; k--) {
            int carry =0;
            int first = Integer.parseInt(""+s1.charAt(k));
            j=0;
            for (int l = s2.length()-1; l >=0 ; l--) {
                int second = Integer.parseInt(""+s2.charAt(l));
                int sum = first*second+result[i+j]+carry;
                carry=sum/10;
                result[i+j]=sum%10;
                j++;

            }
            if(carry>0)
                result[i+j]+=carry;
            i++;
        }
        StringBuilder sb = new StringBuilder();
        int q =result.length-1;
        while (q>=0&&result[q]==0){
            q--;
        }
        while(q>=0){

            sb.append(result[q--]);
        }
        System.out.println(sb.toString());

    }
}
