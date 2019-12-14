/**
 * @author Micgogi
 * on 12/14/2019  7:14 PM
 * Micgogi
 */
public class LC26 {
    public int removeDuplicates(int[] a) {
        int count =1;
        if(a.length==0){
            return 0;
        }
        int j=0;
        for (int i = 1; i < a.length; i++) {
            if(a[i-1]!=a[i]){
                j++;
                a[j]=a[i];
            }
        }
        // System.out.println(Arrays.toString(a));
        return j+1;

    }
}
