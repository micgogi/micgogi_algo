import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        ArrayList[] a = new ArrayList[n];
        for (int i = 0; i <n ; i++) {
            a[i]=new ArrayList<Integer>();
        }
        int lastAnswer=0;
        for (int i = 0; i <q ; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();


            if(t==1){
                a[(x^lastAnswer)%n].add(y);
            }else{
//                System.out.println(lastAnswer+" "+x);
//                System.out.println(x^lastAnswer);
//                System.out.println((x^lastAnswer)%n);
                lastAnswer= (int) a[(x^lastAnswer)%n].get(y% a[(x^lastAnswer)%n].size());
                System.out.println(lastAnswer);
            }
        }


    }
}
