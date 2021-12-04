import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 12/4/2021  10:15 AM
 * Rahul Gogyani
 */
public class LC127Test {
    public static void main(String args[]) {
        System.out.println(new LC127Test().ladderLength("hit","cog",Arrays.asList("hot","dot","dog","lot","log","cog")));
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList){
        Set<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord))return 0;
        int d = 0;
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        while (!q.isEmpty()){
            int size = q.size();
            while (size--!=0){
                String word = q.poll();
                if(word.equals(endWord))return d+1;
                for (int i = 0; i <word.length() ; i++) {
                    char[] ch =word.toCharArray();

                    for (char j = 'a'; j <='z' ; j++) {
                        ch[i] = j;
                        if(j==word.charAt(i))continue;
                        String newWord = String.valueOf(ch);
                        if(set.contains(newWord)){
                            q.add(newWord);
                            set.remove(newWord);
                        }

                    }
                }
            }
            d++;
        }
        return 0;
    }
}

