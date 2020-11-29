package LCNovChallenge;

/**
 * @author Micgogi
 * on 11/29/2020  6:13 PM
 * Rahul Gogyani
 */
public class LC1306 {
    public static void main(String args[]) {
        int a[] = {4, 2, 3, 0, 3, 1, 2};
        System.out.println(canReach(a, 5));
    }

    public static boolean canReach(int[] arr, int start) {
        if (start >= 0 && start < arr.length && arr[start] >= 0) {
            if (arr[start] == 0) return true;
            arr[start] = -arr[start];
            return canReach(arr, start + arr[start]) || canReach(arr, start - arr[start]);
        }
        return false;
    }

}

