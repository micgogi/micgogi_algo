package LCMayChallenge;

/**
 * @author Micgogi
 * on 5/15/2020  4:19 PM
 * Rahul Gogyani
 */
public class LC918 {
    public static void main(String[] args) {
        int a[] = {1,2,-3,2};
        System.out.println(maxSubarraySumCircular(a));
    }


    public static int maxSubarraySumCircular(int[] A) {
        int curr_max = A[0];
        int max=A[0];
        int curr_min=A[0];
        int min =A[0];
        int sum = A[0];
        for(int i=1;i<A.length;i++){
            curr_max = Math.max(A[i],curr_max+A[i]);
            max = Math.max(curr_max,max);
            curr_min = Math.min(A[i],curr_min+A[i]);
            min = Math.min(curr_min, min);
            sum+=A[i];
        }

        if(sum==min)return max;
        return Math.max(sum-min,max);

    }
}
