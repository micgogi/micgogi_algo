import java.util.ArrayList;
import java.util.List;

/**
 * @author Micgogi
 * on 4/14/2020  4:06 PM
 * Rahul Gogyani
 */
public class LC131 {
    public static void main(String[] args) {
        String s = "657875738465";
        System.out.println(partition(s));
    }

    public static List<List<String>> partition(String s){
        List<List<String>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(),s,0);
        return list;
    }

    public static void backtrack(List<List<String>> list, List<String> tempList, String s, int start){
        if(start==s.length()){
            list.add(new ArrayList<>(tempList));
        }else{
            for (int i = start; i <s.length() ; i++) {
                if(isPalindrome(s,start,i)){
                    tempList.add(s.substring(start,i+1));
                    backtrack(list,tempList,s,i+1);
                    tempList.remove(tempList.size()-1);
                }
            }
        }

    }
    public static boolean isPalindrome(String s , int low, int high){
        while(low<high)
            if(s.charAt(low++)!=s.charAt(high--))return false;
        return true;
    }
}
