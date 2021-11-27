import java.util.*;

/**
 * @author Micgogi
 * on 11/27/2021  1:56 PM
 * Rahul Gogyani
 */
public class WordBreak2Test {
    public static void main(String args[]) {
        System.out.println(new WordBreak2Test().wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog")));
    }

    public List<String> wordBreak(String s, List<String> wordDict) {
        System.out.println(backTracK(s, new HashSet<>(wordDict)));
        System.out.println(map);
        return backTracK(s, new HashSet<>(wordDict));
    }

    Map<String, List<String>> map = new HashMap<>();

    public List<String> backTracK(String s, Set<String> worddict) {
        List<String> res = new ArrayList<>();
        if (s.length() == 0) {
            res.add("");
            return res;
        }
        if (map.containsKey(s)) {
            return map.get(s);
        }
        for(String word:worddict){
            if(s.startsWith(word)){
                List<String> words = backTracK(s.substring(word.length()),worddict);
                for (String w:words){
                    String space = word.length()==0?"":" ";
                    res.add(word+space+w);
                }
            }
        }
        map.put(s,res);
        return res;

    }
}

