import java.util.*;

/**
 * @author Micgogi
 * on 3/22/2021  7:43 PM
 * Rahul Gogyani
 */
public class LC966 {
    public static void main(String args[]) {
        LC966 lc966 = new LC966();
        String ans[] =lc966.spellchecker(new String[]{"KiTe", "kite", "hare", "Hare"}, new String[]{"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"});
        System.out.println(Arrays.toString(ans));
    }

    Set<String> set;
    Map<String, String> capMap;
    Map<String, String> vowelMap;

    public String[] spellchecker(String[] wordlist, String[] queries) {
        this.set = new HashSet<>(Arrays.asList(wordlist));
        this.capMap = new HashMap<>();
        this.vowelMap = new HashMap<>();
        for (String word : wordlist) {
            capMap.putIfAbsent(word.toLowerCase(), word);
            vowelMap.putIfAbsent(word.replaceAll("[aeiou]", "*"), word);
        }

        for (int i = 0; i < queries.length; i++) {
            if (set.contains(queries[i])) continue;
            String vowel = queries[i].replaceAll("[aeiou]", "*");
            if (capMap.containsKey(queries[i].toLowerCase())) {
                queries[i] = capMap.get(queries[i].toLowerCase());
            } else if (vowelMap.containsKey(vowel)) {
                queries[i] = vowelMap.get(vowel);
            } else {
                queries[i] = "";
            }
        }
        return queries;
    }
}

