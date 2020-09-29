package LCSeptChallenge;

import java.util.*;

/**
 * @author Micgogi
 * on 4/24/2020  10:37 AM
 * Rahul Gogyani
 */
public class LC139 {
    public static void main(String[] args) {
        System.out.println(wordBreak("leetcode",new ArrayList<>(
                Arrays.asList(new String[]{"leet","code"}))));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] T = new boolean[s.length()+1];
        Set<String> set = new HashSet<>();
        for (String w: wordDict){
            set.add(w);
        }
        T[0]=true;
        for (int i = 0; i <=s.length() ; i++) {
            for (int j = 0; j <i ; j++) {
                if (T[j]&&set.contains(s.substring(j,i))) {
                    T[i]=true;
                    break;
                }
            }
        }
        return T[s.length()];
    }

}
