import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/1/2020  11:13 AM
 * Rahul Gogyani
 */
public class TH1 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        String colors = sc.nextLine();
        String numbers = sc.nextLine();
        System.out.println(numbers);
        char colorsArr[] = colors.toCharArray();
        int num[] = new int[n];
        int i=0;
        int red = 0;
        int blue = 0;
         int green =0;
        for (int j = 0; j <colors.length() ; j++) {
          if(colors.charAt(j)=='R'){
              red++;
          }
          if(colors.charAt(j)=='G'){
              green++;
          }
          if(colors.charAt(j)=='B'){
              blue++;
          }
        }
        Integer redArr[] = new Integer[red];
        Integer greenArr[] = new Integer[green];
        Integer blueArr[] = new Integer[blue];
        int redindex =0;
        int greenindex =0;
        int blueindex =0;
        for (char c:numbers.toCharArray()){
            num[i] = Integer.parseInt(""+c);
            if(colorsArr[i]=='R'){
                redArr[redindex] = num[i];
                redindex++;
            }
            if(colorsArr[i]=='G'){
                greenArr[greenindex]=num[i];
                greenindex++;

            }
            if(colorsArr[i]=='B'){
                blueArr[blueindex] = num[i];
                blueindex++;
            }
            i++;
        }
        System.out.println(Arrays.toString(colorsArr));
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(redArr));
        System.out.println(Arrays.toString(blueArr));
        System.out.println(Arrays.toString(greenArr));
        Arrays.sort(redArr, Collections.reverseOrder());
        Arrays.sort(blueArr,Collections.reverseOrder());
        Arrays.sort(greenArr,Collections.reverseOrder());
        System.out.println(Arrays.toString(redArr));
        redindex=0;
        greenindex=0;
        blueindex=0;
        for (int j = 0; j <colorsArr.length ; j++) {
            if(colorsArr[j]=='R'){
                num[j] = redArr[redindex];
                redindex++;
            }
            if(colorsArr[j]=='G'){
                num[j] = greenArr[greenindex];
                greenindex++;
            }
            if(colorsArr[j]=='B'){
                num[j] = blueArr[blueindex];
                blueindex++;
            }
        }
        System.out.println(Arrays.toString(num));
        String res = "";
        for (int c:num){
            res+=c;
        }
        System.out.println(res);

//        for (int j = 0; j <num.length ; j++) {
//            int max = 0;
//            int index =j;
//            for (int k = j+1; k < num.length ; k++) {
//                if(colorsArr[j]==colorsArr[k]){
//                    if(num[k]>num[j]) {
//                        max = Math.max(num[j], num[k]);
//                        index = k;
//                    }
//                }
//
//            }
//            int temp = num[j];
//            num[j] = max;
//            num[index] = temp;
//            //System.out.println(Arrays.toString(num));
//        }
//        System.out.println(Arrays.toString(num));


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

