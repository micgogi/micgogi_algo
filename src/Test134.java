import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Micgogi
 * on 4/2/2020  4:34 PM
 * Rahul Gogyani
 */
public class Test134 {

    public static void main(String[] args) {
//        String s = "the sky is blue";
//        int lasti=0;
//        int lastj =0;
//        for (int i = s.length() - 1, j = s.length() - 1; j >= 0; j--) {
//            if (s.charAt(j) == ' ') {
//                System.out.print(s.substring(j+1,i+1)+" ");
//                j=j-1;
//                i=j;
//            }
//            lasti = i;
//            lastj = j;
//        }
//
//        System.out.println(s.substring(lastj,lasti+1));
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> output = new ArrayList<>();
        int size  = list.size();
        for (int i = 0; i < size - 1; i+=2) {
            output.add(list.get(i)+list.get(i+1));
        }
        if(size%2==1){
            output.add(list.get(size-1));
        }
        System.out.println(output);
    }

    static int findMaxSum(int a[]) {
        int incl = a[0];
        int excl = 0;
        int excl_new;
        for (int i = 1; i < a.length; i++) {
            excl_new = Math.max(incl, excl);
            incl = excl + a[i];
            excl = excl_new;
        }

        return Math.max(incl, excl);
    }

    static int max(int[] a) {
        int incl = a[0];
        int excl = 0;
        int ex_new;
        for (int i = 1; i < a.length; i++) {
            ex_new = Math.max(incl, excl);
            incl = a[i] + excl;
            excl = ex_new;
        }
        return Math.max(incl, excl);
    }

    static int dp[] = new int[10];
    static boolean visited[] = new boolean[10];

    static int maxSum(int arr[], int i, int n) {
        if (i >= n) return 0;
        if (visited[i]) return dp[i];
        visited[i] = true;
        dp[i] = Math.max(maxSum(arr, i + 1, n), arr[i] + maxSum(arr, i + 2, n));
        return dp[i];

    }

    static int[] twoSum(int a[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(target - a[i])) {
                return new int[]{map.get(target - a[i]), i};
            } else {
                map.put(a[i], i);
            }
        }
        return new int[]{-1, -1};
    }

}



