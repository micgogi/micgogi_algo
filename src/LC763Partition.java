import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/11/2021  7:28 PM
 * Rahul Gogyani
 */
public class LC763Partition {
    public static void main(String args[]) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }

    public static List<Integer> partitionLabels(String s){
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length() ; i++) {
            lastIndex[s.charAt(i)-'a'] = i;
        }
        System.out.println(Arrays.toString(lastIndex));
        int nextIndex = 0;
        int j =0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <s.length(); i++) {
            j =Math.max(j,lastIndex[s.charAt(i)-'a']);
            if(i==j){
                ans.add(i-nextIndex+1);
                nextIndex = i+1;
            }
        }
        return ans;
    }
}

