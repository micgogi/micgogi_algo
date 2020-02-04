public class DP2 {
    public static void main(String[] args) {
        System.out.println(lps("abbbc"));
    }
    static int lps(String s) {
        int n = s.length();
        boolean t[][] = new boolean[n][n];
        int maxlength =0;
        for (int i = 0; i <n ; i++) {
            t[i][i]=true;
        }
        maxlength = 1;
        int strat =0;
        for (int i = 0; i <n-1 ; i++) {
            if(s.charAt(i)==s.charAt(i+1)){
                maxlength = 2;
                 strat=i;
                 t[i][i+1]=true;

            }
        }

        for (int k = 3; k<=n ; k++) {

            for (int i = 0; i <n-k+1 ; i++) {
                int j = i+k-1;
                if(t[i+1][j-1]&&s.charAt(i)==s.charAt(j)){
                    t[i][j]=true;
                    if(k>maxlength){
                        maxlength=k;
                        strat=i;
                    }
                }
            }

        }
        //System.out.println(strat);
        System.out.println(s.substring(strat,strat+maxlength));
        return maxlength;

    }
}


