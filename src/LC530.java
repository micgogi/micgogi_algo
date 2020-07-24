import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/24/2020  5:54 PM
 * Rahul Gogyani
 */
public class LC530 {
    static Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    public static void main(String args[]) {
      root = new Node(1);
      root.right = new Node(3);
      root.right.left = new Node(2);
        System.out.println(getMinimumDifference(root));

    }
    static int min = Integer.MAX_VALUE;
   static Integer prev = null;
    public static int getMinimumDifference(Node root) {
        if(root==null)return min;
        getMinimumDifference(root.left);
        if(prev!=null) {
            min = Math.min(min,root.data-prev);
        }
        prev = root.data;
        getMinimumDifference(root.right);
        return min;
    }
}




