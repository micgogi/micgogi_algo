package LCSeptChallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Micgogi
 * on 9/12/2020  12:38 PM
 * Rahul Gogyani
 */
public class LC216 {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        int n = 9;
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), a, k, n, 0);
        System.out.println(result);

    }

    public static void backtrack(List<List<Integer>> result, List<Integer> tempList, int num[], int k, int n, int start) {
        if (n == 0 && tempList.size() == k) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < num.length; i++) {

            tempList.add(num[i]);
            backtrack(result, tempList, num, k, n - num[i], i + 1);
            tempList.remove(tempList.size() - 1);

        }


    }


}

