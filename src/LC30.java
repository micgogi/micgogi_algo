import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC30 {
    public List<Integer> findSubstring(String s, String[] words) {
        HashMap<String, Integer> dict = new HashMap<>();
        for (String w: words) {
            dict.put(w, dict.getOrDefault(w, 0) + 1);
        }
        List<Integer> indexes = new ArrayList<>();
        int n = words.length, len = words[0].length();
        for (int i = 0; i < len; i++) {
            int left = i, right = i + len;
            HashMap<String, Integer> visit = new HashMap<>();
            
            while (left < s.length() && right <= s.length()) {
                String check = s.substring(right - len, right);
                visit.put(check, visit.getOrDefault(check, 0) + 1);
                
                if (!dict.containsKey(check)) {
                    visit.clear();
                    left = right;
                    right += len;
                } else if (dict.get(check) < visit.get(check)) {
                    String first = s.substring(left, left + len);
                    visit.put(first, visit.get(first) - 1);
                    visit.put(check, visit.get(check) - 1);
                    left += len;
                } else {
                    if (right - left == n * len) {
                        indexes.add(left);
                        String first = s.substring(left, left + len);
                        visit.put(first, visit.get(first) - 1);
                        left += len;
                    }
                    right += len;
                }
            }
        }
        return indexes;
    }
}
