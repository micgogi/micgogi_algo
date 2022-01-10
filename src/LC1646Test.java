/**
 * @author Micgogi
 * on 1/10/2022  4:11 PM
 * Rahul Gogyani
 */
public class LC1646Test {
    public static void main(String args[]) {
        System.out.println(new LC1646Test().getMaximumGenerated(100));
    }

    public int getMaximumGenerated(int n) {
        int[] a = new int[n+1];
        if(n==0)return 0;
        a[0] =0;
        a[1]=1;
        int max = Math.max(a[0],a[1]);
        for(int i=2;i<=n;i++){
            if(i%2==0){
                int index = i/2;
                a[i] = a[index];
            }
            else {
                int index = (i-1)/2;
                a[i]= a[index]+a[index+1];
            }

            max = Math.max(max,a[i]);
        }
        return max;
    }


}

