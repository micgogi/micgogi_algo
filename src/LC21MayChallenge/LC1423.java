package LC21MayChallenge;

import java.io.BufferedReader;

/**
 * @author Micgogi
 * on 5/11/2021  8:02 PM
 * Rahul Gogyani
 */
public class LC1423 {
    public static void main(String args[]) {
        System.out.println(maxScore(new int[]{1,2,3,4,5,6,1},3));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int left = 0;
        for (int i = 0; i < k ; i++) {
            left+=cardPoints[i];
        }

        int max = left;
        int right =0;
        int n = cardPoints.length;
        for (int i=0;i<k;i++){
            right+=cardPoints[n-i-1];
            left-=cardPoints[k-i-1];
            max = Math.max(max,left+right);
        }
        return max;
    }

}

