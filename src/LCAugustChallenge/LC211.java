package LCAugustChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Micgogi
 * on 8/5/2020  12:32 PM
 * Rahul Gogyani
 */
public class LC211 {
    public static void main(String args[]) {
        LC211 lc = new LC211();
        lc.addWord("bad");
        lc.addWord("dad");
        lc.addWord("mad");
        System.out.println(lc.map);
        System.out.println(lc.search("bad"));
        System.out.println(lc.search(".ad"));
        System.out.println(lc.search("ANK"));
    }

    /** Initialize your data structure here. */
   Map<Integer, List<String>> map;
    public LC211() {
      map = new HashMap<>();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
       if(word.length()>0){
           if (!map.containsKey(word.length())) {
               map.put(word.length(), new ArrayList<>());
           }
           map.get(word.length()).add(word);
       }
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        if(word.length()<1)return false;
        boolean found = false;
        if (map.containsKey(word.length())){
            List<String> list = map.get(word.length());
            for(int i=0;i<list.size();i++){
                String s = list.get(i);
                for (int j = 0; j < s.length(); j++) {
                    if(word.charAt(j)==s.charAt(j)||word.charAt(j)=='.'){
                        found = true;
                    }else{
                        found = false;
                        break;
                    }
                }
                if(found)return true;
            }
        }
        return found;


    }
}

