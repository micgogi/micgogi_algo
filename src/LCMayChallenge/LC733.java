package LCMayChallenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 5/11/2020  1:51 PM
 * Rahul Gogyani
 */
public class LC733 {
    public static void main(String[] args) {
        int a[][] = {{1,1,1},{1,1,0},{1,0,1}};
        int sr=1;
        int sc =1;
        int color=a[sr][sc];
        int newColor = 2;
        dfs(a,sr,sc,newColor,color);
        System.out.println(Arrays.deepToString(a));

    }
    public static void dfs(int a[][], int i, int j, int newColor,int color){
        if(i<0||j<0||i>=a.length||j>=a[i].length||a[i][j]==newColor){
            return;
        }
        if(a[i][j]==color){
            a[i][j] = newColor;
            dfs(a,i+1,j,newColor,color);
            dfs(a,i,j+1,newColor,color);
            dfs(a,i-1,j,newColor,color);
            dfs(a,i,j-1,newColor,color);
        }
    }
}
