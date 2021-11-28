import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/28/2021  12:31 PM
 * Rahul Gogyani
 */
public class LC696Test {
    public static void main(String[] args) {
        System.out.println(new LC696Test().binaryString("1101"));
        System.out.println(new LC696Test().binaryString1("1101"));
    }
    public int binaryString(String s){
        int[] grp = new int[s.length()];
        grp[0] =1;
        int t =0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1)!=s.charAt(i)){
                grp[++t] = 1;
            }else{
                grp[t]++;

            }
        }
        System.out.println(Arrays.toString(grp));
        int ans =0;
        for (int i = 1; i <s.length() ; i++) {
            ans+=Math.min(grp[i],grp[i-1]);
        }
        return  ans;
    }
    //another way
    public int binaryString1(String s){
        int prev = 0,current =1;
        int ans = 0;
        for (int i = 1; i <s.length() ; i++) {
            if(s.charAt(i-1)!=s.charAt(i)) {
                ans += Math.min(prev, current);
                prev = current;
                current=1;
            }else{
                current++;
            }
        }
        return ans+Math.min(prev,current);
    }


}

