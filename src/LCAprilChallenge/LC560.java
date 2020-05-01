package LCAprilChallenge;

import java.util.HashMap;

/**
 * @author Micgogi
 * on 4/6/2020  9:23 AM
 * Rahul Gogyani
 */
public class LC560 {
    public static void main(String[] args) {
        int a[] = {10,2,-2,-20,10};
        int k =-10;
        HashMap<Integer,Integer> map = new HashMap<>();
        int res =0;
        int currSum =0;
        for (int i = 0; i <a.length ; i++) {
            currSum+=a[i];
            if(currSum==k)res++;
            if(map.containsKey(currSum-k)){
                res+=map.get(currSum-k);
            }
            Integer count = map.get(currSum);
            if(count==null){
                map.put(currSum,1);
            }
            else{
                map.put(currSum,count+1);
            }
        }
    }
}
