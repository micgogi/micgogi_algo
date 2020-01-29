package DP;/*
 *@author Rahul Gogyani
 *
 * 11:31 AM 1/28/2020
 */

public class LCSDPTS {
    public static void main(String[] args) {
        String s1 = "RAHUL";
        String s2 = "RAH";
        String s3 = "RAHUA";
        System.out.println(
                lcs(s1.toCharArray(),s2.toCharArray(),s3.toCharArray())
        );

    }
    public static  int lcs(char s1[] ,char s2[], char s3[]  ){
        int m = s1.length;
        int n = s2.length;
        int k = s3.length;
        int l[][][] = new int[m+1][n+1][k+1];
        for (int i = 0; i <=m ; i++) {
            for (int j = 0; j <=n ; j++) {
                for (int o = 0; o <=k ; o++) {
                    if(i==0||j==0||o==0){
                        l[i][j][o]=0;
                    }else if(s1[i-1]==s2[j-1]&&s2[j-1]==s3[o-1]){
                        l[i][j][o]=l[i-1][j-1][o-1]+1;
                    }else{
                        l[i][j][o]=Math.max(l[i-1][j][o],Math.max(l[i][j-1][k],l[i][j][o-1]));
                    }
                }
            }
        }
        return l[m][n][k];
    }
}
