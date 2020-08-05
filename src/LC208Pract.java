import com.sun.org.apache.xml.internal.utils.Trie;
import javafx.scene.transform.Scale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 8/5/2020  2:25 PM
 * Rahul Gogyani
 */
public class LC208Pract {
    static TrieNode root;

    class TrieNode {
        char c;
        TrieNode children[] = new TrieNode[26];
        boolean isWord;

        public TrieNode() {

        }

        public TrieNode(char c) {
            this.c = c;
        }


    }

    public LC208Pract() {
        root = new TrieNode();
        root.c = ' ';
    }

    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.children[word.charAt(i) - 'a'] == null) {
                node.children[word.charAt(i) - 'a'] = new TrieNode(word.charAt(i));
            }
            node = node.children[word.charAt(i) - 'a'];
        }
        node.isWord = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.children[word.charAt(i) - 'a'] == null) return false;
            node = node.children[word.charAt(i)-'a'];
        }
        return node.isWord;
    }
    public boolean startsWith(String prefix){
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            if(node.children[prefix.charAt(i)-'a']==null){
                return false;
            }
            node = node.children[prefix.charAt(i)-'a'];
        }
        return true;
    }

    public static void main(String args[]) {
        LC208 lc = new LC208();
        lc.insert("kinata");
        lc.insert("micgogi");
        assert lc.search("kinata");
        //assert lc.search("cefmfem");
        assert lc.startsWith("ki");
    }

}

