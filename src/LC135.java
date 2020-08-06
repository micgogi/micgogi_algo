import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/6/2020  1:43 PM
 * Rahul Gogyani
 */
public class LC135 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        int a[] = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(candy(a));
    }

    public static int candy(int[] ratings) {
        if (ratings.length == 1) return 1;
        int left[] = new int[ratings.length];
        int right[] = new int[ratings.length];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < ratings.length; i++) {
            ans += Math.max(left[i], right[i]);
        }
        return ans;

//        int candies[] = new int[ratings.length];
//        Arrays.fill(candies,1);
//        if(ratings[0]>ratings[1])candies[0]++;
//        for (int i = 1; i <ratings.length-1 ; i++) {
//            int left = ratings[i-1];
//            int right = ratings[i+1];
//            if(ratings[i]>left||ratings[i]>right){
//                candies[i]++;
//            }
//        }
//        if(ratings[ratings.length-1]>ratings[ratings.length-2]){
//            candies[ratings.length-1]++;
//        }
//        int ans =0;
//        for (int i = 0; i <candies.length ; i++) {
//            ans+=candies[i];
//        }
//        System.out.println(ans);
//        return ans;

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

