import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/13/2020  10:12 AM
 * Rahul Gogyani
 */
public class LC658 {
    static class Pair{
        int index;
        int diff;
        public Pair(int index, int diff){
            this.index = index;
            this.diff = diff;
        }
    }
    public static void main(String args[]) {
        FastReader sc = new FastReader();

        int a[] = {1,1,1,10,10,10};
        int k =1;
        int x=9;
        System.out.println(findClosestElements(a,k,x));

    }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
      int lo =0;
      int hi = arr.length-1;
      while (hi-lo>=k){
          if(Math.abs(arr[lo]-x)>Math.abs(arr[hi]-x)){
              lo++;
          }else {
              hi--;
          }
      }
      List<Integer> list = new ArrayList<>();
        for (int i = lo; i <=hi ; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in), 32768);
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}

