package LCJulyChallenge;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Micgogi
 * on 4/21/2020  10:05 AM
 * Rahul Gogyani
 */
public class LC260 {
    public static void main(String[] args) {
        int a[] = {1,2,1,3,2,5};
        int b[] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i <a.length ; i++) {
            hm.putIfAbsent(a[i],0);
            hm.put(a[i],hm.get(a[i])+1);
        }
        int i=0;
        for (int key: hm.keySet()){
            if(hm.get(key)==1){
                b[i]=key;
                i++;
            }
        }
        System.out.println(Arrays.toString(singleNumber(a)));
    }

    public static int[] singleNumber(int a[]){
        int temp=0;
        for(int n:a){
            temp^=n;
        }
        int mask = -temp&temp;
        int single1=0,single2 =0;
        for(int num:a){
            if((num&mask)==0){
                single1^=num;
            }else{
                single2^=num;
            }
        }

        return new int[]{single1,single2};
        
    }
}
