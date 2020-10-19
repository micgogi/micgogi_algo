//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.StringTokenizer;
//
///**
// * @author Micgogi
// * on 8/20/2020  1:31 PM
// * Rahul Gogyani
// */
//public class GFGMinSwap {
//    public static void main(String args[]) {
//        FastReader sc = new FastReader();
//        int t = sc.nextInt();
//        while(t--!=0){
//            int n = sc.nextInt();
//            int a[] = sc.readArray(n);
//            System.out.println(minSwap(a));
//        }
//    }
//    public static int minSwap(int a[]){
//        int n = a.length;
//        ArrayList<Pair<Integer,Integer>> arrPosition = new ArrayList<>();
//        arrPosition.add(0,new Pair<>(0,0));
//        for (int i = 0; i <a.length ; i++) {
//            arrPosition.add(new Pair<>(a[i],i+1));
//        }
//        arrPosition.sort(Comparator.comparingInt(Pair::getKey));
//        Boolean[] visited = new Boolean[n+1];
//        Arrays.fill(visited,false);
//        System.out.println(arrPosition);
//        int ans = 0;
//        for (int i = 1; i <=n ; i++) {
//            if(visited[i] || arrPosition.get(i).getValue()==i){
//                continue;
//            }
//            int cycleSize = 0;
//            int j = i;
//            while (!visited[j]){
//                visited[j] = true;
//                j= arrPosition.get(j).getValue();
//                cycleSize++;
//            }
//            if(cycleSize>0){
//                ans+=cycleSize-1;
//            }
//        }
//        return ans;
//    }
//
//    static class FastReader {
//        BufferedReader br;
//        StringTokenizer st;
//
//        public FastReader() {
//            br = new BufferedReader(new InputStreamReader(System.in), 32768);
//        }
//
//        String next() {
//            while (st == null || !st.hasMoreElements()) {
//                try {
//                    st = new StringTokenizer(br.readLine());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            return st.nextToken();
//        }
//
//        int nextInt() {
//            return Integer.parseInt(next());
//        }
//
//        long nextLong() {
//            return Long.parseLong(next());
//        }
//
//        double nextDouble() {
//            return Double.parseDouble(next());
//        }
//
//        String nextLine() {
//            String str = "";
//            try {
//                str = br.readLine();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return str;
//        }
//
//        int[] readArray(int n) {
//            int[] a = new int[n];
//            for (int i = 0; i < n; i++) a[i] = nextInt();
//            return a;
//        }
//
//        int[][] read2DArray(int n) {
//            int[][] a = new int[n][n];
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    a[i][j] = nextInt();
//                }
//            }
//            return a;
//        }
//
//        int[][] read2DArray(int n, int m) {
//            int[][] a = new int[n][m];
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    a[i][j] = nextInt();
//                }
//            }
//            return a;
//        }
//    }
//
//}
//
