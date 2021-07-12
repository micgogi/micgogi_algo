package july21challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/12/2021  8:06 PM
 * Rahul Gogyani
 */
public class LC205 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";




    }
    public boolean isIsmorohic(String s, String t){
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(hashMap.containsKey(s.charAt(i))){
                if(!hashMap.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }

            if(hashMap.containsValue(t.charAt(i))&&!hashMap.containsKey(s.charAt(i))){
                return false;
            }
            hashMap.put(s.charAt(i),t.charAt(i));
        }

        return true;
    }
}

