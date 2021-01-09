package LCJan21Challenge;

import java.util.*;

/**
 * @author Micgogi
 * on 7/29/2020  10:48 AM
 * Rahul Gogyani
 */
public class LC127 {
    public static void main(String args[]) {
        List<String> wordList = Arrays.asList(new String[]{"hot","dot","dog","lot","log","cog"});
        String beginWord = "hit";
        String endWord = "cog";
        System.out.println(ladderLength(beginWord,endWord,wordList));

    }
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        for (int len = 1; !q.isEmpty() ; len++) {
            for (int i = q.size(); i >0 ; i--) {
                String word = q.poll();
                if(word.equals(endWord))return len;
                for (int j = 0; j < word.length(); j++) {
                    char[] ch = word.toCharArray();
                    for (char c = 'a'; c<='z' ; c++) {
                        if(c==word.charAt(j))continue;
                        ch[j] = c;
                        String newWord = String.valueOf(ch);
                        if (set.contains(newWord)&&visited.add(newWord)){
                            q.offer(newWord);
                        }
                    }
                }
            }
        }
        return 0;
    }


}

