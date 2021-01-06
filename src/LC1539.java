/**
 * @author Micgogi
 * on 1/6/2021  2:35 PM
 * Rahul Gogyani
 */
public class LC1539 {
    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{1, 2, 3, 4, 5}, 7));
    }

    public static int findKthPositive(int[] arr, int k) {
        int count = 0;
        int i = 0;
        int j = 1;
        while (i < arr.length) {
            if (arr[i] != j) {
                count++;
                if (count == k) return j;
                j++;
            } else {
                i++;
                j++;
            }
        }
        return arr.length + k;
    }

}

