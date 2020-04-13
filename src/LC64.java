import java.util.Arrays;

/**
 * @author Micgogi
 * on 4/13/2020  11:19 AM
 * Rahul Gogyani
 */
public class LC64 {
    public static void main(String[] args) {
        int a[][] = {{1,3,1},{1,5,1},{4,2,1}};

        for (int i = 1; i <a.length ; i++) {
            a[i][0]=a[i][0]+a[i-1][0];
        }
        for (int i = 1; i <a[0].length ; i++) {
            a[0][i]=a[0][i]+a[0][i-1];

        }


        for (int i = 1; i <a.length ; i++) {
            for (int j = 1; j <a[i].length ; j++) {
                a[i][j]=a[i][j]+Math.min(a[i-1][j],a[i][j-1]);
            }
        }

        System.out.println(Arrays.deepToString(a));
    }
}
