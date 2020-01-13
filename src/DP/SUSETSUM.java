package DP;

/**
 * @author Micgogi
 * on 1/13/2020  11:55 PM
 * Micgogi
 */
public class SUSETSUM {
    public static void main(String[] args) {
        int a[] = {2,3,7,8,10};
        int sum =14;
        System.out.println(isSubset(a,sum));
    }
    public static boolean isSubset(int a[], int sum){
        boolean b[][] = new boolean[a.length+1][sum+1];
        for (int i = 0; i <a.length ; i++) {
            b[i][0]=true;
        }
        for (int i = 1; i <=a.length ; i++) {
            for (int j = 1; j <=sum; j++) {
                if(j-a[i-1]>=0){
                    b[i][j]=b[i-1][j]||b[i-1][j-a[i-1]];
                }else {
                    b[i][j]=b[i-1][j];
                }
            }
        }
        return b[a.length][sum];



    }
}
