import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Micgogi
 * on 7/9/2020  12:50 PM
 * Rahul Gogyani
 */
public class LC662 {
    static Node root;
    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
            root = new Node(1);
            root.left = new Node(3);
            root.right = new Node(2);
            root.left.left = new Node(5);
            root.right.right = new Node(9);
            root.left.left.left = new Node(6);
            root.right.right.right = new Node(7);
        System.out.println( maximumWidthOfBinaryTree(root));


    }

    public static int maximumWidthOfBinaryTree(Node root){
        Queue<Node> q = new LinkedList<>();
        Queue<Integer> index = new LinkedList<>();
        q.add(root);
        index.add(1);
        int max =0;
        while (!q.isEmpty()){
          int size = q.size();
          int start =0, end =0;

            for (int i = 0; i <size ; i++) {


                Node node = q.poll();
               int in = index.poll();
               if(i==0)start= in;
               if(i==size-1)end = in;

                if(node.left!=null){
                    q.add(node.left);
                    index.add(2*in);
                }
                if(node.right!=null){
                    q.add(node.right);
                    index.add(2*in+1);
                }

            }
           max = Math.max(max,end-start+1);

        }
        return max;
    }
}
