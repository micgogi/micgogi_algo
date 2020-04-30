import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Micgogi
 * on 4/29/2020  8:42 PM
 * Rahul Gogyani
 */
public class Markers {

    static int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals,(arr1,arr2)->(Integer.compare(arr1[0],arr2[0])));
        List<int[]>
                list =new ArrayList<>();
        int[] current_interval=intervals[0];
        list.add(current_interval);
        for(int[] interval:intervals){

            int current_end=current_interval[1];
            int next_begin=interval[0];
            int next_end=interval[1];
            if(current_end>=next_begin){
                current_interval[1]=Math.max(current_end,next_end);
            }
            else {
                current_interval=interval;
                list.add(current_interval);
            }

        }


        return list.toArray(new int[list.size()][]);
    }
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            int b[][];
            while(t--!=0){

                int n = Integer.parseInt(br.readLine());
                b = new int[n][2];

                for (int i = 0; i <n ; i++) {
                    String s[] = br.readLine().split(" ");
                    int x = Integer.parseInt(s[0]);
                    int y = Integer.parseInt(s[1]);
                    b[i][0]=x;
                    b[i][1]=y;



                }
                int ans[][] = merge(b);
               // System.out.println(Arrays.deepToString(ans));
                long result=0;
                for (int i = 0; i <ans.length ; i++) {
                    result=result+ans[i][1]-ans[i][0]+1;
                }
                System.out.println(result);


            }
        }catch (Exception e){

        }
    }


}
