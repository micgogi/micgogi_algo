import java.util.Arrays;

/**
 * @author Micgogi
 * on 4/20/2020  10:07 AM
 * Rahul Gogyani
 */
public class LC73 {
    public static void main(String[] args) {
        int a[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        boolean isZeroCol = false;
        boolean isZeroRow = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i][0] == 0) {
                isZeroCol = true;
                break;
            }
        }
        for (int i = 0; i < a[0].length; i++) {
            if (a[0][i] == 0) {
                isZeroRow = true;
                break;
            }
        }

        for (int i = 1; i <a.length ; i++) {
            for (int j = 1; j <a[0].length ; j++) {
                if(a[i][j]==0){
                    a[i][0]=0;
                    a[0][j]=0;
                }
            }
        }
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[0].length; j++)
                if (a[i][0] == 0 || a[0][j] == 0)
                    a[i][j] = 0;
        }
        if(isZeroCol){
            for (int i = 0; i <a.length ; i++) {
                a[i][0]=0;
            }
        }
        if(isZeroRow){
            for (int i = 0; i <a[0].length ; i++) {
                a[0][i]=0;
            }
        }

        System.out.println(Arrays.deepToString(a));
    }
}
