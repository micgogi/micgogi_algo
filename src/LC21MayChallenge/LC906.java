package LC21MayChallenge;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 5/8/2021  2:09 PM
 * Rahul Gogyani
 */
public class LC906 {
    public static void main(String args[]) {
        System.out.println(superpalindromesInRange("4","1000"));
    }
    public static int superpalindromesInRange(String left, String right) {
        List<Long> palindrone = new ArrayList<>();
        long low = Long.parseLong(left);
        long high = Long.parseLong(right);
        for (long i = 1; i <= 9 ; i++) {
            palindrone.add(i);
        }
        for (long i = 1; i <10000 ; i++) {
            String l = String.valueOf(i);
            String r = new StringBuffer(l).reverse().toString();
            palindrone.add(Long.parseLong(l+r));
            for (int j = 0; j <=9 ; j++) {
                palindrone.add(Long.parseLong(l+j+r));
            }
        }
        int res = 0;
        for (long p:palindrone){
            long sq = p*p;
            if(!isPalindorme(""+sq)){
                continue;
            }
            if(low<=sq && sq<=high)res++;


        }
       return res;
    }
     static boolean isPalindorme(String s){
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }

}

