import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author Micgogi
 * on 3/22/2020  11:24 AM
 * Rahul Gogyani
 */
public class WTest2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int t= Integer.parseInt(s);
        while(t--!=0){
            String s1 = br.readLine();
            String t1 = br.readLine();
            System.out.println(checkSimilar(s1,t1));
        }

    }


    static int checkSimilar(String s,String t){
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <t.length()&&i<s.length() ; i++) {
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else map.put(ch,1);
        }
        //System.out.println(map);
        int count=0;
        for (int i = 0; i <t.length() ; i++) {
            char ch=t.charAt(i);
            if(map.containsKey(ch) && map.get(ch)>0){
                count++;
                map.put(ch,map.get(ch)-1);
            }
        }
       // System.out.println(map);
        return count;
    }
}
