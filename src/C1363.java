import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author Micgogi
 * on 6/16/2020  4:58 PM
 * Rahul Gogyani
 */
public class C1363 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t-- != 0) {
                String s[] = br.readLine().split(" ");
                int n = Integer.parseInt(s[0]);
                int x = Integer.parseInt(s[1]);
                // Map<Integer, LinkedList<Integer>> graph = new HashMap<>();
                int degree = 0;
                int te= n-1;
                while (te != 0) {
                    String s2[] = br.readLine().split(" ");
                    int src = Integer.parseInt(s2[0]);
                    int dest = Integer.parseInt(s2[1]);

                    if (src == x || dest == x) degree++;

                    te--;
                }
                if (degree <= 1) {
                    System.out.println("Ayush");
                } else {
                    if((n-3)%2==0){
                        System.out.println("Ashish");
                    }else {
                        System.out.println("Ayush");
                    }
                }
            }
        } catch (Exception e) {

        }
    }
}
