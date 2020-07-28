import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/28/2020  10:26 AM
 * Rahul Gogyani
 */
public class LC116Pract1 {
    static Node root;

    static class Node {
        int val;
        Node left;
        Node right;
        Node next;

        public Node(int data) {
            this.val = data;
        }
    }

    public static void main(String args[]) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        connect(root);


    }

    public static Node connect(Node root) {
        if (root == null) return null;
        if (root.left == null && root.right == null) return root;
        if(root.left!=null && root.right!=null){
            root.left.next = root.right;
            if(root.next!=null){
                root.right.next = root.next.left;
            }else {
                root.right.next = null;
            }
        }
        connect(root.left);
        connect(root.right);
        return root;
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
    }

}

