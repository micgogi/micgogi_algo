import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/10/2020  11:30 AM
 * Rahul Gogyani
 */
public class LC1081 {
    public static void main(String args[]) {
        System.out.println(smallestSubsequence("cdadabcc"));

    }
    public static String smallestSubsequence(String text) {
        Stack<Integer> stack = new Stack<>();
        int last[] = new int[26];
        int seen[] = new int[26];
        for (int i = 0; i <text.length() ; i++) {
            last[text.charAt(i)-'a'] = i;
        }
        for (int i = 0; i < text.length(); i++) {
            int c = text.charAt(i) - 'a';
            if(seen[c]++ > 0)continue;
            while (!stack.isEmpty()&&stack.peek()>c&&i<last[stack.peek()]){
                seen[stack.pop()] = 0;
            }
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i : stack) sb.append((char)('a'+i));
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
    }

}

