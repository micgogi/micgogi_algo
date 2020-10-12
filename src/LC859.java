import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 10/12/2020  12:53 PM
 * Rahul Gogyani
 */
public class LC859 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        String A = sc.next();
        String B = sc.next();
        System.out.println(buddyStrings(A,B));
    }

    public static boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length())return false;
        if(A.equals(B)){
            int[] count = new int[26];
            for(int i=0;i<A.length();i++){
                count[A.charAt(i)-'a']++;
            }
            for(int c: count){
                if(c>1)return true;
            }
            return false;
        }else{
            int first = -1;
            int second = -1;
            for(int i=0;i<A.length();i++){
                if(A.charAt(i)!=B.charAt(i)){
                    if(first == -1){
                        first = i;
                    }
                    else if(second == -1){
                        second = i;
                    }
                    else{
                        return false;
                    }
                }
            }
            return (second != -1 && A.charAt(first) == B.charAt(second)
                    && A.charAt(second) == B.charAt(first));
        }
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

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[][] read2DArray(int n) {
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }

        int[][] read2DArray(int n, int m) {
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }
    }

}

