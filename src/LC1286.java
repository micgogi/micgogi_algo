import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/13/2020  12:44 PM
 * Rahul Gogyani
 */
public class LC1286 {
    List<String> combinationsList = new ArrayList<>();

    public LC1286(String characters, int combinationLength) {
        permutations(characters, 0, combinationLength, combinationsList, new StringBuilder());
    }

    public static void permutations(String character, int start, int combinationLength, List<String> combinationsList, StringBuilder sb) {
        for (int i = start; i <= character.length() - combinationLength; i++) {
            if (combinationLength == 0) {
                combinationsList.add(sb.toString());
                return;
            }
            sb.append(character.charAt(i));
            permutations(character, i + 1, combinationLength - 1, combinationsList, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public String next() {
        return combinationsList.remove(0);
    }

    public boolean hasNext() {
        return combinationsList.size()>0;
    }

    public static void main(String args[]) {
        LC1286 lc = new LC1286("kinaat", 2);

        System.out.println(lc.combinationsList);
        System.out.println(lc.next());
        System.out.println(lc.hasNext());
        System.out.println(lc.next());
        System.out.println(lc.hasNext());
        System.out.println(lc.next());
        System.out.println(lc.hasNext());
        System.out.println(lc.hasNext());
        System.out.println(lc.next());
        System.out.println(lc.hasNext());
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

