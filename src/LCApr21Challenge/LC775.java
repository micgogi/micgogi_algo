package LCApr21Challenge;

/**
 * @author Micgogi
 * on 4/5/2021  7:16 PM
 * Rahul Gogyani
 */
public class LC775 {
    public static void main(String args[]) {
        System.out.println(isIdealPermutation(new int[]{1,0,2}));
    }

    public static boolean isIdealPermutation(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (Math.abs(A[i] - i) > 1) return false;
        }
        return true;
    }

}

