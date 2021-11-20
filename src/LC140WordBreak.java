import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/**
 * @author Micgogi
 * on 7/30/2020  7:52 PM
 * Rahul Gogyani
 */
public class LC140WordBreak {
    public static void main(String args[]) {
        String s = "catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        System.out.println(wordBreak(s,wordDict));

    }

    public static List<String> wordBreak(String s, List<String> wordDict) {
        HashMap<String,List<String>> dp = new HashMap<>();
        List<String> an = helper(s,wordDict,dp);
        System.out.println(dp);
        return an;

    }
    public static List<String> helper(String s, List<String> wordDict, HashMap<String,List<String>> dp){
        List<String> result = new ArrayList<>();
        if(dp.containsKey(s)){
            return dp.get(s);
        }

        if(s.length()==0){
            result.add("");
            return result;
        }
        for (String word: wordDict){
            if(s.startsWith(word)){
                String sub = s.substring(word.length());
                List<String> subStrings = helper(sub,wordDict,dp);
                for (String subString: subStrings){
                    String sapce = subString.isEmpty()?"":" ";
                    result.add(word+sapce+subString);
                }
            }

        }
        dp.put(s,result);
        return result;
    }

}

