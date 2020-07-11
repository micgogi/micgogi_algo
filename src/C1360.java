import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/11/2020  12:11 PM
 * Rahul Gogyani
 */
public class C1360 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t--!=0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int e=0,o=0;
            for (int i = 0; i <n ; i++) {
                a[i] = sc.nextInt();
                if(a[i]%2==0){
                    e++;
                }else{
                    o++;
                }
            }

            System.out.println(cala(e,o,n,a));


        }

    }

    public static String cala(int e, int o, int n, int a[]){
        if(e%2!=o%2){
            return "NO";
        }else{
            if(e%2==0){
                return "YES";
            }else {
                for (int i = 0; i <n ; i++) {
                    for (int j = i+1; j <n ; j++) {
                        if(a[i]%2!=a[j]%2&&Math.abs(a[i]-a[j])==1){
                           return "YES";
                        }
                    }
                }
               return "NO";
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


