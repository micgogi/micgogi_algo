package LCJulyChallenge;

import java.util.*;

/**
 * @author Micgogi
 * on 2/23/2020  4:03 PM
 * Micgogi
 */
public class LC15 {
    public static void main(String[] args) {
        int a[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(a));
    }
    public static List<List<Integer>> threeSum(int[] a) {
        int n = a.length;
        Set<List<Integer>> set = new HashSet<>();
       
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = a[i]+a[j]+a[k];
                if(sum==0){
                    List<Integer> l = new ArrayList<>();
                    l.add(a[i]);
                    l.add(a[j]);
                    l.add(a[k]);
                    set.add(l);
                    j++;
                }else if(sum>0)k--;
                else j++;

            }
        }
        return new ArrayList(set);

}

}
