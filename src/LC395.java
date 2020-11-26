

/**
 * @author Micgogi
 * on 11/26/2020  6:30 PM
 * Rahul Gogyani
 */
public class LC395 {
    public static void main(String args[]) {
        System.out.println(longestSubstring("efwiymsiaakint",2));
    }

    public static int longestSubstring(String s, int k) {
        return longestSubStringUtil(s, 0, s.length(), k);
    }

    public static int longestSubStringUtil(String s, int start, int end, int k) {
        if (end < k) return 0;
        int count[] = new int[26];
        for (int i = start; i < end; i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int mid = start; mid < end; mid++) {
            if (count[s.charAt(mid) - 'a'] >= k) continue;
            int midNext = mid + 1;
            while (midNext < end && count[s.charAt(midNext) - 'a'] < k) midNext++;
            return Math.max(longestSubStringUtil(s, start, mid, k),
                    longestSubStringUtil(s, midNext, end, k));
        }
        return end - start;
    }

}

