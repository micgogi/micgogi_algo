class Solution {
    public int longestStrChain(String[] words) {
         Arrays.sort(words,(a,b)-> a.length() -b.length());
        //System.out.println(Arrays.toString(words));
        int ans =0;
        Map<String, Integer> dp = new HashMap<>();
        for (String word: words){
            int max =0;
            for (int i = 0; i < word.length(); i++) {
                String prev = word.substring(0,i)+ word.substring(i+1);
                max = Math.max(max, dp.getOrDefault(prev,0)+1);
            }
            dp.put(word,max);
            ans = Math.max(ans,max);
        }
        
        return ans;
    }
}
