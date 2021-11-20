

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
  * @author Micgogi
  * on 11/20/2021  2:20 PM
  * Rahul Gogyani
  */
public class LC140Test {
    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        System.out.println(new LC140Test().DFS(s, wordDict,new HashMap<>()));
    }
    public List<String>  DFS(String s, List<String> wordDict, Map<String,List<String>> dp) {
        List<String> result = new ArrayList<>();
        if(dp.containsKey(s)) return dp.get(s);

        if(s.length()==0){
            result.add("");
            return result;
        }

        for(String word:wordDict){
            if(s.startsWith(word)){
                List<String> subwords = DFS(s.substring(word.length()),wordDict,dp);
                for (String w:subwords){
                    String space = w.length()==0?"":" ";
                    result.add(word+space+w);
                }
            }
        }
        dp.put(s,result);
        return result;
    }
}

