import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/17/2020  11:47 AM
 * Rahul Gogyani
 */
public class LC282 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        String s = "123";
        int target = 6;
        System.out.println(addOperators(s,target));

    }

    public static List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(res,sb,num,0,target,0,0);
        return res;

    }

    public static void dfs(List<String> res, StringBuilder sb, String num, int pos, int target,
                    long prev, long multi) {
        if (pos == num.length()) {
            if (target == prev) res.add(sb.toString());
            return;
        }
        for (int i = pos; i < num.length(); i++) {
            if (num.charAt(pos) == '0' && i != pos) break;
            long curr = Long.parseLong(num.substring(pos,i+1));
            int len = sb.length();
            if(pos==0){
                dfs(res,sb.append(curr),num,i+1,target,curr,curr);
            }else{
                dfs(res,sb.append("+").append(curr),num,i+1,target,prev+curr,curr);
                sb.setLength(len);
                dfs(res,sb.append("-").append(curr),num,i+1,target,prev-curr,-curr);
                sb.setLength(len);
                dfs(res,sb.append("*").append(curr),num,i+1,target,prev-multi+multi*curr,multi*curr);
            }
            sb.setLength(len);


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

