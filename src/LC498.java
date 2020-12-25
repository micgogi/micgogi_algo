import java.util.Arrays;

/**
 * @author Micgogi
 * on 12/25/2020  3:30 PM
 * Rahul Gogyani
 */
public class LC498 {
    public static void main(String args[]) {
        int[][] a = {{65, 78, 75, 73, 84, 65},
                {65, 78, 75, 73, 84, 65},
                {65, 78, 75, 73, 84, 65},
                {65, 78, 75, 73, 84, 65},
                {65, 78, 75, 73, 84, 65},
                {65, 78, 75, 73, 84, 65}};
        System.out.println(Arrays.toString(findDiagonal(a)));
    }

    public static int[] findDiagonal(int a[][]) {
        if (a == null || a.length == 0) return new int[0];

        int m = a.length;
        int n = a[0].length;
        int row = 0, col = 0, d = 1;
        int[] res = new int[m * n];
        for (int i = 0; i < m * n; i++) {
            res[i] = a[row][col];
            row-=d;
            col+=d;
            if(row>=m){
                row = m-1;
                col+=2;
                d=-d;
            }
            if(col>=n){
                col = n-1;
                row+=2;
                d=-d;

            }
            if(row<0){
                row=0;
                d=-d;

            }
            if(col <0){
                col=0;
                d =-d;
            }

        }
        return res;
    }
}

