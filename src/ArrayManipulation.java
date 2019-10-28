import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        int m = sc.nextInt();
        while(m!=0){
            int i1= sc.nextInt();
            int i2 = sc.nextInt();
            int val = sc.nextInt();
            a[i1-1]+=val;
            if((i2)<n)a[i2]-=val;
//            for(int j=i1-1;j<i2;j++){
//                a[j]+=val;
//
//            }
            System.out.println(Arrays.toString(a));
            m--;
        }
        long max=0;
        long atik=0;
       for(int i=0;i<a.length;i++){
           atik+=a[i];
           if(atik>max)max=atik;
       }
        System.out.println(max);
    }
}
