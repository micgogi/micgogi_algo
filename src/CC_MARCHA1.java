import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/14/2020  12:13 AM
 * Micgogi
 */
public class CC_MARCHA1 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                String s = br.readLine();
                String s1[] = s.split(" ");
                int n = Integer.parseInt(s1[0]);
                int m = Integer.parseInt(s1[1]);
                int a[] = new int[n];
                for (int i = 0; i <a.length ; i++) {
                    a[i]=Integer.parseInt(br.readLine());
                }
                if(isSubset(a,m)){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }

            }
        }catch (Exception e){

        }
    }
    public static boolean isSubset(int a[], int sum){
        boolean b[][] = new boolean[a.length+1][sum+1];
        for (int i = 0; i <a.length ; i++) {
            b[i][0]=true;
        }
        for (int i = 1; i <=a.length ; i++) {
            for (int j = 1; j <=sum; j++) {
                if(j-a[i-1]>=0){
                    b[i][j]=b[i-1][j]||b[i-1][j-a[i-1]];
                }else {
                    b[i][j]=b[i-1][j];
                }
            }
        }
        return b[a.length][sum];



    }
}
