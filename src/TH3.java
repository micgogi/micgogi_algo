import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/1/2020  1:13 PM
 * Rahul Gogyani
 */
public class TH3 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String inputs[] = br.readLine().split(" ");
            int N = Integer.parseInt(inputs[0]);
            int X = Integer.parseInt(inputs[1]);
            int Y = Integer.parseInt(inputs[2]);
            int Z = Integer.parseInt(inputs[3]);
            int T = Integer.parseInt(inputs[4]);
            String[] matrixElements = br.readLine().split(" ");
            long[] matrixEle = new long[matrixElements.length];
            for (int i = 0; i <matrixEle.length ; i++) {
                matrixEle[i] = Long.parseLong(matrixElements[i]);
            }

            long ans = 0;
            long M[][] = new long[N][N];
            for (int i = 0; i <N ; i++) {
                for (int j = 0; j <N ; j++) {
                    M[i][j] = matrixEle[i]&matrixEle[j];
                }
            }
            int row = X-1;
            int col = Y-1;
            int rowEnd = Z-1;
            int colEnd = T-1;
            for (int i = row; i <=rowEnd ; i++) {
                for (int j = col; j <=colEnd ; j++) {
                    ans= ans^M[i][j];
                }
            }
            System.out.println(ans);

        } catch (Exception e) {

        }
    }


}

