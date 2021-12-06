import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/6/2021  6:52 PM
 * Rahul Gogyani
 */
public class LC212Test {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word;
    }

    public static void main(String args[]) {
//        System.out.println(new LC212Test().findWords(new char[][]{{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}},
//                new String[]{"oath", "pea", "eat", "rain"}));
        System.out.println(new LC212Test().findWords(new char[][]{{'a','a'}},new String[]{"aa"}));

    }

    public TrieNode buildTrie(String[] words){
        TrieNode root = new TrieNode();
        for (String word:words){
            TrieNode temp = root;
            for (int i = 0; i <word.length() ; i++) {
                if(temp.children[word.charAt(i)-'a']==null){
                    temp.children[word.charAt(i)-'a'] = new TrieNode();
                }
                temp= temp.children[word.charAt(i)-'a'];
            }
            temp.word = word;
        }
        return root;
    }

    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = buildTrie(words);
        List<String> ans  = new ArrayList<>();
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                dfs(board,i,j,root,ans);
            }
        }
        return ans;
    }
    int[][] dir = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    public void dfs(char[][] board, int i, int j,TrieNode root, List<String> ans){
        if(i<0||i>=board.length||j<0||j>=board[i].length)return;
        char c = board[i][j];
        if(c=='*'||root.children[c-'a']==null)return;
        if(root.children[c-'a'].word!=null){
            ans.add(root.children[c-'a'].word);
            root.children[c-'a'].word=null;
        }
        board[i][j]='*';
        for (int k = 0; k <dir.length ; k++) {
            dfs(board,i+dir[k][0],j+dir[k][1],root.children[c-'a'],ans);
        }
        board[i][j]=c;

    }
}

