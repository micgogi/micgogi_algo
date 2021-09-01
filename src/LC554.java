import java.util.*;

/**
 * @author Micgogi
 * on 4/23/2021  8:35 AM
 * Rahul Gogyani
 */
public class LC554 {
    public static void main(String args[]) {

    }

    public static int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(List<Integer>w:wall){
            int sum = 0;
            for(int i=0;i<w.size()-1;i++){
                sum+=w.get(i);
                map.put(sum,map.getOrDefault(sum,0)+1);
                count = Math.max(count,map.get(sum));
            }
        }
        return wall.size()-count;
    }

}

