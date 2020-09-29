
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Micgogi
 * on 6/24/2020  5:53 PM
 * Rahul Gogyani
 */
public class B1370 {
    static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t-- != 0) {
                int n = Integer.parseInt(br.readLine());

                int a[] = new int[2 * n];
                String s[] = br.readLine().split(" ");
                List<Integer> odd = new ArrayList<>();
                List<Integer> even = new ArrayList<>();
                for (int i = 0; i < s.length; i++) {
                    a[i] = Integer.parseInt(s[i]);
                    if ((a[i] & 1) == 1) odd.add(i+1);
                    else even.add(i+1);
                }
                List<Pair> list = new ArrayList<>();
                for (int i = 0; i + 1 < odd.size(); i += 2) {
                    list.add(new Pair(odd.get(i), odd.get(i + 1)));
                }
                for (int i = 0; i + 1 < even.size(); i += 2) {
                    list.add(new Pair(even.get(i), even.get(i + 1)));
                }
                for (int i = 0; i < n - 1; i++) {
                    System.out.println(list.get(i).first + " " + list.get(i).second);
                }


            }
        } catch (Exception e) {

        }
    }
}
