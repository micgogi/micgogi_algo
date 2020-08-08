import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 8/8/2020  11:42 AM
 * Rahul Gogyani
 */
public class LC648 {
   static class TrieNode {
        char c;
        TrieNode[] children;
        boolean isword;

        public TrieNode(char c) {
            this.c = c;
            this.children = new TrieNode[26];
            this.isword = false;

        }
    }

    public static void main(String args[]) {
        List<String> dict = Arrays.asList("cat","bat","rat");
        String sentence = "the cattle was rattled by the battery";
        String[] words = sentence.split(" ");
        TrieNode root = construct(dict);
        System.out.println(rePlaceword(words,root));

    }





    public static String rePlaceword(String[] words, TrieNode root){
        StringBuilder sb = new StringBuilder();
        for (String word: words){
            sb.append(getShortestWord(word,root));
            sb.append(" ");
        }
        return sb.toString().substring(0,words.length-1);
    }
    public static String getShortestWord(String word, TrieNode root){
        TrieNode temp = root;
        StringBuilder sb = new StringBuilder();
        for (char c: word.toCharArray()){
            sb.append(c);
            if(temp.children[c-'a']!=null){
                if(temp.children[c-'a'].isword){
                    return sb.toString();
                }
                temp = temp.children[c-'a'];
            }else{
                return word;
            }

        }
        return word;
    }
    public static TrieNode construct(List<String> dict){
        TrieNode root = new TrieNode(' ');
        for (String word: dict){
            TrieNode temp = root;
            for (char c: word.toCharArray()){
                if(temp.children[c-'a']==null){
                    temp.children[c-'a'] = new TrieNode(c);
                }
                temp = temp.children[c-'a'];
            }
            temp.isword =true;
        }
        return root;
    }
}

