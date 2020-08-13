import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/13/2020  6:04 PM
 * Rahul Gogyani
 */
public class C1389 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            String s = sc.nextLine();
            int[] freq = new int[10];
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 48]++;
            }
            Arrays.sort(freq);
            int ans = s.length() - freq[freq.length - 1];
            int len = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    char x = (char) (i + '0');
                    char y = (char) (j + '0');
                    int temp = 0;
                    ;
                    boolean flag = true;
                    for (int k = 0; k < s.length(); k++) {
                        if (s.charAt(k) == x && flag) {
                            flag = !flag;
                        } else if (s.charAt(k) == y && !flag) {
                            temp = temp + 2;
                            flag = !flag;
                        }
                    }
                    if (s.length() - temp < ans) {
                        ans = s.length() - temp;
                    }
                }

            }
            System.out.println(ans);
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

