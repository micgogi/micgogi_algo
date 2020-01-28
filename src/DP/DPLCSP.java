package DP;/*
 *@author Rahul Gogyani
 * 
 * 11:20 AM 1/28/2020
 */

public class DPLCSP {
    public static void main(String[] args) {
        String s1 = "RAHUL";
        String s2 = "RAHUK";
        //System.out.println(lcs(s1.toCharArray(),s2.toCharArray()));
        lcs(s1.toCharArray(),s2.toCharArray());

    }
    public  static void lcs(char s1[], char s2[]){
        int m = s1.length;
        int n = s2.length;
        int l[][] = new int[m+1][n+1];
        for (int i = 0; i <=m ; i++) {
            for (int j = 0; j <=n ; j++) {
                if(i==0||j==0){
                    l[i][j]=0;
                }else if(s1[i-1]==s2[j-1]){
                    l[i][j]=l[i-1][j-1]+1;
                }else{
                    l[i][j]=Math.max(l[i-1][j],l[i][j-1]);
                }
            }

        }
       StringBuilder sb = new StringBuilder();
        int i =m;
        int j =n;
        while(i>0&&j>0){
            if(s1[i-1]==s2[j-1]){
                sb.append(""+s1[i-1]);
                i--;
                j--;

            }
            else  if(l[i-1][j]>l[i][j-1]){
                i--;
            }else{
                j--;
            }
        }
        System.out.println(sb.reverse().toString());
    }
}
