

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Micgogi
 * on 5/22/2020  8:40 AM
 * Rahul Gogyani
 */
public class B1325 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                int n = Integer.parseInt(br.readLine());
                String s[] = br.readLine().split(" ");
                int a[] = new int[n];
                for (int i = 0; i <a.length ; i++) {
                    a[i]=Integer.parseInt(s[i]);
                }
                Set<Integer> set = new HashSet<>();
                for (int i = 0; i <a.length ; i++) {
                    set.add(a[i]);
                }
                System.out.println(set.size());
            }
        }catch (Exception e){

        }
    }
}
