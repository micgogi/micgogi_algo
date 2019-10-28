import java.util.Arrays;
import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i]=sc.next();

        }
        int nq = sc.nextInt();
        String q [] = new String[nq];
        for (int i = 0; i <nq ; i++) {
            q[i]=sc.next();
        }
        int results[]= new int[nq];
        for(int i=0;i<nq;i++){
            int count =0;
            for(int j=0;j<s.length;j++){
                if(q[i].equals(s[j]))count++;

            }
            results[i]=count;
        }
        System.out.println(Arrays.toString(results));
    }
}
