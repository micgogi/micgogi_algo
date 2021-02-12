public class LC32 {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int ans[] = new int[n];
        int max = 0;
        for(int i=n-2;i>=0;i--){
            if(s.charAt(i) == ')')
                continue;
            if(s.charAt(i+1) == ')'){
                int x = 2;
                if(i+2<n){
                    x += ans[i+2];
                }
                ans[i] = x;
                if(max<ans[i])
                    max = ans[i];
            }
            else{
                int index = i + ans[i+1] + 1;
                int x = 0;
                if(index>=n || s.charAt(index) == '(')
                    continue;
                ans[i] = ans[i+1] + 2;
                if(index+1<n)
                    ans[i] += ans[index+1];
                if(max<ans[i])
                    max = ans[i];
            }
        }
        return max;
    }
}
