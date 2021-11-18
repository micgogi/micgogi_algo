import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 11/18/2021  12:10 PM
 * Rahul Gogyani
 */
public class LC17Pract1 {
    public static void main(String args[]) {
        System.out.println(new LC17Pract1().letterCombinations("23"));
    }

    public List<String> letterCombinations(String digits) {
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        List<String> ans = new ArrayList<>();
        backtrack(ans,digits,map,"",0);
        return ans;

    }
    public static void backtrack(List<String> ans,String digits,Map<Integer,String> map,String curr,int index){
        if(index==digits.length()){
            ans.add(curr);
            return;
        }
        String s = map.get(digits.charAt(index)-'0');
        for (int i = 0; i <s.length() ; i++) {
            backtrack(ans,digits,map,curr+s.charAt(i),index+1);
        }
    }
}

