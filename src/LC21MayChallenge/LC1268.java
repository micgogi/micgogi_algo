package LC21MayChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 5/31/2021  7:23 PM
 * Rahul Gogyani
 */
public class LC1268 {
    TrieNode root, curr;

    class TrieNode {
        boolean isWord;
        TrieNode[] children;

        public TrieNode() {
            this.isWord = false;
            this.children = new TrieNode[26];
        }

    }
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        root = new TrieNode();
        for (String w: products){
            insert(w);
        }
        String pre = "";
        for (char c: searchWord.toCharArray()){
            pre+=c;
            res.add(getListOfWordStartingWith(pre));
        }
        return res;
    }


    void dfsWithPrefix(TrieNode curr, String word) {
        if (startingWith.size() == 3)
            return;
        if (curr.isWord)
            startingWith.add(word);


        for (char c = 'a'; c <= 'z'; c++)
            if (curr.children[c - 'a'] != null)
                dfsWithPrefix(curr.children[c - 'a'], word + c);
    }

    List<String> startingWith;

    public List<String> getListOfWordStartingWith(String prefix) {
        curr = root;
        startingWith = new ArrayList<>();
        for (char c: prefix.toCharArray()){
            if(curr.children[c-'a']==null){
                return startingWith;
            }
           curr= curr.children[c-'a'];
        }
        dfsWithPrefix(curr,prefix);
        return startingWith;

    }

    public void insert(String w) {
        curr = root;
        for (char c : w.toCharArray()) {
            if (curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new TrieNode();
            }
            curr = curr.children[c - 'a'];
        }
        curr.isWord = true;
    }

    public static void main(String args[]) {
       String[] s = {"bags","baggage","banner","box","cloths"};
       String searchWord = "bags";
       LC1268 lc = new LC1268();
        System.out.println(lc.suggestedProducts(s,searchWord));
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

