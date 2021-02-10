import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 2/10/2021  9:53 PM
 * Rahul Gogyani
 */
public class LC138 {
   static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

    /*
      Our clone map. We map the original node to its clone.
      This is the key to the problem, from here all else
      is simple linear time iteration.
    */
        Map<Node, Node> cloneMap = new HashMap<Node, Node>();

        // 1st pass: Give all nodes their clone in the mapping.
        Node curr = head;
        while (curr != null) {
            cloneMap.put(curr, new Node(curr.val));
            curr = curr.next;
        }

    /*
      2nd pass.
      Reset the curr pointer to the head of the original list
      Give all clones their next and random pointer assignments.
      Our cloneMap lets us reach an original node's clone in
      O(1) time.
    */
        curr = head;
        while (curr != null) {
      /*
        cloneMap.get(curr).next -> Set the next of curr's clone to...
        cloneMap.get(curr.next) -> The clone of curr's next.
      */
            cloneMap.get(curr).next = cloneMap.get(curr.next);

      /*
        cloneMap.get(curr).random -> Set the random of curr's clone to...
        cloneMap.get(curr.random) -> The clone node that curr.random is pointing to.
      */
            cloneMap.get(curr).random = cloneMap.get(curr.random);

            curr = curr.next;
        }

        // Return the clone node of the head. This is the caller's access to the newly copied list.
        return cloneMap.get(head);
    }
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
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

        int[][] read2DArray(int n) {
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }

        int[][] read2DArray(int n, int m) {
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }
    }

}

