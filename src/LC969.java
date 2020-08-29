import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/29/2020  3:04 PM
 * Rahul Gogyani
 */
public class LC969 {
    public static void main(String args[]) {
        int A[] = {3,2,4,1};
        System.out.println(pancakeSort(A));
    }
    public static List<Integer> pancakeSort(int[] A) {
        int last = A.length;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < A.length ; i++) {
            int index = find(A,last);
            flip(A,index);
            System.out.println(Arrays.toString(A));
            flip(A,last-1);
            System.out.println(Arrays.toString(A));
            res.add(index+1);
            res.add(last--);
        }
        return res;
    }

    private static int find(int A[], int last){
        for (int i = 0; i <A.length ; i++) {
            if(A[i]==last){
                return i;
            }
        }
        return -1;
    }
    private static void flip(int[] A, int index){
        int i =0, j=index;
        while (i<j){
            int temp = A[i];
            A[i++] = A[j];
            A[j--] = temp;
        }
    }
}

