import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Micgogi
 * on 6/5/2020  11:33 AM
 * Rahul Gogyani
 */
public class LC1048 {
    public static void main(String[] args) {
        String s[] = {"a","it","nk","a","ikna","an"};
        Arrays.sort(s,(a,b)->a.length()-b.length());
        Map<String,Integer> dp =  new HashMap<>();
        int max=1;
        for(String cur: s){
            dp.put(cur,1);
            for (int i = 0; i <cur.length(); i++) {
                String pre = cur.substring(0,i)+cur.substring(i+1);
                if(dp.containsKey(pre)&&dp.get(pre)+1>dp.get(cur)){
                    dp.put(cur,dp.get(pre)+1);
                    max = Math.max(max,dp.get(cur));
                }
            }
        }
        System.out.println(max);
    }
}
