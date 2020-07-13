import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/13/2020  1:32 PM
 * Rahul Gogyani
 */
public class A1380 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t--!=0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i <n ; i++) {
                a[i] = sc.nextInt();
            }
            int index =-1;
            for (int i = 1; i <a.length-1 ; i++) {
                if(a[i]>a[i-1]&&a[i]>a[i+1]){
                    index = i;
                }
            }
            if(index>-1){
                int i = index;
                int j = index+1;
                int k = index+2;
                System.out.println("YES");
                System.out.println(i+" "+j+" "+k);
            }else{
                System.out.println("NO");
            }

        }
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

