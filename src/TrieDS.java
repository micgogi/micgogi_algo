import java.util.ArrayList;
import java.util.List;

/**
 * @author Micgogi
 * on 5/12/2020  6:09 PM
 * Rahul Gogyani
 */
public class TrieDS {
    public static void main(String[] args) {
        List<String> setOfStrings = new ArrayList<>();
        setOfStrings.add("pqrs");
        setOfStrings.add("pprt");
        setOfStrings.add("psst");
        setOfStrings.add("qqrs");
        setOfStrings.add("pqrs");
        Trie1 trie = new Trie1();
        setOfStrings.forEach(trie::insert);
        System.out.println(trie.search("psst"));
        trie.delete("psst");
        System.out.println(trie.search("psst"));
    }
}

class Trie1{
    TrieNode1 root;
    public Trie1(){
        this.root = new TrieNode1();
    }
    public void delete(String s){
        TrieNode1 current = root;
        for (int i = 0; i < s.length(); i++) {
            if(current==null){
                throw new RuntimeException();
            }
            current = current.next(s.charAt(i));
        }
        if(current.terminating!=0){
            current.terminating--;
        }else{
            throw new RuntimeException();
        }
    }
    public int search(String s){
        TrieNode1 current = root;
        for (int i = 0; i <s.length() ; i++) {
            if(current==null||current.next(s.charAt(i))==null){
                return 0;
            }
            current = current.next(s.charAt(i));
        }
        return current.terminating;

    }
    public void insert(String s){
        TrieNode1 current = root;
        for (int i = 0; i <s.length() ; i++) {
          if(current.trieNode1[s.charAt(i)-'a']==null){
              current.trieNode1[s.charAt(i)-'a']= new TrieNode1();
          }
          current = current.next(s.charAt(i));
        }
        current.terminating++;
    }
}
class TrieNode1{
    int terminating;
    TrieNode1[] trieNode1 = new TrieNode1[26];
    public TrieNode1 next(char c){
        return trieNode1[c-'a'];
    }
}