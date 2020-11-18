package LCNovChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Micgogi
 * on 5/14/2020  8:27 AM
 * Rahul Gogyani
 */
public class LC56 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));

    }

    public static int[][] merge(int[][] intervals) {
        if(intervals.length<=1)return intervals;
        Arrays.sort(intervals,(arr1,arr2)->(Integer.compare(arr1[0],arr2[0])));
        List<int[]> list = new ArrayList<>();
        int [] currentInterval = intervals[0];
        list.add(currentInterval);
        for(int[] interval:intervals){
            int currentEnd = currentInterval[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];
            if(currentEnd>=nextBegin){
                currentInterval[1]=Math.max(currentEnd,nextEnd);
            }else{
                currentInterval = interval;
                list.add(currentInterval);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
