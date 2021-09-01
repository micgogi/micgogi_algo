package June21Challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Micgogi
 * on 3/14/2020  4:25 PM
 * Rahul Gogyani
 */
public class LC118 {
    public static void main(String[] args) {
        int num = 5;
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(1);
        lists.add(a);
        for (int i = 1; i <=num ; i++) {
            List<Integer> list = new ArrayList<>();
            List<Integer> prev=null;

                prev = lists.get(i-1);


            for (int j = 0; j <=i ; j++) {
                if(j==0||j==i){
                    list.add(1);
                }else{
                    list.add(prev.get(j-1)+prev.get(j));
                }
            }
            lists.add(list);
        }
        System.out.println(lists);
    }
}
