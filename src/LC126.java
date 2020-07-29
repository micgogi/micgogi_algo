import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 7/29/2020  11:20 AM
 * Rahul Gogyani
 */
public class LC126 {
    public static void main(String args[]) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList(new String[]{"hot","dot","dog","lot","log","cog"});
        System.out.println(findLadders(beginWord,endWord,wordList));
        if('A'==65){
            System.out.println("Yes");
        }

    }
    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        List<List<String>> res = new ArrayList<>();

        return res;
    }

}

