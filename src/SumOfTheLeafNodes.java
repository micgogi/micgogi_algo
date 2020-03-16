/*
 *@author Rahul Gogyani

 *
 * 11:34 AM 3/3/2020
 */

public class SumOfTheLeafNodes {
    static Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    static int sum =0;
    public static void calSum(Node temp){
        if(temp==null)return;
        if(temp.left==null&&temp.right==null){
            sum+=temp.data;
        }
        calSum(temp.left);
        calSum(temp.right);

    }
    public static void main(String[] args) {
        root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left.left = new Node(1);
        root.left.right = new Node(-6);
        root.left.left.left = new Node(2);
        root.left.left.right = new Node(9);
        root.right.left = new Node(0);
        root.right.right = new Node(-4);
        calSum(root);
        System.out.println(sum);

    }
}
