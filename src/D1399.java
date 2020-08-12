import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/12/2020  2:55 PM
 * Rahul Gogyani
 */
public class D1399 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int ans[] = new int[n];
            String s = sc.nextLine();
            Stack<Integer> stackZero = new Stack<>();
            Stack<Integer> stackOne = new Stack<>();
            int count = 1;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    if (stackOne.isEmpty()) {
                        stackZero.push(count);
                        ans[i] = count;
                        count++;
                    } else {
                        int k = stackOne.pop();
                        ans[i] = k;
                        stackZero.push(k);
                    }
                } else {
                    if (stackZero.isEmpty()) {
                        stackOne.push(count);
                        ans[i] = count;
                        count++;
                    } else {
                        int k = stackZero.pop();
                        ans[i] = k;
                        stackOne.push(k);
                    }
                }
            }
            System.out.println(count-1);
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i]+" ");
            }
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
    }

}

