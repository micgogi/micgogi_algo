package LCSeptChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Micgogi
 * on 9/7/2020  3:07 PM
 * Rahul Gogyani
 */
public class LC290 {
    public static void main(String args[]) {
       String pattern = "abba";
       String str = "dog cat cat fish";
       HashMap<String,Integer> map = new HashMap<>();
       String stri[] = str.split(" ");
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6);
       //use Integer
        //for more details https://stackoverflow.com/questions/3130311/weird-integer-boxing-in-java
        for (Integer i = 0; i < stri.length ; i++) {
            if(!map.containsKey(""+pattern.charAt(i))){
                map.put(""+pattern.charAt(i),i);
            }
            if(!map.containsKey(stri[i])){
                map.put(stri[i],i);
            }
            if(map.get(""+pattern.charAt(i))!=map.get(stri[i])){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

}

