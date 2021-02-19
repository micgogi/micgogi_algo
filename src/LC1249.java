import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 2/19/2021  7:45 PM
 * Rahul Gogyani
 */
public class LC1249 {
    public static void main(String args[]) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t--!=0){

            System.out.println(minRemoveToMakeValid(fr.next()));
        }
    }
    //"a)b(c)d"
    public static String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)=='('){
                stack.push(sb.charAt(i));
            }
            else if(sb.charAt(i)==')'){
                if(!stack.isEmpty()){
                    stack.pop();

                }else{
                    sb.deleteCharAt(i);
                    i--;
                }
            }
        }

        Stack<Character> stack2 = new Stack<>();
        for (int i = sb.length()-1; i >=0 ; i--) {
            if(sb.charAt(i)==')'){
                stack2.push(sb.charAt(i));
            }else if(sb.charAt(i)=='('){
                if(!stack2.isEmpty()){
                    stack2.pop();
                }else{
                    sb.deleteCharAt(i);

                }
            }
        }
        return sb.toString();
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

