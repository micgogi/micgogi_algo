import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/6/2020  2:02 PM
 * Rahul Gogyani
 */
public class A263 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a[][] = new int[5][5];
            for (int i = 0; i <5 ; i++) {
                String s[] = br.readLine().split(" ");
                for (int j = 0; j <5 ; j++) {
                    a[i][j]=Integer.parseInt(s[j]);
                }
            }
            int row = 0, col = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    if (a[i][j] == 1) {
                        row = i;
                        col = j;
                    }
                }
            }
            System.out.println(Math.abs(2 - row) + Math.abs(2 - col));
        }catch (Exception e){

        }
    }
}
