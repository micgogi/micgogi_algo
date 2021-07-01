package july21challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Micgogi
 * on 7/1/2021  7:44 PM
 * Rahul Gogyani
 */
public class LC89 {
    public static void main(String args[]) {
        System.out.println(greyCode(3));
    }

    public static List<Integer> greyCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        for (int i = 1; i <= n; i++) {
            int prevLength = res.size();
            int mask = 1 << (i - 1);
            for (int j = prevLength - 1; j >= 0; j--) {
                res.add(mask + res.get(j));
            }
        }
        return res;
    }

}

