package June21Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Micgogi
 * on 6/13/2021  3:14 PM
 * Rahul Gogyani
 */
public class LC336 {
    static class TrieNode {
        TrieNode[] children;
        int index;
        List<Integer> list;

        public TrieNode() {
            children = new TrieNode[26];
            index = -1;
            list = new ArrayList<>();
        }
    }

    public static void addWord(TrieNode root, String word, int index) {
        for (int i = word.length() - 1; i >= 0; i--) {
            int j = word.charAt(i) - 'a';
            if (root.children[j] == null) {
                root.children[j] = new TrieNode();
            }
            if (checkPalindrome(word, 0, i)) {
                root.list.add(index);
            }
            root = root.children[j];
        }
        root.list.add(index);
        root.index = index;
    }

    public static void search(String[] words, int i, TrieNode root, List<List<Integer>> res) {
        for (int j = 0; j < words[i].length(); j++) {
            if (root.index > -1 && root.index != i && checkPalindrome(words[i], j, words[i].length() - 1)) {
                res.add(Arrays.asList(i, root.index));
            }
            root = root.children[words[i].charAt(j) - 'a'];
            if (root == null) return;
        }
        for (int j : root.list) {
            if (i == j) continue;
            res.add(Arrays.asList(i, j));
        }
    }

    public static void main(String args[]) {
         System.out.println(palindromePairs(new String[]{"abcd","dcba","lls","s","sssll"}));
    }

    public static List<List<Integer>> palindromePairs(String[] words) {
//        List<List<Integer>> ans = new ArrayList<>();
//        for (int i = 0; i < words.length; i++) {
//            for (int j = 0; j < words.length ; j++) {
//                if(i!=j){
//                    String s = words[i]+words[j];
//                    if(checkPalindrome(s)){
//                        List<Integer> sList = new ArrayList<>();
//                        sList.add(i);
//                        sList.add(j);
//                        ans.add(sList);
//                    }
//                }
//            }
//        }
//        return ans;

        List<List<Integer>> res = new ArrayList<>();

        TrieNode root = new TrieNode();

        for (int i = 0; i < words.length; i++) {
            addWord(root, words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            search(words, i, root, res);
        }

        return res;
    }


    public static boolean checkPalindrome(String s, int i, int j) {

        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}

