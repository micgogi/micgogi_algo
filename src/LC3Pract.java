import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/10/2021  6:08 PM
 * Rahul Gogyani
 */
public class LC3Pract {
    public static void main(String args[]) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s){
        int n = s.length();
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        int ci =0,si=0;
        for(;ci<n;ci++){
            if(map.containsKey(s.charAt(ci))){
                si=Math.max(si,map.get(s.charAt(ci))+1);
            }

            map.put(s.charAt(ci),ci);
            ans=Math.max(ans,ci-si+1);
        }
        return ans;
    }
}

