import java.util.ArrayList;
import java.util.List;

public class TrieDataStructure {
    public static void main(String[] args) {
        List<String> setOfStrings = new ArrayList<>();
        setOfStrings.add("pqrs");
        setOfStrings.add("pprt");
        setOfStrings.add("psst");
        setOfStrings.add("qqrs");
        setOfStrings.add("pqrs");
        Trie trie = new Trie();
        setOfStrings.forEach(trie::insert);
       System.out.println(trie.search("ps"));
        trie.delete("psst");
       System.out.println(trie.search("psst"));
    }

}

class Trie{
    TrieNode root;
    public Trie(){
        this.root = new TrieNode();

    }
    public void delete(String s){
        TrieNode current= root;
        for (int i = 0; i < s.length() ; i++) {
            if(current==null){
                throw  new RuntimeException();
            }
           current= current.next(s.charAt(i));
        }
        if(current.terminating!=0){
            current.terminating--;
       }else{
            throw new RuntimeException();
        }
    }
    public int search(String s){
        TrieNode current = root;
        for (int i = 0; i < s.length()  ; i++) {
            if(current==null||current.next(s.charAt(i))==null){
                return 0;
            }
                current=current.next(s.charAt(i));
        }
        return current.terminating;
    }
    public void insert(String s){
        TrieNode current =root;
        for (int i = 0; i < s.length(); i++) {
            if(current.trieNodes[s.charAt(i)-'a']==null){
                current.trieNodes[s.charAt(i)-'a']= new TrieNode();
            }
            current=current.next(s.charAt(i));
        }
        current.terminating++;
    }
}
class TrieNode{
    int terminating;
    TrieNode[] trieNodes = new TrieNode[26];
    public TrieNode next (char c){
        return trieNodes[c-'a'];
    }
}
