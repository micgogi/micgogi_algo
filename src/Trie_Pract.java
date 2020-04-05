import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Micgogi
 * on 4/5/2020  2:43 PM
 * Rahul Gogyani
 */
public class Trie_Pract {
    private TrieNode root;
    public static class TrieNode{
        char val;
        boolean isWord;
        TrieNode[] children = new TrieNode[26];
        public TrieNode(){

        }
        public TrieNode(char c){
            this.val = c;
        }
    }


  public Trie_Pract(){
        root = new TrieNode();
        root.val = ' ';
  }

  public void insert(String word){
        TrieNode node = root;
      for (int i = 0; i <word.length() ; i++) {
        if(node.children[word.charAt(i)-'a']==null){
            node.children[word.charAt(i)-'a']= new TrieNode(word.charAt(i));

        }
        node = node .children[word.charAt(i)-'a'];
      }
      node.isWord = true;
  }

  public boolean search(String word){
        TrieNode node = root;
      for (int i = 0; i < word.length() ; i++) {
          if(node.children[word.charAt(i)-'a']==null){
              return false;
          }
          node = node.children[word.charAt(i)-'a'];
      }
      return node.isWord;
  }

  public boolean startsWith(String prefix){
        TrieNode node = root;
      for (int i = 0; i <prefix.length() ; i++) {
          if(node.children[prefix.charAt(i)-'a']==null){
              return false;

          }
          node = node.children[prefix.charAt(i)-'a'];

      }
      return true;
  }

    public static void main(String[] args) {
      Trie_Pract trie = new Trie_Pract();
      trie.insert("rahul");
        System.out.println( trie.search("rahul"));
        System.out.println( trie.startsWith("an"));
    }

}
