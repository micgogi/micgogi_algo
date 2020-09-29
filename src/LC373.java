
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 7/12/2020  4:25 PM
 * Rahul Gogyani
 */
public class LC373 {
    static class Pair{
        int first;
        int second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int nums1[] = {1,1,2};
        int nums2[] = {1,2,3};
        int k =2;
        System.out.println(kSmallestPairs(nums1,nums2,k));



    }
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> list1 = new ArrayList<>();
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((ob1,ob2)->ob1.first+ob1.second-(ob2.first+ob2.second));
        int len1=nums1.length;
        int len2 = nums2.length;
        if(len2==0||len1==0)return list1;
        for (int i = 0; i <nums1.length ; i++) {
            for (int j = 0; j <nums2.length ; j++) {
                priorityQueue.add(new Pair(nums1[i],nums2[j]));
            }
        }

        int i=0;
        if(k>len1*len2){
            k=len1*len2;
        }
        while (k--!=0){
            Pair pair = priorityQueue.poll();
            List<Integer> list2 = new ArrayList<>();
            list2.add(pair.first);
            list2.add(pair.second);
            list1.add(list2);
            i++;
        }
        return list1;
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

