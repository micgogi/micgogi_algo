import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Micgogi
 * on 1/23/2020  11:13 PM
 * Micgogi
 */
public class CC_COINS {
    static HashMap<Long, Long> map;
    public static void main(String[] args) {
        try{
            map= new HashMap<>() ;
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()) {
                map.put(0L,0L);
                map.put(1L,1L);
                map.put(2L,2L);
                long n = sc.nextLong();
                System.out.println(count(n));
            }

        }catch (Exception e){

        }
    }
    public static long count(long n){
        if(map.containsKey(n))return map.get(n);
        else {
            map.put(n,Math.max(n,count((int)Math.ceil(n/2))+count((int)Math.ceil(n/3))+count((int)Math.ceil(n/4))));
            return map.get(n);
        }
    }
}
