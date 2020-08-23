import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/23/2020  3:48 PM
 * Rahul Gogyani
 */
public class LC1032 {
    static class TrieNode {
        char val;
        boolean isWord;
        TrieNode[] children = new TrieNode[26];

        public TrieNode() {
        }

        ;

        public TrieNode(char c) {
            this.val = c;
        }
    }

    TrieNode root = new TrieNode(' ');
    StringBuilder sb = new StringBuilder();

    public void constructTrie(String[] words) {
        for (String word : words) {
            TrieNode node = root;
            for (int i = word.length() - 1; i >= 0; i--) {
                char c = word.charAt(i);
                if (node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TrieNode(c);
                }
                node = node.children[c - 'a'];
            }
            node.isWord = true;
        }
    }

    public LC1032(String[] words) {
        constructTrie(words);
    }

    public boolean query(char letter) {
        sb.append(letter);
        TrieNode node = root;
        for (int i = sb.length() - 1; i >= 0 && node != null; i--) {

            node = node.children[sb.charAt(i) - 'a'];
            if (node != null && node.isWord) {
                return true;
            }

        }
        return false;

    }

    public static void main(String args[]) {
        FastReader sc = new FastReader();
        //int t = sc.nextInt();
        String words[] = {"n", "kin", "ank", "tai"};
        LC1032 lc1032 = new LC1032(words);
        System.out.println(lc1032.query('n'));
        System.out.println(lc1032.query('k'));
        System.out.println(lc1032.query('i'));
        System.out.println(lc1032.query('n'));
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

