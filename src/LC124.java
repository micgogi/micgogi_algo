/**
 * @author Micgogi
 * on 4/29/2020  2:35 PM
 * Rahul Gogyani
 */
public class LC124 {
    static Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;

        }
    }
    public static void main(String[] args) {
        root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        System.out.println(maxPathSum(root));
    }
    static int max =0;
    public static int maxPathSum(Node root){
        max = Integer.MIN_VALUE;
        return  Math.max(pathsum(root),max);
    }
    public static int pathsum(Node root){
        if(root==null)return 0;

        int left = Math.max(pathsum(root.left),0);
        int right = Math.max(pathsum(root.right),0);
        max = Math.max(root.data+left+right,max);
        return Math.max(root.data+left,root.data+right);
    }
}
