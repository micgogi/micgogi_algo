import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Micgogi
 * on 6/19/2020  2:23 PM
 * Rahul Gogyani
 * based on rabin-karp pattern matching algorithm
 * https://www.youtube.com/watch?v=qQ8vS2btsxI
 * https://www.youtube.com/watch?v=H4VrKHVG5qI
 * rolling hash
 */

//
//
public class LC1044 {
    public static String longestDuplicateSubstring(String s){
        if( s==null){
            return  null;

        }
        int  min =0;
        int max = s.length()-1;
        int mid;
        while(min<max-1){
            mid = (min+max)/2;
            if(searchForLength(s,mid)!=null){
                min = mid;
            }else{
                max = mid-1;
            }
        }
        String str =  searchForLength(s,max);
        if(str!=null){
            return str;
        }
        else {
            return searchForLength(s,min);
        }

    }

    public static String searchForLength(String s, int len){
        if(len==0){
            return "";

        } else if(len>=s.length()){
            return  null;
        }
        Map<Long, List<Integer>> map  = new HashMap<>();
        long p = (1<<31)-1;
        long base = 256; // mod for rolling hash
        long hash = 0;
        for (int i = 0; i <len ; i++) {
            hash = (hash*base+s.charAt(i))%p;
        }
        long mul =1;
        for (int i =1; i <len; i++) {
            mul = (mul*base)%p;
        }
        List<Integer> equalHashIndex = new ArrayList<>();
        equalHashIndex.add(0);
        map.put(hash,equalHashIndex);
        int from =0 ;
        int to = len;
        while (to<s.length()){
            //rolling hash
            hash = ((hash+p-mul*s.charAt(from++)%p)*base+s.charAt(to++))%p;
            equalHashIndex = map.get(hash);
            if(equalHashIndex == null){
                equalHashIndex = new ArrayList<>();
                map.put(hash,equalHashIndex);
            }else {
                for (int i:equalHashIndex){
                    if(s.substring(from,to).equals(s.substring(i,i+len))){
                        return s.substring(i,i+len);
                    }
                }
            }
            equalHashIndex.add(from);
        }
        return null;

    }
    public static void main(String[] args) {
        String s = "kiananata";
        System.out.println(longestDuplicateSubstring(s));
    }

}
