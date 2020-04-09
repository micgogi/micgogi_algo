import java.util.Arrays;

/**
 * @author Micgogi
 * on 4/9/2020  11:01 AM
 * Rahul Gogyani
 */
public class LC62_Pract {
    public static void main(String[] args) {
    int m = 3;
    int n = 2;
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
//        int a[] = new int[5];
//        for (int i = 0; i <5 ; i++) {
//            a[i]=i;
//        }
//        System.out.println(Arrays.toString(Arrays.copyOfRange(a,2,6)));
        System.out.println(count[m-1][n-1]);
    }
}
