import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/26/2020  4:10 PM
 * Rahul Gogyani
 */
public class LC766 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
//       int matrix[][]= {{1,2,3,4},
//               {5,1,2,3},
//               {9,5,1,2}};
        int matrix[][] = {{1,2},{2,2}};
       int rowLen = matrix.length;
       int colLen = matrix[0].length;
       boolean colFlag = false;
        for (int i = 0; i <colLen ; i++) {
            int start = matrix[0][i];
            int k =i;
            for (int j = 0;k<colLen&& j <rowLen; j++) {
                if(start==matrix[j][k]){
                    colFlag = true;

                }else{
                    colFlag = false;
                    break;
                }
                k++;
            }

        }
        System.out.println(colFlag);
        boolean rowFlag = false;
        for (int i = 0; i <rowLen ; i++) {
            int start = matrix[i][0];
            int k =i;
            for (int j = 0; j <colLen&&k<rowLen ; j++) {
                if(start==matrix[k][j]){
                    rowFlag = true;

                }else{
                    colFlag = false;
                    break;
                }
                k++;
            }
        }
        System.out.println(rowFlag);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in), 32768);
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}

