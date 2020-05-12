import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/12/2020  7:21 PM
 * Rahul Gogyani
 */
public class HET1 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int q = Integer.parseInt(s[1]);
            Trie2 trie2 = new Trie2();
            while(n--!=0){
                String s1[] = br.readLine().split( " ");
                trie2.insert(s1[0],Integer.parseInt(s1[1]));
            }
            while(q--!=0){
                System.out.println(trie2.search(br.readLine()));
            }
        }catch (Exception e){

        }
    }
}

class Trie2{
    TrieNode2 root;
    public Trie2(){
        this.root = new TrieNode2();
    }
    public void insert(String s, int weight){
        TrieNode2 current = root;
        for (int i = 0; i <s.length() ; i++) {
            if(current.trieNode2s[s.charAt(i)-'a']==null){
                current.trieNode2s[s.charAt(i)-'a']= new TrieNode2();
                if(weight>current.priority) current.priority = weight;
                System.out.println(current.priority);

            }

            current = current.next(s.charAt(i));
        }
        current.terminating++;
    }
    public int search(String s){
        TrieNode2 current = root;
        for (int i = 0; i <s.length() ; i++) {
            if(current==null||current.next(s.charAt(i))==null){
                return -1;
            }
            current = current.next(s.charAt(i));


        }
        return current.priority;

    }
}

class TrieNode2{
    int terminating;
    int priority;
    TrieNode2 trieNode2s[] = new TrieNode2[26];
    public TrieNode2 next(char c){
        return trieNode2s[c-'a'];
    }
}
