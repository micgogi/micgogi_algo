import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 8/1/2020  1:13 PM
 * Rahul Gogyani
 */
public class TH3 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String inputs[] = br.readLine().split(" ");
            int N = Integer.parseInt(inputs[0]);
            int X = Integer.parseInt(inputs[1]);
            int Y = Integer.parseInt(inputs[2]);
            int Z = Integer.parseInt(inputs[3]);
            int T = Integer.parseInt(inputs[4]);
           String[] matrixElements = br.readLine().split(" ");
            long[] matrixEle = new long[N];
            for (int i = 0; i <matrixEle.length ; i++) {
                matrixEle[i] = Integer.parseInt(matrixElements[i]);
            }

//            long ans = 0;
//            for (int i = X-1; i <=Z-1 ; i++) {
//
//                for (int j = Y-1; j <=T-1 ; j++) {
//                    System.out.println(matrixEle[i]&matrixEle[j]);
//                    ans^=matrixEle[i]&matrixEle[j];
//                }
//            }
//            System.out.println("for "+ans);
            long ans2 =0;
            for(int i=X-1;i<=Z-1;i++){
                ans2^=matrixEle[i];
            }
            long ans3 =0;
            for (int j = Y-1; j <=T-1 ; j++) {
                //System.out.println(matrixEle[j]);
                ans3^=matrixEle[j];
            }
           // System.out.println("other"+ans2);
            System.out.println("otehr"+(ans2&ans3));
            //System.out.println(Arrays.deep ToString(M));
//            System.out.println(map);
//            int row = X-1;
//            int col = Y-1;
//            int rowEnd = Z-1;
//            int colEnd = T-1;
//            for (int i = row; i <=rowEnd ; i++) {
//                for (int j = col; j <=colEnd ; j++) {
//                    ans= ans^map.get(i).get(j);
//                }
//            }
//            System.out.println(ans);

        } catch (Exception e) {

        }
    }


}

