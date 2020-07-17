package LCJulyChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 7/17/2020  1:11 PM
 * Rahul Gogyani
 */
public class LC347 {
    static class Pair{
        int element;
        int count;
        public Pair(int element, int count){
            this.element = element;
            this.count = count;
        }
    }
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int a[] = {1,1,1,2,2,3};
        int k =2;
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((obj1,obj2)->obj2.count-obj1.count);
        for (int e:a){
            map.putIfAbsent(e,0);
            map.put(e,map.get(e)+1);
        }
      for(int key:map.keySet()){
          priorityQueue.add( new Pair(key,map.get(key)));
      }
        List<Integer> res = new ArrayList<>();
        while (k--!=0){
            Pair pair = priorityQueue.poll();
            System.out.println(pair.element+" "+pair.count);
            res.add(pair.element);
        }
       int ans[] = res.stream().mapToInt(i->i).toArray();

        System.out.println(Arrays.toString(ans));

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

