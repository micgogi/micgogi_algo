import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Micgogi
 * on 6/6/2020  2:36 PM
 * Rahul Gogyani
 */
public class LC406 {
    public static void main(String[] args) {
        int a[][] = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        Arrays.sort(a,(c,d)->c[0]==d[0]?c[1]-d[1]:d[0]-c[0]);
        List<int[]> list = new ArrayList<>();
        System.out.println(Arrays.deepToString(a));
       for (int[] c:a){
           list.add(c[1],c);
       }
        System.out.println(list);
       int b[][] = list.toArray(a);
        System.out.println(Arrays.deepToString(b));

    }


}
