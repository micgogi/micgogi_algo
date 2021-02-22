package LCFeb21Challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Micgogi
 * on 2/22/2021  8:39 PM
 * Rahul Gogyani
 */
public class LC524 {
    public static void main(String args[]) {
        String s = "abpcplea";
        List<String> d = Arrays.asList("ale", "apple", "monkey", "plea");
        System.out.println(findLongestWord(s,d));
    }
    public static String findLongestWord(String s, List<String> d) {
//        HashSet<String> set = new HashSet<>(d);
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < (1<<s.length()) ; i++) {
//            String temp = "";
//            for (int j = 0; j < s.length() ; j++) {
//                if(((i>>j)&1)!=0){
//                    temp+=s.charAt(j);
//                }
//            }
//            list.add(temp);
//        }
//        String max = "";
//        for (String str:list){
//            if(set.contains(str)){
//                if(str.length()>max.length() || (str.length()==max.length()&& str.compareTo(max)<0)){
//                    max = str;
//                }
//            }
//        }
//        return max;
        Collections.sort(d, (a, b) -> a.length() != b.length() ? -Integer.compare(a.length(), b.length()) :  a.compareTo(b));
        System.out.println(d);
        for (String dictWord : d) {
            int i = 0;
            for (char c : s.toCharArray())
                if (i < dictWord.length() && c == dictWord.charAt(i)) i++;
            if (i == dictWord.length()) return dictWord;
        }
        return "";
    }

}

