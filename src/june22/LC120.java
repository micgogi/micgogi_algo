class Solution {
    public int minimumTotal(List<List<Integer>> list) {
        int dp[][] = new int[list.size()][list.size()];
       List<Integer> last = list.get(list.size()-1);
        for (int i = 0; i <last.size() ; i++) {
            dp[list.size()-1][i]=last.get(i);
        }
        for (int i = list.size()-2; i >=0 ; i--) {
            List<Integer> row = list.get(i);
            for (int j = 0; j < row.size(); j++) {

                int current = row.get(j);
               dp[i][j] = current+Math.min( dp[i+1][j],dp[i+1][j+1]);
                
            }
        }
      return dp[0][0];
    }
}
