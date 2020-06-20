package LCJuneChallenge;

import java.util.ArrayList;


/**
 * @author Micgogi
 * on 6/20/2020  12:38 PM
 * Rahul Gogyani
 */
public class LC60 {
    public static void main(String[] args) {
        getPermutation(4,4);
    }

    public static String getPermutation(int n, int k){
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        int totalNo =1;
        for (int i = 1; i <=n ; i++) {
            totalNo*=i;
            list.add(i);

        }
        System.out.println(list);
        System.out.println(totalNo);
        for (int i = 0,b=k-1; i <n ; i++) {
            totalNo/=(n-i);
            int index = (b/totalNo);
            sb.append(list.remove(index));
            b-=index*totalNo;
            
        }

        return  sb.toString();
    }
}
