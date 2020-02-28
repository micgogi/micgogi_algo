import java.util.HashMap;

/**
 * @author Micgogi
 * on 2/28/2020  10:18 PM
 * Micgogi
 */
public class LC771 {
    public static void main(String[] args) {
        String J = "aA";
        String s = "aAAbbbb";
        int count1=0;
        for (int i = 0; i <s.length() ; i++) {
            if(J.indexOf(s.charAt(i))>-1){
                count1++;
            }
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        int count = 0;
        for (int i = 0; i < J.length(); i++) {

            if (map.containsKey(J.charAt(i))) {
                count += map.get(J.charAt(i));
            }
        }
        System.out.println(count);
    }
}
