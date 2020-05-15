import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Micgogi
 * on 5/15/2020  11:05 AM
 * Rahul Gogyani
 */
public class A1352 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            while(t--!=0){
                ArrayList<Integer> list = new ArrayList<>();
                int n = Integer.parseInt(br.readLine());
                int di=1;
                while(n!=0){
                    int re = n%10;
                    if(re!=0){
                        list.add(re*di);
                    }

                    n=n/10;
                    di*=10;
                }
                System.out.println(list.size());
                for(int i:list){
                    System.out.print(i+" ");
                }
                System.out.println();

            }
        }catch (Exception e){

        }
    }
}
