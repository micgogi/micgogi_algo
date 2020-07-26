import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/26/2020  12:16 PM
 * Rahul Gogyani
 */
public class LC640 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        String eq = sc.nextLine();
        System.out.println(solveEq(eq));


    }

    public static String solveEq(String eq) {
        String[] parts = eq.split("=");
        String left = parts[0];
        String right = parts[1];
        int[] leftval = evaluate(left);
        int[] rightval = evaluate(right);
        int countX = leftval[0] - rightval[0];
        int countNum = leftval[1] - rightval[1];
        if (countX == 0) {
            if (countNum != 0) {
                return "No solution";
            }
            return "Infinite solutions";
        }
        int valX = (-countNum) / countX;
        StringBuilder sb = new StringBuilder();
        sb.append("x=").append(valX);
        return sb.toString();

    }

    private static int[] evaluate(String eq) {
        int[] results = new int[2];
        String[] eqElements = eq.split("(?=[-+])");
        for (String eqEle : eqElements) {
            if (eqEle.equals("+x") || eqEle.equals("x")) {
                results[0]++;
            } else if (eqEle.equals("-x")) {
                results[0]--;
            } else if (eqEle.contains("x")) {
                results[0] += Integer.parseInt(eqEle.substring(0, eqEle.indexOf("x")));
            } else {
                results[1] += Integer.parseInt(eqEle);
            }
        }
        return results;
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

