import java.util.Arrays;

public class ArrayRigRot {
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6,7,8,9};
        int q = 4;
        while(q!=0) {
            int n = a[a.length - 1];

            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];

            }
            a[0] = n;
            --q;
        }
        System.out.println(Arrays.toString(a));
    }
}
