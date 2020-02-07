/*
 *@author Rahul Gogyani
 *
 * 4:18 PM 2/7/2020
 */

public class LC62 {
    public static void main(String[] args) {
        int m =51,n=9;
        System.out.println(num(m,n));
    }
    
    //Using Dp O(m*n)
    public static int num(int m, int n){
     int count[][] = new int[m][n];
        for (int i = 0; i <m ; i++) {
            count[i][0]=1;
        }
        for (int i = 0; i <n ; i++) {
            count[0][i]=1;
        }
        for (int i = 1; i <m ; i++) {
            for (int j = 1; j <n ; j++) {
                count[i][j]=count[i-1][j]+count[i][j-1];
            }
        }
        return count[m-1][n-1];
    }
    //Using Recurive, complexity exponentially 
    public int numr(int m, int n){
      if(m==1||n==1)return 1;
      return num(m-1,n)+num(m,n-1);
    }
    
}
