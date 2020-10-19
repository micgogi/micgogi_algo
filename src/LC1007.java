/**
 * @author Micgogi
 * on 10/19/2020  12:51 PM
 * Rahul Gogyani
 */
public class LC1007 {
    public static void main(String args[]) {
        int A[] = {3,5,2,1,3};
        int B[] = {3,6,3,3,4};
        int countA[] = new int[7];
        int countB[] = new int[7];
        int maxAElement = 0;
        int j = 0;
        int k = 0;
        int maxBElement = 0;
        for (int i = 0; i < A.length; i++) {
            countA[A[i]]++;
        }
        for (int i = 0; i < B.length; i++) {
            countB[B[i]]++;
        }
        for (int i = 0; i < countA.length; i++) {
            if (countA[i] > j) {
                j = countA[i];
                maxAElement = i;
            }
        }
        for (int i = 0; i < countB.length; i++) {
            if (countB[i] > k) {
                k = countB[i];
                maxBElement = i;
            }
        }
        boolean check = false;
        if(k>j){
            check= true;
        }
        int max = Math.max(maxAElement, maxBElement);
        int min = 0;
        if(check){
            for (int i = 0; i < B.length ; i++) {
                if (A[i] != max && B[i]!=max) {
                    System.out.println(-1);
                    return;
                }
                if(B[i]!=max){
                    min++;
                }
            }
        }else{
            for (int i = 0; i < A.length ; i++) {
                if (A[i] != max && B[i]!=max) {
                    System.out.println(-1);
                    return;
                }
                if(A[i]!=max){
                    min++;
                }
            }
        }
        System.out.println(min);

    }

}

