import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 @author Myvin Barboza
 01/05/20 4:41 PM
 */
public class PP2 {

    static List<int[]> combine(int n, int k, int a[],int uni) {
        List<int[]> list = new ArrayList<>();
        // handling edge conditions to make it faster but will work without it
        //  if(n==0 || k==0 || k>n ) return list;
        combine(list, new ArrayList<>(), n, k, 1, a,uni);
        // dfs(list,new ArrayList<>(),k,1,n-k+1);
        return list;

    }


    static void combine(List<int[]> list, List<Integer> path, int n, int k, int start, int b[], int uni) {

        if (k == 0) {
            int a[] = Arrays.copyOf(b, b.length);
            int l = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 0) {
                    a[i] = path.get(l);
                    l++;
                }
            }
            if (check(a, uni))
                list.add(a);

            return;
        }

        for (int i = 1; i <= n; i++) {
            path.add(i);
            combine(list, path, n, k - 1, i + 1, b,uni);
            path.remove(path.size() - 1);
        }
    }

    static boolean check(int a[], int k) {
        int count = 0;
        for (int i = 0; i < a.length; ) {
                count++;
            while (i + 1 < a.length && a[i] == a[i + 1]) i++;
            i++;
        }
        return count == k;
    }

    static int countZero(int a[]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) count++;
        }
        return count;
    }


    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t-- != 0) {
                String s[] = br.readLine().split(" ");
                int n = Integer.parseInt(s[0]);
                int m = Integer.parseInt(s[1]);
                int k = Integer.parseInt(s[2]);
                String s1[] = br.readLine().split(" ");
                int a[] = new int[n];
                for (int i = 0; i < a.length; i++) {
                    a[i] = Integer.parseInt(s1[i]);
                }
                int b[][] = new int[n][m];
                for (int i = 0; i < b.length; i++) {
                    String s2[] = br.readLine().split(" ");
                    for (int j = 0; j < b[0].length; j++) {
                        b[i][j] = Integer.parseInt(s2[j]);
                    }
                }

                int zeroCount = countZero(a);
                List<int[]> yu = combine(m, zeroCount, a,k);
                //just printing
                System.out.println(yu);
                for (int i = 0; i < yu.size(); i++) {
                    System.out.println(Arrays.toString(yu.get(i)));
                }
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < yu.size(); i++) {
                    int p[] = yu.get(i);
                    int sum = 0;
                    for (int j = 0; j < p.length; j++) {
                        if (a[j] == 0)
                            sum += b[j][p[j] - 1];
                    }
                    min = Math.min(min, sum);
                }
                System.out.println(min);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // System.out.println(combine(100,2));
    }

}

