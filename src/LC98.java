/*
 *@author Rahul Gogyani

 *
 * 10:00 AM 3/5/2020
 */

public class LC98 {
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
        root = new Node(4);
        root.left = new Node(1);
        root.right = new Node(3);
        System.out.println(check(root));
    }
    public static boolean checkBst(Node root, long min, long max) {
        if (root == null) return true;
        if (root.data < min || root.data >= max) {
            return false;
        }
        return checkBst(root.left,min,root.data)&&checkBst(root.right,root.data,max);
    }
    public static boolean check(Node root){
       long min = Long.MIN_VALUE;
       long max = Long.MAX_VALUE;
       return checkBst(root,min,max);
    }
}

