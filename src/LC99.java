import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/16/2020  1:18 PM
 * Rahul Gogyani
 */
public class LC99 {
    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String args[]) {
        FastReader sc = new FastReader();
        root = new Node(1);
        root.left = new Node(3);
        root.left.right = new Node(2);
        recoverTree(root);
    }
    public static void recoverTree(Node root){
        Node pre = null;
        Node first = null;
        Node second = null;
        Node current = root;
        while (current!=null){
            //left is null then print the node and go to right node
            if (current.left == null){
                System.out.println(current.data+" ");
                if(pre!=null&&pre.data>current.data){
                    if(first==null){
                        first = pre;
                        second = current;
                    }else{
                        second = current;
                    }
                }
                pre = current;
                current = current.right;
            }else{
                //find the predecessor
                Node predecessor = current.left;
                //to find predecessor keep going right till right node is not null or current
                while (predecessor.right!=current&&predecessor.right!=null){
                    predecessor = predecessor.right;
                }
                //if right node is null then go left after establishing link from predecessor to current
                if(predecessor.right==null){
                    predecessor.right = current;
                    current = current.left;
                }else{
                    //left is already visited. go right after visiting current
                    predecessor.right = null;
                    System.out.println(current.data+" ");
                    if(pre!=null&&pre.data>current.data){
                        if(first==null){
                            first = pre;
                            second = current;
                        }else{
                            second = current;
                        }
                    }
                    pre = current;
                    current = current.right;
                }
            }

        }
        System.out.println(first.data);
        System.out.println(second.data);
        if(first!=null&&second!=null){
            int temp = first.data;
            first.data = second.data;
            second.data = temp;
        }
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

