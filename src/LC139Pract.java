import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/24/2020  10:55 AM
 * Rahul Gogyani
 */
public class LC139Pract {
    public static void main(String args[]) {
        String s = "leetcode";
        String[] dict = {"leet","code"};
        boolean T[] = new boolean[s.length()+1];
        Set<String> set = new HashSet<>();
        for (String w : dict){
            set.add(w);
        }
        T[0] = true;
        for (int i = 0; i <=s.length() ; i++) {
            for (int j = 0; j <i ; j++) {
                if(T[j]&&set.contains(s.substring(j,i))){
                    T[i] = true;
                    break;
                }
            }
        }
        System.out.println(T[s.length()]);
    }
}

