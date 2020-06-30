package LCJuneChallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Micgogi
 * on 6/30/2020  12:49 PM
 * Rahul Gogyani
 */
public class LC212 {
    List<String> result;
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public static void main(String[] args) {
        char[][] boards = {
                {'o','a','t','h'},
                {'e','t','a','e'},
                {'i','h','k','r'},
                {'i','f','l','v'}};
        String words[] = {"oath","pea","eat","rain"};
        LC212 lc = new LC212();
        System.out.println(lc.findWords(boards,words));

    }
    public List<String> findWords(char[][] board, String[] words) {
        result = new ArrayList<>();
        TrieNode root = buildTrie(words);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (root.children[board[i][j] - 'a'] != null) {
                    dfs(i, j, root.children[board[i][j] - 'a'], board);
                }
            }
        }
        return result;
    }

    public void dfs(int i, int j, TrieNode root, char[][] board) {
        if (root.word != null && root.word.length() > 0) {
            result.add(root.word);
            root.word = null;
        }

        char temp = board[i][j];
        board[i][j] = '#';
        for (int[] dir : directions) {
            int x = i + dir[0];
            int y = j + dir[1];
            if(x >= 0 && x < board.length && y >= 0 && y < board[x].length &&
                    board[x][y] != '#' && root.children[board[x][y] - 'a'] != null){
                dfs(x, y, root.children[board[x][y] - 'a'], board);
            }
        }
        board[i][j]=temp;
    }

    public  TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode current = root;
            for (char ch : word.toCharArray()) {
                if (current.children[ch - 'a'] == null) {
                    current.children[ch - 'a'] = new TrieNode();
                }
                current = current.children[ch - 'a'];
            }
            current.word = word;
        }
        return root;
    }

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word = new String();
    }
}
