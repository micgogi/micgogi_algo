import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 7/2/2020  5:47 PM
 * Rahul Gogyani
 */
public class D1371 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t-- != 0) {
                String s[] = br.readLine().split(" ");
                int n = Integer.parseInt(s[0]);
                int k = Integer.parseInt(s[1]);
                if(k%n==0){
                    System.out.println(0);
                }else{
                    System.out.println(2);
                }
                int grid[][] = new int[n][n];
                for (int i = 0;k!=0 &&i <n ; i++) {
                    for (int j = 0;k!=0&& j <n ; j++) {
                        grid[j][(i+j)%n] =1;
                        k--;
                    }
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(grid[i][j]);
                    }
                    System.out.println();
                }

            }
        } catch (Exception e) {

        }
    }
}
