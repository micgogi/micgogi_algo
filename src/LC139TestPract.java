import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/19/2021  6:01 PM
 * Rahul Gogyani
 */
public class LC139TestPract {
    static TrieNode root;

    static class TrieNode {
        char c;
       TrieNode[] children = new TrieNode[26];
        boolean isWord;

        public TrieNode() {

        }

        public TrieNode(char c) {
            this.c = c;
        }
    }

    public static boolean wordBreak(String s, String[] wordDict) {
        for(String word:wordDict){
            buildTrie(word);
        }
        boolean seen[] = new boolean[s.length()+1];
        seen[0]= true;
        for (int i = 1; i <=s.length() ; i++) {
            TrieNode node = root;
            for (int j = i; node!=null &&j <=s.length() ; j++) {
                char c= s.charAt(j-1);
                node = node.children[c-'a'];
                if(node!=null && node.isWord && seen[i-1]){
                    seen[j] = true;
                }
            }
        }
        return seen[s.length()];
    }

    public static void main(String args[]) {
        root = new TrieNode(' ');
        String s = "leetcode";
        String[] wordDict = {"leet", "cod"};
        System.out.println(wordBreak(s, wordDict));





    }

    public static void buildTrie(String word) {
       TrieNode node = root;
        for (int i = 0; i <word.length() ; i++) {
            if(node.children[word.charAt(i)-'a']==null){
                node.children[word.charAt(i)-'a']= new TrieNode(word.charAt(i));
            }
            node=node.children[word.charAt(i)-'a'];
        }
        node.isWord = true;
    }


}

