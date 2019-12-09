import java.util.Arrays;

/**
 * @author Micgogi
 * on 12/7/2019  10:03 PM
 * Micgogi
 */
public class LC46 {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        permut(a, a.length);

    }

    public static void permut(int a[], int n){
        if(n==1){
            System.out.println(Arrays.toString(a));
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a,i,n-1);
            permut(a,n-1);
            swap(a,i,n-1);
        }
    }
    public static void swap(int a[], int i, int n){
        int temp=a[i];
        a[i]=a[n-1];
        a[n-1]=temp;
    }
}
