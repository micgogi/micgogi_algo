import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Micgogi
 * on 4/26/2020  11:22 AM
 * Rahul Gogyani
 */
public class LC48 {
    public static void main(String[] args) {
        int a[][]= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(a);



    }

    public static void rotate(int a[][]){
        int n = a.length;
        for (int i = 0; i <n/2; i++) {
            for (int j = i; j <n-1-i ; j++) {
                int temp =a[i][j];
                a[i][j]=a[n-1-j][i];
                a[n-1-j][i]=a[n-1-i][n-1-j];
                a[n-1-i][n-1-j]=a[j][n-1-i];
                a[j][n-1-i]=temp;
            }
        }

        System.out.println(Arrays.deepToString(a));
    }
}
