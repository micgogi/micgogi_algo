

/**
 * @author Micgogi
 * on 12/18/2020  7:34 PM
 * Rahul Gogyani
 */
public class LC334 {
    public static void main(String args[]) {
        int a[] = {65, 78, 75, 73, 84, 65};
        System.out.println(increasingTriplet(a));
    }

    public static boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= a) {
                a = num;
            } else if (num <= b) {
                b = num;
            } else {
                return true;
            }
        }
        return false;
    }
}

