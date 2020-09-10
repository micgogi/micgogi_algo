import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 8/14/2020  2:40 PM
 * Rahul Gogyani
 */
public class TESTTECH {
    static class Employee {
        String name;
        int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    public static void main(String args[]) {
//        FastReader sc = new FastReader();
//        String s = "ABCDEFG";
//        System.out.println(chekcChar(s));
        //       reverseString("Manyata is a tech park");
//        System.out.println(lcs("ANKITA","ANKIQW"));
//        for (int i = indexi, j= indexj; i >=1&&j>=1 ; i--,j--) {
//            System.out.println("ANKITA".charAt(i-1));
//        }
//        Employee employee = new Employee("Ankita",200000);
//        Employee employee1 = new Employee("Rahul",2083);
//        List<Employee> list = Arrays.asList(employee,employee1);
//        list.stream().filter(emp->emp.salary>20000).forEach(emp->System.out.println(emp.name));
        //       System.out.println( calseq(1,100,34));
        // 1 2 3 4 5 4 3 2
        // int a[] = {-1,-2,100,-4,-3,-2,2,1};
        // System.out.println(maxSubarraySum(a));
//        int a[] = {1,-2,-3,-4,5};
//        System.out.println(maxSum(a,0,a.length));
//        int a[] = {1, 2, 3, 6, 6, 6};
//        System.out.println(subarraysumequaltok(a, 6));
//        int a[] = {4,5,0,-2,-3,1};
//        int k =  5;
//        System.out.println(subarraysumdivisblebyk(a,5));
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,8);
//        List<Integer> outputList = new ArrayList<>();
//        int size = list.size();
//        for (int i = 0; i <size-1 ; i+=2) {
//            outputList.add(list.get(i)+list.get(i+1));
//        }
//
//        System.out.println(outputList);
        int a[] = {1,2,2};
        System.out.println(subsets(a));



    }
    private static List<List<Integer>> subsets(int a[]){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(a);
        backtrack(result,new ArrayList<Integer>(),a,0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, ArrayList<Integer> templIst, int[] a, int start) {
        result.add(new ArrayList<>(templIst));
        for (int i = start; i <a.length ; i++) {
            templIst.add(a[i]);
            backtrack(result,templIst,a,i+1);
            templIst.remove(templIst.size()-1);
        }
    }


    static int dp[] = new int[10];
    static boolean[] visited = new boolean[10];

    public static int maxSum(int a[], int i, int n) {
        if (i >= n) return 0;
        if (visited[i]) return dp[i];
        visited[i] = true;
        dp[i] = Math.max(maxSum(a, i + 1, n), a[i] + maxSum(a, i + 2, n));
        return dp[i];

    }

    public static int subarraysumdivisblebyk(int a[], int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int res = 0;
        for (int i = 0; i <a.length ; i++) {
            sum = (sum+a[i])%k;
            if(sum<0)sum+=k;
            res += map.getOrDefault(sum,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
    public static int subarraysumequaltok(int a[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ;
        map.put(0, 1);
        int cursum = 0;
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            cursum += a[i];

            res += map.getOrDefault(cursum - k, 0);

            map.put(cursum, map.getOrDefault(cursum, 0) + 1);
        }
        return res;
    }

    //    public static long calseq(int i, int j, int k){
//        int inceNo = j-i+1;
//        double sum1 =((1.0*inceNo)/2)*(2*i+(inceNo-1));
//        int inceNo2 = j-k;
//        double sum2 = (1.0*inceNo2/2)*(2*k+(inceNo2-1));
//        System.out.println(sum1);
//        System.out.println(sum2);
//        return (long)(sum1+sum2);
//    }
    private static int maxSubarraySum(int a[]) {
        int sum = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            sum = Math.max(a[i], a[i] + sum);
            max = Math.max(sum, max);
        }
        return max;
    }

    static int indexi = 0;
    static int indexj = 0;

    private static int lcs(String s, String w) {
        int res = Integer.MIN_VALUE;
        int[][] dp = new int[s.length() + 1][w.length() + 1];
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= w.length(); j++) {
                if (s.charAt(i - 1) == w.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    res = Math.max(res, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        // System.out.println(Arrays.deepToString(dp));

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j <= w.length(); j++) {
                if (dp[i][j] == res) {
                    indexj = j;
                    indexi = i;
                }
            }
        }
        return res;
    }

    private static List<Integer> spiralMatrix(int[][] matrix) {
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        List<Integer> res = new ArrayList<>();
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for (int i = rowBegin; i <= rowEnd; i++) {
                res.add(matrix[i][colEnd]);
            }
            colEnd--;
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    res.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    res.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return res;
    }

    private static void reverseString(String s) {
        int j = s.length() - 1;
        while (j >= 0) {
            if (s.charAt(j) == ' ') {
                j--;
                continue;
            }
            int i = s.lastIndexOf(' ', j);
            System.out.print(s.substring(i + 1, j + 1) + " ");
            j = i - 1;
        }
    }

    private static boolean chekcChar(String s) {
        int c[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (c[s.charAt(i)]++ == 1) {
                return true;
            }
        }
        return false;
    }

    private static String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len = Math.max(expandAroundCenter(s, i, i), expandAroundCenter(s, i, i + 1));
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left;
        int R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static int[] findtarget(int a[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(target - a[i])) {
                return new int[]{a[i], target - a[i]};
            } else {
                map.put(a[i], i);
            }
        }
        return new int[]{-1, -1};
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

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }
    }

}

