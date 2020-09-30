package LCSeptChallenge;

/**
 * @author Micgogi
 * on 4/21/2020  12:45 PM
 * Rahul Gogyani
 */
public class LC41 {
    public static void main(String[] args) {
        int a[] = {3,4,-1,1};
        int n = a.length;
        for (int i = 0; i <n ; i++) {
            while (a[i]>0&&a[i]<=n&&a[a[i]-1]!=a[i]){
                int temp =a[a[i]-1];;
                a[a[i]-1]=a[i];
                a[i]=temp;
            }

        }
        for (int i = 0; i <n ; i++) {
            if(a[i]!=i+1){
                System.out.println(i+1);
                break;
            }
        }

    }


}
