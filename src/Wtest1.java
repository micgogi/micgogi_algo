import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 3/22/2020  6:25 PM
 * Rahul Gogyani
 */
public class Wtest1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            int[][] roads = new int[M][2];
            for (int i_roads = 0; i_roads < M; i_roads++) {
                String[] arr_roads = br.readLine().split(" ");
                for (int j_roads = 0; j_roads < arr_roads.length; j_roads++) {
                    roads[i_roads][j_roads] = Integer.parseInt(arr_roads[j_roads]);
                }
            }

            int[] out_ = Solution(N, M, roads);
            for (int i_out_ = 0; i_out_ < out_.length; i_out_++) {
                System.out.println(out_[i_out_]);
            }
        }

        wr.close();
        br.close();
    }

    static int[] Solution(int N, int M, int[][] roads){
        // Write your code here

    int a[] = new int[N+1];
        Arrays.fill(a,1);

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < roads.length; i++) {
            for (int j = 0; j <roads[i].length ; j++) {
                if(roads[i][j]>0){
                    a[roads[i][j]]=0;
                    roads[i][j]=0;
                }
            }

            int count =0;
            for (int k = 0; k <=N ; k++) {
                if(a[k]==0){
                    count++;
                }
            }
            arrayList.add(count);
        }


        int[] ret = new int[arrayList.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = arrayList.get(i).intValue();
        }
        return ret;

    }
    }



