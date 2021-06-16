package June21Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 6/16/2021  6:50 PM
 * Rahul Gogyani
 */
public class LC22 {
    public static void main(String args[]) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateAll(new char[2*n],0,ans);
        return ans;
    }
    public static void generateAll(char[] current, int index, List<String> ans){
        if(index==current.length){
            if(isValid(current)){
                ans.add(new String(current));
            }
        }else{
            current[index]='(';
            generateAll(current,index+1,ans);
            current[index]=')';
            generateAll(current,index+1,ans);

        }
    }
    public static boolean isValid(char[] seq){
        int balance =0;
        for (char c: seq){
            if(c=='c')balance++;
            else balance--;
            if(balance<0)return false;
        }
        return true;
    }
}

