package LC21MayChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 5/30/2021  4:18 PM
 * Rahul Gogyani
 */
public class LC164 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int a[] = sc.readArray(n);
            System.out.println(maximumGap(a));

        }
    }

    public static int maximumGap(int nums[]) {
        if (nums == null || nums.length < 2) return 0;
        int min = nums[0];
        int max = nums[0];
        for (int e : nums) {
            min = Math.min(min, e);
            max = Math.max(max, e);
        }
        if (min == max) return 0;
        int n = nums.length;
        int gap = (int) Math.ceil((double) (max - min) / (n - 1));
        int[] bucketMin = new int[n-1];
        int[] bucketMax = new int[n-1];
        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);
        for (int i:nums){
          if(i==min||i==max){
              continue;
          }
          int idx = (i-min)/gap;
          bucketMin[idx] = Math.min(i,bucketMin[idx]);
          bucketMax[idx] = Math.max(i,bucketMax[idx]);
        }

        int maxGap = Integer.MIN_VALUE;
        int prev = min;
        for (int i = 0; i < n-1 ; i++) {
            if(bucketMin[i]==Integer.MAX_VALUE && bucketMax[i]==Integer.MIN_VALUE){
                continue;
            }
            maxGap = Math.max(maxGap,bucketMin[i]-prev);
            prev = bucketMax[i];
        }
        maxGap = Math.max(maxGap,max-prev);
        return maxGap;

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

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[][] read2DArray(int n) {
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }

        int[][] read2DArray(int n, int m) {
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }
    }

}

