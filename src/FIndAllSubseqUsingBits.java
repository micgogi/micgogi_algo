import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/5/2020  11:47 AM
 * Rahul Gogyani
 */
public class FIndAllSubseqUsingBits {
    public static void main(String args[]) {
        String s = "KINAAT";
        int n = s.length();
        int start = 0;
        int end = (int) Math.pow(2, n) - 1;
        for (int i = start; i <= end; i++) {


           // System.out.println(bin);
            int num = i;
            int j = s.length()-1;
            StringBuilder res = new StringBuilder();
            while (num>0){

                if((num&1)==1){
                    res.append(s.charAt(j));

                }
                num = num>>1;
                j--;
            }
            System.out.println(res.reverse().toString());
        }
    }


}

