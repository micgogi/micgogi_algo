package LCAugustChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * @author Micgogi
 * on 8/14/2020  12:34 PM
 * Rahul Gogyani
 */
public class LC409 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        String s = "bb";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        Map<Character,Integer> map = new TreeMap<>();
        for (Character c: s.toCharArray()){
            map.putIfAbsent(c,0);
            map.put(c,map.get(c)+1);
        }
        Character mid = null;
        StringBuilder left = new StringBuilder();
        for (Character key:map.keySet()){
            if(map.get(key)%2==1){
                mid = key;
            }
            for (int i = 0; i <map.get(key)/2 ; i++) {
                left.append(key);
            }
        }
        String right = left.reverse().toString();

        String ans = left.toString()+(mid!=null?mid:"")+right;
        System.out.println(ans);
        return ans.length();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in), 32768);
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}

