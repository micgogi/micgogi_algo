import java.util.HashSet;
import java.util.Set;

/**
 * @author Micgogi
 * on 4/7/2020  6:55 PM
 * Rahul Gogyani
 */
public class LCCountingNumbers {

    public static void main(String[] args) {
        int a[] = {1,1,2,2};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <a.length ; i++) {
            set.add(a[i]);
        }
        int count =0;
        for (int i = 0; i <a.length ; i++) {
            if(set.contains(a[i]+1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
