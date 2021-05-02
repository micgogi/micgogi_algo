package LC21MayChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 5/2/2021  1:56 PM
 * Rahul Gogyani
 */
public class LC745 {
    class TrieNode{
        TrieNode[] children;
        int weight;
        public TrieNode(){
            children = new TrieNode[27];
            weight = 0;
        }
    }
    TrieNode root;

    public static void main(String args[]) {
        LC745 lc = new LC745(new String[]{"apple"});
        System.out.println(lc.f("a","e"));
    }

    public LC745(String[] words){
        root = new TrieNode();
        for (int i = 0; i < words.length ; i++) {
            String word = "{"+words[i];
            for (int j = 0; j <word.length() ; j++) {
                insert(root,word.substring(j+1)+word,i);
            }
        }
    }
    public void insert(TrieNode root, String word, int weight){
        TrieNode cur = root;
        for (char c:word.toCharArray()){
            int k = c-'a';
            if(cur.children[k]==null){
                cur.children[k] = new TrieNode();

            }
            cur = cur.children[k];
            cur.weight = weight;
        }
    }
    public int f(String prefix, String suffix) {
        TrieNode cur = root;
        for (char c : (suffix+'{'+prefix).toCharArray()){
            if(cur.children[c-'a']==null){
                return -1;
            }
            cur = cur.children[c-'a'];
        }
        return cur.weight;
    }

}

