import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Micgogi
 * on 11/18/2019  2:17 AM
 * 65 78 75 73 84 65
 */
public class Test {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            String demo = "";
            Map<Character, Integer> map = new HashMap<>();
            int si=0,ci=0,max=0;

            for (; ci <s.length() ; ci++) {
                if(map.containsKey(s.charAt(ci))){
                    si=Math.max(si,map.get(s.charAt(ci))+1);

                }
                map.put(s.charAt(ci),ci);
                max = Math.max(max,ci-si+1);
            }
            System.out.println(max);
        } catch (Exception e) {

        }
    }
}
