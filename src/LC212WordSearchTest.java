import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/20/2021  8:22 PM
 * Rahul Gogyani
 */
public class LC212WordSearchTest {
    static TrieNode root;

    static class TrieNode {
        char c;
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
        String word;

        public TrieNode() {

        }

        public TrieNode(char c) {
            this.c = c;
        }
    }

    public static void main(String args[]) {
        root = new TrieNode(' ');
        List<String> result = new ArrayList<>();
        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        char[][] board = {{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        String[] words = {"oath", "pea", "eat", "rain"};
        for (String word : words) {
            buildTrie(word);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                dfs(i, j, board, words, dir, result, root);
            }
        }
        System.out.println(result);
    }

    public static void dfs(int i, int j, char[][] board, String[] words, int[][] dir, List<String> result, TrieNode root) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '#' || root.children[board[i][j] - 'a'] == null) {
            return;
        }
        if (root.children[board[i][j] - 'a'].isEnd && root.children[board[i][j] - 'a'].word != null) {
            result.add(root.children[board[i][j] - 'a'].word);
            root.children[board[i][j] - 'a'].word = null;

            ;
        }
        char temp = board[i][j];
        board[i][j] = '#';
        for (int k = 0; k < dir.length; k++) {
            dfs(i + dir[k][0], j + dir[k][1], board, words, dir, result, root.children[temp - 'a']);
        }
        board[i][j] = temp;


    }

    public static void buildTrie(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.children[word.charAt(i) - 'a'] == null) {
                node.children[word.charAt(i) - 'a'] = new TrieNode(word.charAt(i));
            }
            node = node.children[word.charAt(i) - 'a'];
        }
        node.isEnd = true;
        node.word = word;
    }


}

