import java.util.ArrayList;
import java.util.List;

/**
 * @author Micgogi
 * on 4/20/2020  11:22 AM
 * Rahul Gogyani
 */
public class LC257 {
    static Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
  static   StringBuilder sb = new StringBuilder();
    static List<String> ls = new ArrayList<>();
    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        binaryTreePaths(root, sb, ls);
        System.out.println(ls);

    }

    public static void binaryTreePaths(Node root, StringBuilder sb, List<String> ls) {
        if(root==null){
            return;
        }

        if(root.left==null&& root.right==null){
            ls.add(sb.append(root.data).toString());
            return;
        }
       if(root.left!=null){
           String prev = sb.toString();
        binaryTreePaths(root.left,sb.append(root.data),ls);
        sb = new StringBuilder(prev);
       }
       if(root.right!=null){
        binaryTreePaths(root.right,sb.append(root.data),ls);

       }
    }
}
