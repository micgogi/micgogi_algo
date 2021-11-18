import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/18/2021  4:44 PM
 * Rahul Gogyani
 */
public class LC202Trie {
    TrieNode root;

    class TrieNode {
        char c;
        boolean isWord;
        TrieNode[] childres = new TrieNode[26];

        public TrieNode() {

        }

        public TrieNode(char c) {
            this.c = c;
        }
    }

    public LC202Trie() {
        root = new TrieNode();
        root.c = ' ';
    }

    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.childres[word.charAt(i) - 'a'] == null) {
                node.childres[word.charAt(i) - 'a'] = new TrieNode(word.charAt(i));
            }
            node = node.childres[word.charAt(i) - 'a'];
        }
        node.isWord = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.childres[word.charAt(i) - 'a'] == null) return false;
            node = node.childres[word.charAt(i) - 'a'];
        }
        return node.isWord;
    }

    public boolean startWith(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.childres[word.charAt(i) - 'a'] == null) return false;
            node = node.childres[word.charAt(i) - 'a'];
        }
        return true;
    }

    public static void main(String args[]) {
        LC202Trie lc202Trie = new LC202Trie();
        lc202Trie.insert("apple");

        System.out.println(lc202Trie.search("app"));

    }


}

