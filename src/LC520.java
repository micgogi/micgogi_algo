import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/1/2020  12:37 PM
 * Rahul Gogyani
 */
public class LC520 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        String s = sc.nextLine();
        System.out.println(detectCapitalUse(s));
    }

    public static boolean detectCapitalUse(String word) {
        boolean firstCap = false;
        boolean firstSmall = false;
        boolean othersSmall = false;
        boolean othersCap = false;
        if(Character.isUpperCase(word.charAt(0))){
            firstCap = true;
            firstSmall = false;
        }else{
            firstCap = false;
            firstSmall = true;
        }
        if(word.length()==1){
            return true;
        }

        boolean checkForCap =false ;
        boolean checkForSmall =false;
        if(Character.isUpperCase(word.charAt(1))){
             checkForCap = true;
        }else{
            checkForSmall = true;
        }
        if(checkForCap) {
            for (int i = 2; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))){
                    othersCap = true;
                }
                else {
                    //System.out.println(false);
                    othersCap = false;
                    break;
                }
            }
        }else{
            for (int i = 2; i < word.length(); i++) {
                if (!Character.isUpperCase(word.charAt(i))) {
                    othersSmall = true;
                } else {
                    othersSmall = false;
                    break;
                }
            }
        }
        if((firstCap&&othersCap)||(firstCap&&othersSmall)||(firstSmall&&othersSmall)){
            return true;
        }
        return false;

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

