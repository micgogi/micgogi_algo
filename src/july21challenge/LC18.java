package july21challenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/16/2021  4:31 PM
 * Rahul Gogyani
 */
public class LC18 {
    public static void main(String[] args) {
        int a[] = {-2, -1, 0, 0, 1, 2};
        Arrays.sort(a);
        List<List<Integer>> list = new ArrayList<>();
        int target = 3;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int left = j + 1;
                int right = a.length - 1;
                while (left < right) {
                    int sum = a[i] + a[j] + a[left] + a[right];
                    if (sum == 0) {
                        ArrayList<Integer> al = new ArrayList<>();
                        al.add(a[i]);
                        al.add(a[j]);
                        al.add(a[left]);
                        al.add(a[right]);
                        list.add(al);
                        int leftV = a[left];
                        while (left < a.length && a[left] == leftV) {
                            left++;
                        }
                        int rightV = a[right];
                        while (right > left && rightV == a[right]) {
                            right--;
                        }

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }

                }
                while (j + 1 < a.length && a[j + 1] == a[j]) {
                    j++;
                }
            }
            while (i + 1 < a.length && a[i + 1] == a[i]) {
                i++;
            }
        }
        System.out.println(list);
    }
}
