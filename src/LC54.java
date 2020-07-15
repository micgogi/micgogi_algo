import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/15/2020  10:14 AM
 * Rahul Gogyani
 */
public class LC54 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int a[][] = {{1, 2, 3,4},
                {5, 6, 7,8},
                {9, 10, 11,12}};
        List<Integer> list = new ArrayList<>();
        int rowBegin = 0;
        int endRow = a.length - 1;
        int colBegin = 0;
        int endCol = a[0].length - 1;
        while (rowBegin <= endRow && colBegin <= endCol) {
            for (int i = colBegin; i <=endCol ; i++) {
                list.add(a[rowBegin][i]);
            }
            rowBegin++;
            for (int i = rowBegin; i <=endRow ; i++) {
                list.add(a[i][endCol]);
            }
            endCol--;
            if(rowBegin<=endRow) {
                for (int i = endCol; i >= colBegin; i--) {
                    list.add(a[endRow][i]);
                }
            }
            endRow--;
            if(colBegin<=endCol) {
                for (int i = endRow; i >= rowBegin; i--) {
                    list.add(a[i][colBegin]);

                }
            }
            colBegin++;
        }
        System.out.println(list);
        
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

