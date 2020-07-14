import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/14/2020  10:45 AM
 * Rahul Gogyani
 */
public class LC442 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int a[] = {4,3,2,7,8,2,3,1};
//        Arrays.sort(a);
        List<Integer> list = new ArrayList<>();
//        for (int i = 1; i <a.length ; i++) {
//            if(a[i-1]==a[i]){
//                list.add(a[i]);
//            }
//        }
//        System.out.println(list);
        for (int i = 0; i < a.length; i++) {
            int n = Math.abs(a[i]);
            if(a[n-1]<0){
                list.add(n);
            }else{
                a[n-1] = -a[n-1];
            }
        }
        System.out.println(list);
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

