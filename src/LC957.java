import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/3/2020  1:35 PM
 * Rahul Gogyani
 */
public class LC957 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int a[] = new int[8];
            for (int i = 0; i <8 ; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(prisonAfterNDays(a,n)));
        }
    }
    public static int[] prisonAfterNDays(int[] cells, int N) {
       N=N%14==0?14:N%14;

      while (N>0){
            int temp[] = new int[8];


            for (int j = 1; j <7 ; j++) {

                if(cells[j-1]==cells[j+1]){
                    temp[j] = 1;
                }else{
                    temp[j] = 0;
                }
            }
            temp[0]=0;
            temp[7]=0;
            cells = temp;

        }

        return cells;
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
