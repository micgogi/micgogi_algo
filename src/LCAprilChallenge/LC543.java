package LCAprilChallenge;

/**
 * @author Micgogi
 * on 4/11/2020  2:18 PM
 * Rahul Gogyani
 */
public class LC543 {
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
        root  = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        height(root);
        System.out.println(max);


    }
    static int max=0;
    public static int height(Node root){
        if(root==null)return 0;
        int left = height(root.left);
        int right = height(root.right);
        max = Math.max(max,left+right);
        return 1+Math.max(left,right);

    }


}
