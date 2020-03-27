public class Knapsack01 {
    public static void main(String[] args) {
        int val[] = {1,2,3};
        int wts[] = {2,1,3};
        int wt=2;
        int t[][] = new int[val.length+1][wt+1];
        for (int i = 0; i <= val.length; i++) {
            for (int j = 0; j <=wt ; j++) {
                if(i==0||j==0){
                    t[i][j]=0;
                    continue;
                }
                if(j-wts[i-1]>=0){
                    t[i][j]=Math.max(t[i-1][j],t[i-1][j-wts[i-1]]+val[i-1]);
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        System.out.println(t[val.length][wt]);

    }
}
