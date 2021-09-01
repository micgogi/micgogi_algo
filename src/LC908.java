

/**
 * @author Micgogi
 * on 12/21/2020  1:51 PM
 * Rahul Gogyani
 */
public class LC908 {
    public static void main(String args[]) {
        int A[] = {65, 78, 75, 73, 84, 65};
        int min = A[0];
        int max = A[0];
        int k = 3;
        for (int i = 1; i < A.length; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }
        System.out.println(Math.max(0, max - min - 2 * k));
    }


}

