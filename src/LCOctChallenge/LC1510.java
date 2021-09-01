package LCOctChallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Micgogi
 * on 10/25/2020  1:54 PM
 * Rahul Gogyani
 */
public class LC1510 {
    public static void main(String args[]) {
        int n = 7;
        System.out.println(winnerSquare(n));

    }
//    //dfs
//    public static boolean winnerSquareGame(int n){
//        HashMap<Integer, Boolean> map = new HashMap<>();
//        map.put(0, false);
//        return dfs(map,n);
//    }
//    public static boolean dfs(HashMap<Integer,Boolean> map, int remain){
//        if(map.containsKey(remain)){
//            return map.get(remain);
//        }
//        int root = (int)  Math.sqrt(remain);
//        for (int i = 1; i <=root ; i++) {
//            if(!dfs(map,remain-i*i)){
//                map.put(remain, true);
//                return true;
//            }
//        }
//        map.put(remain,false);
//        return false;
//    }
    public static boolean winnerSquare(int n){
        boolean[] a = new boolean[100005];
        a[1] = true;
        a[2] = false;
        a[3] = true;
        List<Integer> sq = new ArrayList<>();
        sq.add(1);
        for (int i = 4; i <= n ; i++) {
            int ss =(int) Math.sqrt(i);
            if(i==(ss*ss)){
                a[i] = true;
                sq.add(i);
                continue;
            }
            boolean flag = false;
            for (int j = 0; j <sq.size() ; j++) {
                if(!a[i-sq.get(j)]){
                    a[i] = true;
                    flag = true;
                    break;
                }
            }
            if(!flag){
                a[i] = false;
            }
        }
        return a[n];
    }
}

