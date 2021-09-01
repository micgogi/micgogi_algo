

import java.util.ArrayList;
import java.util.List;

/**
 * @author Micgogi
 * on 10/28/2020  2:47 PM
 * Rahul Gogyani
 */
public class LC228 {
    public static void main(String args[]) {
        int a[] = {0, 1, 2, 4, 5, 7};
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int start = a[i];
            while (i < a.length - 1 && a[i + 1] - a[i] == 1) {
                i++;
            }
            if (start != a[i]) {
                ans.add(start + "->" + a[i]);
            } else {
                ans.add("" + start);
            }

        }
        System.out.println(ans);
    }

}

