class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        
        if(s.isEmpty())return 0;
        int n = s.length();
        int a = 0;
        int b = 0;
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (; a < n; a++) {
            if (map.containsKey(s.charAt(a))) {
               
                b = Math.max(b,map.get(s.charAt(a))+1);
             
            }
            map.put(s.charAt(a), a);
             ans = Math.max(ans, a - b + 1);
        }
        return ans;
    }
    
    
  
}

//abcabcbb
//
