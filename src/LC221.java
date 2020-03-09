/**
 * @author Micgogi
 * on 3/9/2020  8:42 PM
 * Rahul Gogyani
 */
public class LC221 {
    public static void main(String[] args) {
        char c[][] = {{'1','0','1','0','0'}};
        int a[][] = new int[c.length][c[0].length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                a[i][j] = Integer.parseInt(String.valueOf(c[i][j]));
            }
        }
        int res[][] = new int[a.length][a[0].length];
        int max = 0;
        for (int i = 0; i <a.length ; i++) {
            res[i][0]=a[i][0];
            if (res[i][0] == 1)
            {
                max = 1;
            }

        }
        for (int j= 0; j<a[0].length ; j++) {
            res[0][j]=a[0][j];
            if (res[0][j] == 1)
            {
                max = 1;
            }
        }
        for (int i = 1; i <a.length ; i++) {
            for (int j = 1; j <a[0].length ; j++) {
                if(a[i][j]==0){
                    continue;
                }
                int t = Math.min(res[i-1][j],Math.min(res[i-1][j-1],res[i][j-1]));
                res[i][j]=t+1;
                if(res[i][j]>max){
                    max = res[i][j];
                }
            }
        }

        System.out.println(max*max);
    }
}
