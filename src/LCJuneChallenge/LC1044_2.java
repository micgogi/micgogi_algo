package LCJuneChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Micgogi
 * on 6/21/2020  10:50 AM
 * Rahul Gogyani
 */
public class LC1044_2 {
    public static final int PRIME = 10000001;
    static ArrayList<Integer> power;

    public static void main(String[] args) {
        String s = "banana";
         System.out.println(longestDupSubString(s));
        System.out.println(s.substring(1, 4));
    }

    public static String rabinkarp(String s, int len) {
        if (len == 0) {
            return "";
        }
        int n = s.length();
        int curr = 0;
        HashMap<Integer, List<Integer>> hash = new HashMap<>();
        for (int i = 0; i < len; i++) {
            curr = (curr * 26 + (s.charAt(i) - 'a')) % PRIME;
        }
        List<Integer> list = new ArrayList();
        list.add(0);
        hash.put(curr, list);
        for (int i = len; i < n; i++) {
            curr = ((curr - power.get(len - 1) * (s.charAt(i - len) - 'a')) % PRIME + PRIME) % PRIME;
            curr = (curr * 26 + (s.charAt(i) - 'a')) % PRIME;
            list = hash.get(curr);
            if (list == null) {
                list = new ArrayList();
                list.add(i - len + 1);
                hash.put(curr, list);
            } else {
                for (int index : hash.get(curr)) {
                    String str = s.substring(i-len+1,i+len);
                    if (s.substring(index, len).equals(str)) {
                        return s.substring(index, len);
                    }


                }
                list.add(i - len + 1);
                hash.put(curr, list);
            }


        }
        return "";
    }

    public static String longestDupSubString(String s) {
        int n = s.length();
        int l = 0;
        int r = n - 1;
        power = new ArrayList<>();
        power.add(1);
        for (int i = 1; i < n; i++) {

            power.add((power.get(i - 1) * 26) % PRIME);
        }
        String res = "";
        while (l <= r) {
            int mid = l + (r - l) / 2;
            String curr = rabinkarp(s, mid);
            if (curr.length() > res.length()) {
                res = curr;
                l = mid - 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }
}
