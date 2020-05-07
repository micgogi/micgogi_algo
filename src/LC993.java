/**
 * @author Micgogi
 * on 5/7/2020  2:40 PM
 * Rahul Gogyani
 */
public class LC993 {
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
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        System.out.println(isCousins(root,2,3));
    }
    public static boolean isCousins(Node root, int x, int y) {
        return depth(root,x)==depth(root,y)&&parent(root,x)!=parent(root,y);
    }
    public static int depth(Node root, int data){
        if(root==null)return Integer.MIN_VALUE;
        if(root.data==data) return 0;

        return 1+Math.max(depth(root.left,data),depth(root.right,data));
    }
    public static Node parent(Node root,int data){
        if(root==null) return null;
        if(root.left!=null&&root.left.data==data)return root;
        if(root.right!=null&&root.right.data==data)return root;

        Node left = parent(root.left,data);
        if(left!=null)return left;
        return parent(root.right,data);

    }

}
